package HM2_4.calculator.muraito.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double getAdditionCalculator(double num1, double num2) {
        return num1 + num2;
    }

    public double getSubtractionCalculator(double num1, double num2) {
        return num1 - num2;
    }

    public double getMultiplicationCalculator(double num1, double num2) {
        return num1 * num2;
    }

    public double getDivisionCalculator(double num1, double num2) {
        return num1 / num2;
    }
}
