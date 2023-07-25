package com.SuperCalculator.CalcProgram.apiTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.SuperCalculator.CalcProgram.api.CommonUtil;

public class CommonUtilTest {

    @Test
    public void adderTest()
    {
        CommonUtil obj = new CommonUtil();
        assertEquals("The number didn't add correctly",10,obj.adder(7,3));
    }
}
