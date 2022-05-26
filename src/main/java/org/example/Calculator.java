package org.example;

public class Calculator {

    public void factorial(int deez){
        if(deez<0) {
            throw new IllegalArgumentException("sup");
        }

    }
    public void binomialCoefficient(int setSize, int subsetSize){
        if(setSize<0 || subsetSize <0 || subsetSize>setSize)
            throw new IllegalArgumentException("hey, how ya doin");

    }
}
