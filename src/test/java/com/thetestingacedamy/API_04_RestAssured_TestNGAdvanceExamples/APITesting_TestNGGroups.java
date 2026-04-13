package com.thetestingacedamy.API_04_RestAssured_TestNGAdvanceExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_TestNGGroups {

    @Test(groups = {"sanity"})
    public void test_sanityRun() {
        System.out.println("Sanity");
        Assert.assertTrue(true);
    }

    @Test(groups = {"sanity","reg"})
    public void test_sanityReg() {
        System.out.println("Sanity");
        System.out.println("reg");
        Assert.assertTrue(true);
    }

    @Test(groups = {"reg"})
    public void test_regRun() {
        System.out.println("Reg");
        Assert.assertTrue(true);
    }

    @Test(groups = {"regNew"})
    public void test_regNew() {
        System.out.println("regNew");
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke"})
    public void test_smokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(true);
    }



}
