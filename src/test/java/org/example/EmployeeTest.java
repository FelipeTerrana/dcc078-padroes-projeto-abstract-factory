package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void mustCalculateDeveloperSalary() {
        AbstractFactory factory = new DeveloperFactory();
        Employee employee = new Employee(factory, 40);

        assertEquals(16000.0, employee.calculateSalary());
    }

    @Test
    void mustCalculateDeveloperVacationDaysPerYear() {
        AbstractFactory factory = new DeveloperFactory();
        Employee employee = new Employee(factory, 40);

        assertEquals(20, employee.calculateVacationDaysPerYear());
    }
    @Test
    void mustCalculateInternSalary() {
        AbstractFactory factory = new InternFactory();
        Employee employee = new Employee(factory, 30);

        assertEquals(7200.0, employee.calculateSalary());
    }

    @Test
    void mustCalculateInternVacationDaysPerYear() {
        AbstractFactory factory = new InternFactory();
        Employee employee = new Employee(factory, 30);

        assertEquals(30, employee.calculateVacationDaysPerYear());
    }
}