package io.project;

import java.util.ArrayList;

public class Employee {
    private String name;
    private ArrayList<Employee> theEmployees;

    public Employee(String name, ArrayList<Employee> theEmployees) {
        this.name = name;
        this.theEmployees = theEmployees;
    }

    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getTheEmployees() {
        return theEmployees;
    }

    public void setTheEmployees(ArrayList<Employee> theEmployees) {
        this.theEmployees = theEmployees;
    }
}
