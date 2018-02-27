package com.example.testNG.testNGThreads.testConfigurations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import com.example.testNG.testNGThreads.testBaseClass;

public class GroupOne extends testBaseClass {
    
    private final static Logger logger = LoggerFactory.getLogger(GroupOne.class);
    
    @BeforeGroups(groups = { "group1" }, alwaysRun = true)
    public void beforeGroupMethod() throws Exception {
        logger.info("-----@beforeGroups for group group1 begin-----");
    
        logger.info("-----@beforeGroups for test group group1 end-----");
    }
    
    @AfterGroups(groups = { "group1" }, alwaysRun = true)
    public void afterGroupMethod() throws Exception {
        // commenting out to examine why this isn't logged -- maybe a static problem?
        //TestUtilities.displayAfterGroupBannerBegin("simNodes");
        logger.info("-----@afterGroups for test group group1 begin-----");

        
        logger.info("-----@afterGroups for test group group1 end-----");

    }
    

    @AfterClass(groups = { "group1" })
    public void afterClass() throws InterruptedException {
        logger.info("-----@afterClass for test group group1 begin-----");
        logger.info("-----@afterClass for test group group1 end-----");
    }

    @BeforeClass(groups = { "group1" })
    public void beforeClass() throws InterruptedException, Exception {
        logger.info("-----@beforeClass for test group group1 begin-----");
        logger.info("-----@beforeClass for test group group1 end-----");
    }
    
}
