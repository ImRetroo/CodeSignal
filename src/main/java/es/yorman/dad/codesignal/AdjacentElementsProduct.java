package es.yorman.dad.codesignal;

import java.util.ArrayList;
import java.util.Collections;

public class AdjacentElementsProduct {
	
	int solution(int[] inputArray) {
	    ArrayList<Integer> results = new ArrayList<>();

		for(int i = 0; i < inputArray.length - 1; i++) {
		    results.add(inputArray[i] * inputArray[i+1]);
		}

		Collections.sort(results);
		return results.get(results.size()-1);
	}
}
