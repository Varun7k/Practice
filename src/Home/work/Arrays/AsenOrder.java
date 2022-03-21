package Home.work.Arrays;

import java.util.*;

public class AsenOrder {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {// Dsending order keep '>'  9 if((arr[i].compareToarr[j])>0) > for Acsending 
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Ascending order :" + arr[i]);
		}

	}
}
