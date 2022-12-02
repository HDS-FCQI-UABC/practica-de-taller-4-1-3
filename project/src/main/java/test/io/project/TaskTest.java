package test.io.project; 

import io.project.Employee;
import io.project.Project;
import io.project.Resource;
import io.project.Task;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/** 
* Task Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 10, 2022</pre> 
* @version 1.0 
*/ 
public class TaskTest { 

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
 Task task = new Task();
 task.setName("US Payroll");
 String expected = "US Payroll";
 assertEquals(expected, task.getName());
} 

/** 
* 
* Method: setName(String name) 
* 
*/ 
@Test
public void testSetName() throws Exception {
    Task task = new Task();
    task.setName("US Payroll");
    String expected = "US Payroll";
    assertEquals(expected, task.getName());
} 

/** 
* 
* Method: getTheEmployees() 
* 
*/ 
@Test
public void testGetTheEmployees() throws Exception {
    ArrayList<Employee> employees = new ArrayList<Employee>();
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    employee1.setName("Scott");
    employee2.setName("Connor");
    employees.add(0, employee1);
    employees.add(1, employee2);

    Task task = new Task();
    task.setTheEmployees(employees);
    assertEquals(employees, task.getTheEmployees());
} 

/** 
* 
* Method: setTheEmployees(ArrayList<Employee> theEmployees) 
* 
*/ 
@Test
public void testSetTheEmployees() throws Exception {
    ArrayList<Employee> employees = new ArrayList<Employee>();
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    employee1.setName("Scott");
    employee2.setName("Connor");
    employees.add(0, employee1);
    employees.add(1, employee2);

    Task task = new Task();
    task.setTheEmployees(employees);
    assertEquals(employees, task.getTheEmployees());
} 

/** 
* 
* Method: getTheResources() 
* 
*/ 
@Test
public void testGetTheResources() throws Exception {
    ArrayList<Resource> resourcesList = new ArrayList<Resource>();
    Resource resource1 = new Resource("Connor");
    Resource resource2 = new Resource("Kaleigh");
    resourcesList.add(0, resource1);
    resourcesList.add(1, resource2);

    Task task = new Task();
    task.setTheResources(resourcesList);
    assertEquals(resourcesList, task.getTheResources());
} 

/** 
* 
* Method: setTheResources(ArrayList<Resource> theResources) 
* 
*/ 
@Test
public void testSetTheResources() throws Exception {
    ArrayList<Resource> resourcesList = new ArrayList<Resource>();
    Resource resource1 = new Resource("Connor");
    Resource resource2 = new Resource("Kaleigh");
    resourcesList.add(0, resource1);
    resourcesList.add(1, resource2);

    Task task = new Task();
    task.setTheResources(resourcesList);
    assertEquals(resourcesList, task.getTheResources());
} 


} 
