package test.io.project; 

import io.project.Task;
import io.project.WorkBreakdownStructure;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/** 
* WorkBreakdownStructure Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 10, 2022</pre> 
* @version 1.0 
*/ 
public class WorkBreakdownStructureTest { 

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
    Task task1 = new Task();
    Task task2 = new Task();
    ArrayList<Task> taskList = new ArrayList<Task>();
    WorkBreakdownStructure work = new WorkBreakdownStructure("1.1.1", taskList);
    String nameExpected = "1.1.1";
    assertEquals(nameExpected, work.getName());
} 

/** 
* 
* Method: setName(String name) 
* 
*/ 
@Test
public void testSetName() throws Exception {
    Task task1 = new Task();
    Task task2 = new Task();
    ArrayList<Task> taskList = new ArrayList<Task>();
    WorkBreakdownStructure work = new WorkBreakdownStructure();
    String name = "1.1.1";
    work.setName(name);
    assertEquals(name, work.getName());
} 

/** 
* 
* Method: getTheTasks() 
* 
*/ 
@Test
public void testGetTheTasks() throws Exception {
    Task task1 = new Task();
    Task task2 = new Task();
    ArrayList<Task> taskList = new ArrayList<Task>();
    WorkBreakdownStructure work = new WorkBreakdownStructure("1.1.1", taskList);
    assertEquals(taskList, work.getTheTasks());
} 

/** 
* 
* Method: setTheTasks(ArrayList<Task> theTasks) 
* 
*/ 
@Test
public void testSetTheTasks() throws Exception {
    Task task1 = new Task();
    Task task2 = new Task();
    ArrayList<Task> taskList = new ArrayList<Task>();
    WorkBreakdownStructure work = new WorkBreakdownStructure("1.1.1", taskList);
    work.setTheTasks(taskList);
    assertEquals(taskList, work.getTheTasks());
} 


} 
