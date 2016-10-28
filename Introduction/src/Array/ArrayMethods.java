package Array;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args){
		int[] arr = {2,3,4,6,9,11,12,15};
		swap(arr, 0 , arr.length - 1);
		shuffle(arr);
		if(checkHalfway(arr, 12, 0, arr.length - 1)){
			System.out.println("The number you are searching for is less than the value in the middle of the array");
		}else{
			System.out.println("The number you are searching for is greater than or equal to the value in the middle of the array");
		}
		int[] array = {3,9,6,11,14,16};
		int[] subArr = getSubArray(array, 2, 4);
		contains(array, subArr);
	}
	private static void generateRandArray (int[] randArr, int[] arr){
		for(int i = 0; i < randArr.length; i++){
			randArr[i] = (1 + (in
		}
	}
	private static int[] getSubArray(int[] array, int startIndex, int endIndex) {
		int[] subArray = new int[endIndex - startIndex + 1];
		for(int i = 0; i < subArray.length; i++){
			subArray[i] = array[startIndex + i];
		}
		return subArray;
	}
	private static boolean contains(int[] arr, int[] subArray) {
		for(int i = 0; i < arr.length; i++){
				int j = 0;
				while(j < arr.length){
					if(subArray[j] == arr[i + j] && j == subArray.length){
						System.out.println("Match at " + i);
						return true;
					}else if(subArray[j] != arr[i + j]){
						System.out.println("No match at " + i);
						break;
					}
					j++;
				}
		}
		return false;
	}
	private static int countUnderBound(double[] array, double d) {
		int n = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] < d){
				n++;
			}
		}
		return n;
	}
	private static void cycleOnce(int[] array) {
		for(int i = (array.length - 1); i > 0; i--){
			swap(array, 0, i);
		}
	}
	private static void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			int random = (int)(Math.random() * arr.length);
			swap(arr, i, random);
		}
		
	}
	private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
	}
/**
 * returns true if searchValue is less than element
 * halfway between  beginning and end
 * @param arr the int[] to be searched
 * @param i
 * @param j
 * @param length
 */
	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
		return searchValue < arr[(begin + end + 1) / 2];
		
	}
}
