package io.project;

import java.util.ArrayList;

public class Project{
    private String name;
    private ArrayList<Resource> theResources;
    private ArrayList<Employee> theEmployees;
    private WorkBreakdownStructure theWorkBreakdownStructure;

    public Project(String name, ArrayList<Resource> theResources, ArrayList<Employee> theEmployees, WorkBreakdownStructure theWorkBreakdownStructure) {
        this.name = name;
        this.theResources = theResources;
        this.theEmployees = theEmployees;
        this.theWorkBreakdownStructure = theWorkBreakdownStructure;
    }

    public Project() {}


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Resource> getTheResources() {
        return theResources;
    }


    public void setTheResources(ArrayList<Resource> theResources) {
        this.theResources = theResources;
    }


    public ArrayList<Employee> getTheEmployees() {
        return theEmployees;
    }


    public void setTheEmployees(ArrayList<Employee> theEmployees) {
        this.theEmployees = theEmployees;
    }


    public WorkBreakdownStructure getTheWorkBreakdownStructure() {
        return theWorkBreakdownStructure;
    }


    public void setTheWorkBreakdownStructure(WorkBreakdownStructure theWorkBreakdownStructure) {
        this.theWorkBreakdownStructure = theWorkBreakdownStructure;
    }

}