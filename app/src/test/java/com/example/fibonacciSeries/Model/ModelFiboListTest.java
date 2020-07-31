package com.example.fibonacciSeries.Model;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class ModelFiboListTest {


    @Test
    public void getFiboList() {
        BigInteger n1 = new BigInteger("1");
        BigInteger n2 = new BigInteger("1");
        BigInteger n3;
        n3=n1.add(n2);
        assertEquals(n3,n1.add(n2));
    }

}