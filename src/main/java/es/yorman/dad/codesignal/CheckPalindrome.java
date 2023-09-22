package es.yorman.dad.codesignal;

public class CheckPalindrome {

	boolean solution(String inputString) {
	    String firstString = inputString.replaceAll(" ", "").toLowerCase();

	    return firstString.equals(new StringBuffer(firstString).reverse().toString());
	}
	
}
