package org.example;

public class InternSalaryCalculator implements SalaryCalculator {
    private static final double PRICE_PER_HOUR = 60;
    @Override
    public double calculate(Employee employee) {
        return Math.min(employee.getWorkHoursPerWeek(), 30) * PRICE_PER_HOUR * 4;
    }
}
