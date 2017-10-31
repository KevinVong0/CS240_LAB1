/*
 * 
 * @author Kevin Vong
 * @version 1.0
 * 
 */

import java.util.*;

public class SelectiveSort {
	

	
	public static void main(String[] args)  {
		int DEFAULT_SIZE=1000;
		int array[] = new int[DEFAULT_SIZE];
		fillArray(array);
		System.out.println("Array before sorting:");
		printArray(array);
		SelectiveSort(array);
		System.out.println("Array after sorting:");
		printArray(array);
	}
	public static int[] SelectiveSort(int[] array) {
		for(int i = 0; i < array.length;i++) {
			for(int j = i + 1; j < array.length;j++) {
				int min = i;
				if (array[i] > array[j]) {
					min = j;
					
					int smallerNum = array[min];
					array[min] = array[i];
					array[i] = smallerNum;
				}	
			}
		}
		return array;
		
	}
	public static void fillArray(int[] array) {
		for (int i = 0; i <array.length;i++) {
			array[i] = (int)(Math.random() *100);
		}
	}
	
	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}

}