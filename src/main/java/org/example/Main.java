package org.example;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        Healthplan healthplan = new Healthplan(1, "Saglik Paketi", org.example.enums.Plan.BASIC);
        System.out.println(healthplan);

        Employee employee = new Employee(
            10,
            "Ayse Yilmaz",
            "ayse@example.com",
            "secret123",
            new String[3]
        );
        employee.addHealthPlan(0, "BASIC");
        employee.addHealthPlan(1, "PREMIUM");
        System.out.println(employee);

        Company company = new Company(
            100,
            "Acme Yazilim",
            500_000,
            new String[3]
        );
        company.addEmployee(0, "Ayse Yilmaz");
        company.addEmployee(1, "Mehmet Demir");
        System.out.println(company);
    }
}