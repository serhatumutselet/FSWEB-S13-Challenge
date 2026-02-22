package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.developerNames = developerNames;
        setGiro(giro);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro negatif olamaz. 0 olarak ayarlandi.");
            this.giro = 0;
            return;
        }
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (developerNames == null) {
            System.out.println("Developer listesi tanimli degil.");
            return;
        }

        if (index < 0 || index >= developerNames.length) {
            System.out.println("Gecersiz index: " + index);
            return;
        }

        if (developerNames[index] == null) {
            developerNames[index] = name;
            return;
        }

        System.out.println("Bu index dolu: " + index);
    }

    @Override
    public String toString() {
        return "Company{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", giro=" + giro +
            ", developerNames=" + Arrays.toString(developerNames) +
            '}';
    }
}

