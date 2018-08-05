import java.util.*;
import java.io.*;

class Zoho35
{
static void merge(int[] arr1 , int[] arr2)
{
int count=0,i,j,max,min;
int flag =0;
int l1 = arr1.length;
int l2 = arr2.length;
for(i=0;i<l1;i++)
{
for(j=0;j<l2;j++)
{
if(arr1[i]==arr2[j])
{
flag = 1;
}
}
if(flag==1)
{
	flag = 0;
}
else
{
count++;
}
}
if(l1>l2)
{
	max = l1;
	min = l2;
}
else{
	max= l2;
	min=l1;
}

int n1 = (max - min)+count;
int n2 = n1 + min;
int[] arr3 = new int[n2];

for(i=0;i<n2;i++)
{
arr3[i]=0;
}

for(i=0;i<l1;i++)
{
	arr3[i] = arr1[i];
}
int k=l1;
for(i=0;i<l2;i++)
{

	for(j=0;j<l1;j++)
	{
		if(arr2[i] == arr1[j])
		{
			flag = 1;
		}
	}
	if(flag == 0)
	{
		arr3[k]=arr2[i];
		k++;
	}
	else{
		flag=0;
	}
}

for(i=0;i<n2;i++)
{
	for(j=0;j<n2;j++)
	{
		if(arr3[i]<arr3[j])
		{
			int temp = arr3[j];
			arr3[j] = arr3[i];
			arr3[i] = temp;
		}
	}
}
System.out.println("MERGED ARRAY ");
for(i=0;i<n2;i++)
{
System.out.println(arr3[i]);
}

}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers in array 1 : ");
int l1 = sc.nextInt();
int[] arr1 = new int[l1];
int i;
System.out.println("Enter the elements of array 1 : ");
for(i=0;i<l1;i++)
{
 arr1[i]= sc.nextInt();
}
System.out.println("Enter the numbers in array 2 : ");
int l2 = sc.nextInt();
int[] arr2 = new int[l2];
System.out.println("Enter the elements of array 2 : ");
for(i=0;i<l2;i++)
{
 arr2[i]= sc.nextInt();
}
merge(arr1,arr2);
}
}
