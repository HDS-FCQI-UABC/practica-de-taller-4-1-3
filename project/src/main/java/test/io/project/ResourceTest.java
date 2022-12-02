package test.io.project; 

import io.project.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/** 
* Resource Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 10, 2022</pre> 
* @version 1.0 
*/ 
public class ResourceTest { 

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
    Resource resource = new Resource("Frank");
    String expected = "Frank";
    assertEquals(expected, resource.getName());
} 

/** 
* 
* Method: setName(String name) 
* 
*/ 
@Test
public void testSetName() throws Exception { 
    Resource resource = new Resource();
    resource.setName("Laurie");
    String expected = "Laurie";
    assertEquals(expected, resource.getName());
} 


} 
