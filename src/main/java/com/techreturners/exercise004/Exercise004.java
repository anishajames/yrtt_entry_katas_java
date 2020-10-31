package com.techreturners.exercise004;

public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        // Add your code here
		 int length = 0;
		 String addendum = null;
		 String recreatedString = null; 
		 char[] arr = null;
		 char punct = ' ';
    	
		 //Extract words from input message 
		 String [] tokens = str.split("[\\s]");
		 //Loop through each word 
		 for(String s:tokens){
        	length = s.length();
        	// Create a new character array that will store each letter in the word excluding the first
            arr = new char[length-1];
            //loop to store each character in the array
            for (int i=0; i<length - 1; i++){ 
              	// Check for punctuation 
            	if (Character.isLetter(s.charAt(i+1)))
            		arr[i] = s.charAt(i+1);
            	else 
            		punct = s.charAt(i+1);
            }
            if (punct == ' ')
            	recreatedString = new String(arr) + s.charAt(0) + "ay";
            else {
            	StringBuilder sb = new StringBuilder();
        		sb.append(new String(arr));
        		//remove the space caused by the punctuation
        		sb.deleteCharAt(arr.length-1);
        		recreatedString = sb.toString() + s.charAt(0) + "ay" + punct;
            }
            if (addendum == null)
            	addendum = recreatedString;
            else
            	addendum = addendum + " " + recreatedString; 
        }
        //System.out.println(addendum);
        return addendum;
    }
}
