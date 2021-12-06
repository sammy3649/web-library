package ru.skypro.java.course2.lesson4;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Employee[] employees;
    private int size;

    public EmployeeServiceImpl() {
        employees = new Employee[10];
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        return add(employee1);
    }

    @Override
    public Employee add(Employee employee) {
        if (size == employees.length) {
            throw new EmployeeBookOverFlowException();
        }

        int index = indexOf(employee);

        if (index != -1) {
            throw new EmployeeExistException();
        }
        employees[size++] = employee;
        return employee;
    }

    @Override
    public Employee delete(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        return delete(employee1);
    }

    @Override
    public Employee delete(Employee employee) throws EmployeeNotFoundExemption {
        int index = indexOf(employee);
        if (index != -1) {
            Employee result = employees[index];
            System.arraycopy(employees, index + 1, employees, index, size - index);
            size--;
            return result;
        }
        throw new EmployeeNotFoundExemption();
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        int index = indexOf(employee1);
        if (index != -1) {
            return employees[index];
        }
        throw new EmployeeBookOverFlowException();
    }

    private int indexOf(Employee employee) {
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(employee)) {
                return i;
            }
        }
        return -1;
    }
}
