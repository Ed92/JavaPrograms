package com.company;

public class Main {

    public static void main(String[] args) {
	boolean isAlien = false;
	if (isAlien == true)
        System.out.println("This is not an Alien!");

	boolean isCar = false;
	if (isCar == true)
        System.out.println("This is not supposed to happen");


	double twenty = 20;
	double eighty = 80;
	double hundred = twenty + eighty * 25;
	double remainder = hundred % 40;
	if (remainder <= 20)
        System.out.println("Total was over the limit");
    }
}
