package org.example;

public class InternVacationCalculator implements VacationCalculator {
    private static final int VACATION_DAYS = 30;
    @Override
    public int calculateDaysPerYear(Employee employee) {
        return VACATION_DAYS;
    }
}
