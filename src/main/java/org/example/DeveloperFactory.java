package org.example;

public class DeveloperFactory implements AbstractFactory {
    @Override
    public SalaryCalculator createSalaryCalculator() {
        return new DeveloperSalaryCalculator();
    }

    @Override
    public VacationCalculator createVacationCalculator() {
        return new DeveloperVacationCalculator();
    }
}
