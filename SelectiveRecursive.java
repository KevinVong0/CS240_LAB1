import java.util.Arrays;

public class SelectiveRecursive {

	public static void main(String[] args)  {
		int DEFAULT_SIZE=10;
		int array[] = new int[DEFAULT_SIZE];
		fillArray(array);
		System.out.println("Array before sorting:");
		printArray(array);
		Sort(array,0);
		System.out.println("Array after sorting:");
		printArray(array);
	}
	public static int[] Sort(int[] array,int startIndex) {
		if (startIndex >= array.length - 1) { // base case if i >= the last number of array
			return array;
			}
		else {
			int min = startIndex; // make startIndex the min
			for (int i = startIndex + 1;i < array.length;i++) {
				if(array[i] < array[min]) // if next number is greater than min
					min = i; // min = i
			}
		int smallerNum = array[min]; // swap numbers 
		array[min] = array[startIndex];
		array[startIndex] = smallerNum;
		return Sort(array,startIndex+1);
		}
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
