package ru.skypro.java.course2.lesson4;

public interface EmployeeService {
    Employee add(String firstName, String lastName);

    Employee add(Employee employee);

    Employee delete(String firstName, String lastName);

    Employee delete(Employee employee);

    Employee find(String firstName, String lastName);
}
