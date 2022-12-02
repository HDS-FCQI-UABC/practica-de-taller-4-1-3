package test.io.project; 

import io.project.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/** 
* Employee Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 10, 2022</pre> 
* @version 1.0 
*/ 
public class EmployeeTest { 

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
    String expected = "Scott";
    Employee employee = new Employee();
    employee.setName("Scott");
    assertEquals(expected, employee.getName());
} 

/** 
* 
* Method: setName(String name) 
* 
*/ 
@Test
public void testSetName() throws Exception {
    String expected = "Scott";
    Employee employee = new Employee();
    employee.setName("Scott");
    assertEquals(expected, employee.getName());
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

    Employee employeeList = new Employee();
    employeeList.setTheEmployees(employees);

    Employee employeeExpectedList = new Employee();
    employeeExpectedList.setTheEmployees(employees);

    assertEquals(employeeList.getTheEmployees(), employeeExpectedList.getTheEmployees());
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

    Employee employeeList = new Employee();
    employeeList.setTheEmployees(employees);

    Employee employeeExpectedList = new Employee();
    employeeExpectedList.setTheEmployees(employees);

    assertEquals(employeeList.getTheEmployees(), employeeExpectedList.getTheEmployees());
} 


} 
