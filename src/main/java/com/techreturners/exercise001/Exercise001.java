package com.techreturners.exercise001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

    public int singles(int [] arr){
        // Add your code here!
    	
    	int sum = 0;
    	int currVal = 0;
    	//int tracker = 0;
    	List<Integer> intList = new ArrayList<Integer>(arr.length);
    	for (int i : arr)
    	{
    	    intList.add(i);
    	}        
        //System.out.println(list);
    	int occurence = 0;
    	ListIterator<Integer> listIterator = intList.listIterator();
   	 
    	while(listIterator.hasNext()) {
    		currVal = listIterator.next();
    		occurence = Collections.frequency(intList, currVal);
    		if (occurence == 1) 
    				sum = sum + currVal;
    	   // System.out.println(listIterator.next());
    	}
    	System.out.println(sum);		
    	
        return sum;
    }
}
