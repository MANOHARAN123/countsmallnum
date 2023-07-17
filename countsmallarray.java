package Countsmallestarray;
import java.util.Scanner;
import java.util.Arrays;
public class Countsmallestarray {

public static int[] Small(int arr[],int n) {
		
		int a[]=new int[arr.length];
		for(int i=0;i<n;i++) {
			a[i]=0;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					a[i]++;
				}
			}
		
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] value=Small(arr,n);
		System.out.println(Arrays.toString(value));

	}

}
