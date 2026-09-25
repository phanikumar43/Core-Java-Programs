//Date:-25-09-2026
//Lab Experiment
/*
1. write a Java Program to Find the Leader elements in an Array 
Input:- arr[] = {12,3,7,9,6,3,1};
Output:- 12,9,6,3,1
 */
public class LeaderElement {

	public static void main(String[] args) {
		int arr[] = { 12, 3, 7, 9, 6, 3, 2, 1 };
		int check = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			boolean set=true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					set = false;
					break;
				}
			}
			if(set) {
				System.out.println("Array Elements Are: "+arr[i]);
			}
			
		}
	}
}