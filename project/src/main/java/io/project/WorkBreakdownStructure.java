package io.project;

import java.util.*;

public class WorkBreakdownStructure {
    private String name;
    private ArrayList<Task> theTasks;

    public WorkBreakdownStructure(String name, ArrayList<Task> theTasks){
        this.name = name;
        this.theTasks = theTasks;
    }

    public WorkBreakdownStructure(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getTheTasks() {
        return theTasks;
    }

    public void setTheTasks(ArrayList<Task> theTasks) {
        this.theTasks = theTasks;
    }
    
}
