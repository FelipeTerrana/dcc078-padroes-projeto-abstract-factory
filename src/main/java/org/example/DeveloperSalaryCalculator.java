package org.example;

public class DeveloperSalaryCalculator implements SalaryCalculator {
    private static final double PRICE_PER_HOUR = 100;

    @Override
    public double calculate(Employee employee) {
        return employee.getWorkHoursPerWeek() * PRICE_PER_HOUR * 4;
    }
}
