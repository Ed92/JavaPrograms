package com.company;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 5;
	float myFloatValue = 5f / 2f;
	double myDoubleValue = 5d / 2d;
	System.out.println("myIntValue = " + myIntValue);
	System.out.println(myFloatValue);
	System.out.println(myDoubleValue);

	double numberOfPounds = 200d;
	double convertedKiloGrams = numberOfPounds * 0.45359237d;
		System.out.println("Kilograms = " + convertedKiloGrams);
    }
}
