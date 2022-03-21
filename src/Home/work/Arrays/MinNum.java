package Home.work.Arrays;
import java .util.*;
public class MinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring array size
		int arr[] = new int[10];
		//Scanner class for user input
		Scanner sc = new Scanner(System.in);
		//array numbers given by user
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//keeping max as array of index 0
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		
System.out.println("Minimum number is:"+min);
	}

}
