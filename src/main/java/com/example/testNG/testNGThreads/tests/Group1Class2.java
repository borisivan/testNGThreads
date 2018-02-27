package com.example.testNG.testNGThreads.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.example.testNG.testNGThreads.testConfigurations.GroupOne;

public class Group1Class2 extends GroupOne {

    private final static Logger logger = LoggerFactory.getLogger(Group1Class2.class);
    
    @Test(timeOut = 240000, groups = { "group1", "sanity" })
    public void group1Class1Test2() throws Exception {
        logger.info("this is from group1Class1Test2");
    }
    
}
