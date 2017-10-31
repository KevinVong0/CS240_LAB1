import java.util.Arrays;

public class InsertionIterative {

	public static void main(String[] args)  {
		int DEFAULT_SIZE=10;
		int array[] = new int[DEFAULT_SIZE];
		fillArray(array);
		System.out.println("Array before sorting:");
		printArray(array);
		Sort(array);
		System.out.println("Array after sorting:");
		printArray(array);
	}
	
	public static int[] Sort(int[] array) {

		int smallerNum;
		for (int i = 1; i < array.length;i++) {  //start at i and increment till end of array
			for(int j = i; j > 0; j--) { // start from j and decrement till beginning of array
				if(array[j] < array[j-1]) { // if the previous num is smaller than j, swap
					smallerNum = array[j];
					array[j] = array[j-1];
					array[j-1] = smallerNum;
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
