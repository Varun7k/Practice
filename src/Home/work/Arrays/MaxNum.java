package Home.work.Arrays;

import java.util.*;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		for(int i =0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
System.out.println("Maximum number is: "+max);

	}

}
