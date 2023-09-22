package es.yorman.dad.codesignal;

public class CheckPalindrome {

	boolean solution(String inputString) {
	    String firstString = inputString.replaceAll(" ", "").toLowerCase();
	    String secondString = "";
	    
	    for(int i = firstString.length() - 1; i >= 0; i--) {
	        secondString += firstString.charAt(i);
	    }
	    
	    return firstString.equals(secondString);
	}
	
}
