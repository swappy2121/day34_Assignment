package com.Bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestingTheData {

    @Test
    public void givenUpdatedData_shouldRetrieve_correctRecords() {
        try {
            UpdatingData check = new UpdatingData();
            String expected = check.reteriveData();
            Assert.assertEquals("3000000",expected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}