package com.erikdjamgarian;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 1;
	    switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Vale is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("is a 3 or a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char alphabet = 'C';

	    switch(alphabet) {
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D':
                System.out.println("Value is D");
                break;
            case 'E':
                System.out.println("Value is E");
                break;
            default:
                System.out.println("Not found");
                break;
        }
        switch(alphabet) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The Value was " + alphabet);
        }
    }
}
