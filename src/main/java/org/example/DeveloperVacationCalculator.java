package org.example;

public class DeveloperVacationCalculator implements VacationCalculator {
    private static final int DEFAULT_VACATION_DAYS = 20;
    private static final int DEFAULT_HOURS_PER_WEEK = 40;
    @Override
    public int calculateDaysPerYear(Employee employee) {
        double multiplier = (double) employee.getWorkHoursPerWeek() / DEFAULT_HOURS_PER_WEEK;
        return (int) (DEFAULT_VACATION_DAYS * multiplier);
    }
}
