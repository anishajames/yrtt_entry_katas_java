package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exercise003 {

    // Scenario
    // Several people are standing in a row divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1, 
    // and so on.

    // Task
    // Given an array of positive integers (the weights of the people), return a new array/tuple of two integers, where the first one is the total weight of 
    // team 1, and the second one is the total weight of team 2.

    // Notes
    // Array size is at least 1.
    // All numbers will be positive.
    // Input >> Output Examples
    // rowWeights([13, 27, 49])  ==>  return (62, 27)
    // Explanation:
    // The first element 62 is the total weight of team 1, and the second element 27 is the total weight of team 2.

    // rowWeights([50, 60, 70, 80])  ==>  return (120, 140)
    // Explanation:
    // The first element 120 is the total weight of team 1, and the second element 140 is the total weight of team 2.

    // rowWeights([80])  ==>  return (80, 0)
    // Explanation:
    // The first element 80 is the total weight of team 1, and the second element 0 is the total weight of team 2.

    public static int[] rowWeights(final int[] weights) {
        // Your code here!
    	
    	int loopNum = 0;
    	int team1 = 0;
    	int team2 = 0;
    	int currVal = 0;
    	
    	// Convert the input array to an arrayList
     	List<Integer> intList = new ArrayList<Integer>(weights.length);
    	for (int i : weights)
    	{
    	    intList.add(i);
    	}        

    	//Create an iterator to iterate through the arrayList
     	ListIterator<Integer> listIterator = intList.listIterator();
   	
    	//Iterate through the arrayList to sum up the alternate numbers into each team
    	while(listIterator.hasNext()) {
    		currVal = listIterator.next();
    		if(loopNum % 2 == 0)
    			team1 = team1 + currVal;
    		else
    			team2 = team2 + currVal;
    		loopNum++;
    	}	
    	//System.out.println(team1 + "," + team2);
        return new int[]{team1, team2};
    
    }
}