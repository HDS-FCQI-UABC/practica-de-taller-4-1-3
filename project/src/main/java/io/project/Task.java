package io.project;

import java.util.*;

public class Task {
    private String name;
    private ArrayList<Employee> theEmployees;
    private ArrayList<Resource> theResources;

    public Task(String name, ArrayList<Employee> theEmployees, ArrayList<Resource> theResources){
        this.name = name;
        this.theEmployees = theEmployees;
        this.theResources = theResources;
    }

    public Task(){}

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

    public ArrayList<Resource> getTheResources() {
        return theResources;
    }

    public void setTheResources(ArrayList<Resource> theResources) {
        this.theResources = theResources;
    }
    
    
}
