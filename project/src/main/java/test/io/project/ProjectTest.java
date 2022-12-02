package test.io.project; 

import io.project.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/** 
* Project Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 10, 2022</pre> 
* @version 1.0 
*/ 
public class ProjectTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getName() 
* 
*/ 
@Test
public void testGetName() throws Exception { 
    Project project = new Project();
    project.setName("Project Name");
    String result = project.getName();
    String expected = "Project Name";
    assertEquals(expected, result);
} 

/** 
* 
* Method: setName(String name) 
* 
*/ 
@Test
public void testSetName() throws Exception {
    Project project = new Project();
    project.setName("Project Name");
    String result = project.getName();
    String expected = "Project Name";
    assertEquals(expected, result);
} 

/** 
* 
* Method: getTheResources() 
* 
*/ 
@Test
public void testGetTheResources() throws Exception {
    Project project = new Project();
    ArrayList<Resource> resourcesList = new ArrayList<Resource>();
    Resource resource1 = new Resource("Connor");
    Resource resource2 = new Resource("Kaleigh");
    resourcesList.add(0, resource1);
    resourcesList.add(1, resource2);
    project.setTheResources(resourcesList);
    assertEquals(project.getTheResources(), resourcesList);
} 

/** 
* 
* Method: setTheResources(ArrayList<Resource> theResources) 
* 
*/ 
@Test
public void testSetTheResources() throws Exception {
    Project project = new Project();
    ArrayList<Resource> resourcesList = new ArrayList<Resource>();
    Resource resource1 = new Resource("Connor");
    Resource resource2 = new Resource("Kaleigh");
    resourcesList.add(0, resource1);
    resourcesList.add(1, resource2);
    project.setTheResources(resourcesList);
    assertEquals(project.getTheResources(), resourcesList);
} 

/** 
* 
* Method: getTheEmployees() 
* 
*/ 
@Test
public void testGetTheEmployees() throws Exception {
    Project project = new Project();
    ArrayList<Employee> employeesList = new ArrayList<Employee>();
    Employee employee1 = new Employee();
    employee1.setName("Kaleigh");
    Employee employee2 = new Employee();
    employee1.setName("Connor");
    employeesList.add(0, employee1);
    employeesList.add(1, employee2);
    project.setTheEmployees(employeesList);
    assertEquals(project.getTheEmployees(), employeesList);
} 

/** 
* 
* Method: setTheEmployees(ArrayList<Employee> theEmployees) 
* 
*/ 
@Test
public void testSetTheEmployees() throws Exception {
    Project project = new Project();
    ArrayList<Employee> employeesList = new ArrayList<Employee>();
    Employee employee1 = new Employee();
    employee1.setName("Kaleigh");
    Employee employee2 = new Employee();
    employee1.setName("Connor");
    employeesList.add(0, employee1);
    employeesList.add(1, employee2);
    project.setTheEmployees(employeesList);
    assertEquals(project.getTheEmployees(), employeesList);
} 

/** 
* 
* Method: getTheWorkBreakdownStructure() 
* 
*/ 
@Test
public void testGetTheWorkBreakdownStructure() throws Exception {
    Project project = new Project();

    ArrayList<Employee> employeesList = new ArrayList<Employee>();
    Employee employee1 = new Employee();
    employee1.setName("Kaleigh");
    Employee employee2 = new Employee();
    employee1.setName("Connor");
    employeesList.add(0, employee1);
    employeesList.add(1, employee2);
    project.setTheEmployees(employeesList);



    ArrayList<Resource> resourcesList = new ArrayList<Resource>();
    Resource resource1 = new Resource("Connor");
    Resource resource2 = new Resource("Kaleigh");
    resourcesList.add(0, resource1);
    resourcesList.add(1, resource2);
    project.setTheResources(resourcesList);


    Task task1 = new Task("Canada Payroll", employeesList, resourcesList);
    ArrayList<Task> taskList = new ArrayList<Task>();
    taskList.add(task1);
    WorkBreakdownStructure work = new WorkBreakdownStructure("1.1.1", taskList);
    project.setTheWorkBreakdownStructure(work);

    assertEquals(work, project.getTheWorkBreakdownStructure());
}

/** 
* 
* Method: setTheWorkBreakdownStructure(WorkBreakdownStructure theWorkBreakdownStructure) 
* 
*/ 
@Test
public void testSetTheWorkBreakdownStructure() throws Exception {
    Project project = new Project();

    ArrayList<Employee> employeesList = new ArrayList<Employee>();
    Employee employee1 = new Employee();
    employee1.setName("Kaleigh");
    Employee employee2 = new Employee();
    employee1.setName("Connor");
    employeesList.add(0, employee1);
    employeesList.add(1, employee2);
    project.setTheEmployees(employeesList);



    ArrayList<Resource> resourcesList = new ArrayList<Resource>();
    Resource resource1 = new Resource("Connor");
    Resource resource2 = new Resource("Kaleigh");
    resourcesList.add(0, resource1);
    resourcesList.add(1, resource2);
    project.setTheResources(resourcesList);


    Task task1 = new Task("Canada Payroll", employeesList, resourcesList);
    ArrayList<Task> taskList = new ArrayList<Task>();
    taskList.add(task1);
    WorkBreakdownStructure work = new WorkBreakdownStructure("1.1.1", taskList);
    project.setTheWorkBreakdownStructure(work);

    assertEquals(work, project.getTheWorkBreakdownStructure());
}


} 
