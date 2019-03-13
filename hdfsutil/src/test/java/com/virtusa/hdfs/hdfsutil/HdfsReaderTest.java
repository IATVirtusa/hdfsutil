package com.virtusa.hdfs.hdfsutil;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class HdfsReaderTest extends TestCase {

	HdfsReader hfs = new HdfsReader();
	
	public HdfsReaderTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testHdfsreadergetenv()
	{
	assertEquals("env details are", hfs.getenv());
	}

	
}
