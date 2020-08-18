package com.smartkindergarten.smartkindergarten.entries;

import java.io.Serializable;

public class ProductTest implements Serializable{
    private String testName;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionfour;
    private String forResult;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    public String getOptionfour() {
        return optionfour;
    }

    public void setOptionfour(String optionfour) {
        this.optionfour = optionfour;
    }

    public String getForResult() {
        return forResult;
    }

    public void setForResult(String forResult) {
        this.forResult = forResult;
    }

    public ProductTest() {
    }

    public ProductTest(String testName, String optionOne, String optionTwo, String optionThree, String optionfour, String forResult) {
        this.testName = testName;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionfour = optionfour;
        this.forResult = forResult;
    }
}

