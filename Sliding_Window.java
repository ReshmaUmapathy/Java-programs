import java.util.*;
import java.io.*;

class Sliding_Window{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i,max=0,j;
System.out.println("Enter the number of elements in an array : ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements of the array : ");
for(i=0;i<n;i++)
{
arr[i] = sc.nextInt();
}

System.out.println("Enter the sliding window size : ");
int k = sc.nextInt();
for(i=0;i<=n-k;i++)
{
max = -1;
for(j=0;j<k;j++)
{
if(arr[i+j]>max)
{
max = arr[i+j];
}
}
System.out.print(max);
}

}
}
