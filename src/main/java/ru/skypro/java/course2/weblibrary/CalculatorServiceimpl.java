package ru.skypro.java.course2.weblibrary;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceimpl implements CalculatorService{
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }


}
