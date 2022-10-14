package org.example;

public class InternFactory implements AbstractFactory {
    @Override
    public SalaryCalculator createSalaryCalculator() {
        return new InternSalaryCalculator();
    }

    @Override
    public VacationCalculator createVacationCalculator() {
        return new InternVacationCalculator();
    }
}
