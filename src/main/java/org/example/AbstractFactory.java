package org.example;

public interface AbstractFactory {
    SalaryCalculator createSalaryCalculator();
    VacationCalculator createVacationCalculator();
}
