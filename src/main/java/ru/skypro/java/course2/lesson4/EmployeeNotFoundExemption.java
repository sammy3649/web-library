package ru.skypro.java.course2.lesson4;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundExemption extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Not found";

    public EmployeeNotFoundExemption() {
        super(DEFAULT_MESSAGE);
    }
}
