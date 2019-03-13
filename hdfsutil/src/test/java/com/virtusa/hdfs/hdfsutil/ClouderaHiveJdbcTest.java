/**
 * 
 */
package com.virtusa.hdfs.hdfsutil;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author pshankar
 *
 */
public class ClouderaHiveJdbcTest {
	
	ClouderaHiveJdbc cjdbc = new ClouderaHiveJdbc();
	
	@Test
	public void testGetenv() throws Exception {
		assertEquals("env details are", cjdbc.getenv());
	}
	
	@Test
	public void test_get_HIVE_HOST() throws Exception {
		assertEquals("192.168.1.227", cjdbc.get_HIVE_HOST());
	}
	
	
	
	/*
	
	 //Test method for {@link com.virtusa.hdfs.hdfsutil.ClouderaHiveJdbc#main(java.lang.String[])}.
	
	@Test
	
	public void testMain() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	
	//Test method for {@link java.lang.Object#getClass()}.

	@Test
	public void testGetClass() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	
	// Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 
	@Test
	public void testEquals() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	
	 // Test method for {@link java.lang.Object#toString()}.
	
	@Test
	public void testToString() throws Exception {
		throw new RuntimeException("not yet implemented");
	}
	*/

}
