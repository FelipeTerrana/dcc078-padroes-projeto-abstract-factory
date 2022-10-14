package org.example;

public class Employee {
    private SalaryCalculator salaryCalculator;
    private VacationCalculator vacationCalculator;
    private int workHoursPerWeek;

    public Employee(AbstractFactory factory, int workHoursPerWeek) {
        this.salaryCalculator = factory.createSalaryCalculator();
        this.vacationCalculator = factory.createVacationCalculator();

        this.workHoursPerWeek = workHoursPerWeek;
    }

    public double calculateSalary() {
        return this.salaryCalculator.calculate(this);
    }

    public int calculateVacationDaysPerYear() {
        return this.vacationCalculator.calculateDaysPerYear(this);
    }

    public int getWorkHoursPerWeek() {
        return workHoursPerWeek;
    }

    public void setWorkHoursPerWeek(int workHoursPerWeek) {
        this.workHoursPerWeek = workHoursPerWeek;
    }
}
