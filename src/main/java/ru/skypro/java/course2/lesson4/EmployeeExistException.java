package ru.skypro.java.course2.lesson4;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeExistException extends RuntimeException {
    public EmployeeExistException() {
        super("Employee already contained");
    }
}
