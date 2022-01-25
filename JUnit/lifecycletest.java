package JUnit;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import LamdaExpressions.operations;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class lifecycletest {
	lifecycle mt;
	
	@BeforeAll
	  void before()
	{
		System.out.println("before all the instaces created");
	}
	@AfterAll
	void after()
	{
		System.out.println("after all instaces it should be run");
	}
	
	@BeforeEach
	void init()
	{
		mt=new lifecycle();
	}
	
	@AfterEach
	void clean()
	{
		System.out.println("cleaning after ecah instace");
	}

	@Test
	void test() {
		System.out.println("HelloWorld");
		
		
		int expected=2;
        int actual=mt.add(1,1);
		assertEquals(expected,actual);
		
		
	}
	@Test
	void test1()
	{
		assertEquals( 1256.6370614359173,mt.circle(20),"enter correct radios");
		
	}

	
}


