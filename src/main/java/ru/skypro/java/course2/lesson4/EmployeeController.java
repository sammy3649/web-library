package ru.skypro.java.course2.lesson4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String add(@RequestParam String firstName, @RequestParam String lastName) {
        Employee result = employeeService.add(firstName, lastName);
        return generateMessage(result, "add");
}
    @GetMapping("/delete")
    public String delete(@RequestParam String firstName, @RequestParam String lastName) {
        Employee result = employeeService.delete(firstName, lastName);
        return generateMessage(result, "delete");
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.find(firstName, lastName);
    }

    private String generateMessage(Employee employee,String status) {
        return String.format("Employee %s %s %s.",
                employee.getFirstName(),
                employee.getFirstName(),
                status);
}}