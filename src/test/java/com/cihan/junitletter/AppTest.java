package com.cihan.junitletter;

import com.cihan.junit.CihanKursJUnit.HarfBulmaca;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest    extends TestCase
{

    public void testSesliHarfler()
    {
        HarfBulmaca ltrFnd = new HarfBulmaca();
        int donenSesli =ltrFnd.kacSesli("www.turkish.com");
        Assert.assertEquals(3,donenSesli);
    }

    public void testSessizHarfler()
    {
        HarfBulmaca ltrFnd = new HarfBulmaca();
        int donenSessiz =ltrFnd.kacSessiz("www.turkish.com");
        Assert.assertEquals(12, donenSessiz);
    }
}
