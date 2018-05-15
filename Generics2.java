/*
*  Created by
*  @Author Avanish Patel
*/

public class Generics2 {
	
	// generic method demo
	
	public static <E> void printArray(E[] elements) {
		
		for(E element : elements) {
			System.out.print(element+", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer array[] = {12,23,45,12,34};
		
		printArray(array);
		
		Character chararray[] = {'a','c','t','u','m'};
		printArray(chararray);
		
		
	}

}
