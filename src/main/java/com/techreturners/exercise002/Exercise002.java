package com.techreturners.exercise002;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

    public int past(int h, int m, int s) {
        // Your code here!
    	
    	//Convert hours to milliseconds
    	int hoursinMillis = h * 60 * 60 * 1000;
    	//Convert minutes to milliseconds
    	int minsinMillis = m * 60 * 1000;
    	//Convert seconds to milliseconds
    	int secsinMillis = s * 1000;
    	
    	// Add up the time in milliseconds
    	int timeinmillis = hoursinMillis + minsinMillis + secsinMillis ;
    	return timeinmillis ;
    }
}