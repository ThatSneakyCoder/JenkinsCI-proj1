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

    @Test
    public void subtractorTest()
    {
        CommonUtil obj = new CommonUtil();
        assertEquals("The number didn't add correctly",-4,obj.subtractor(7,3));
    }

    @Test
    public void dividerTest()
    {
        CommonUtil obj = new CommonUtil();
        assertEquals("The number didn't add correctly",2,obj.divider(7,3));
    }

    @Test
    public void multiplyerTest()
    {
        CommonUtil obj = new CommonUtil();
        assertEquals("The number didn't add correctly",21,obj.multiplyer(7,3));
    }
}
