import java.util.*;
import java.io.*;

class Zoho32
{

static void Dec_sort(int[] arr , int start , int end )
{
int i,j,flag=0;
do{
	for(i=start; i < end-2 ; i=i+2 )
	{
		flag =0 ;
		if(arr[i] < arr[i+2])
		{
			flag = 1;
			int temp = arr[i];
			arr[i] = arr[i+2];
			arr[i+2] = temp ; 
		}
	}
}while(flag == 1);
}

static void Asc_sort(int[] arr , int start , int end )
{
int i,j,flag=0;
do{
	for(i=start; i < end-2 ; i=i+2 )
	{
		flag =0 ;
		if(arr[i] > arr[i+2])
		{
			flag = 1;
			int temp = arr[i];
			arr[i] = arr[i+2];
			arr[i+2] = temp ; 
		}
	}
}while(flag == 1);
}

public static void main(String args[])
{
int n,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements : ");
n = sc.nextInt();
int[] a = new int[n];
System.out.println("Enter the elements : ");
for(i=0;i<n;i++)
{
a[i] = sc.nextInt();
}
for(i=0 ; i < n ; i++){
Asc_sort(a , 1 , n-1);
Dec_sort(a , 0 , n);
}
System.out.println();
System.out.println("RESULT :");
for(i=0;i<n;i++)
{
	System.out.println(a[i]);
}
}
}
