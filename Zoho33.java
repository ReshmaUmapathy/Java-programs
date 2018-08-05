import java.util.*;
import java.io.*;

class Zoho33
{
static void matrix(String str)
{
int len = str.length();
String rev= " ";
String[][] arr = new String[len][len];
int i,j;
for(i=0;i<len;i++)
{
for(j=0;j<len;j++)
{
arr[i][j]= " ";
}
}
i=0;


for(i=0;i<len;i++)
{
	for(j=0;j<len;j++)
	{
		if(i==j)
		{
			char c=str.charAt(i);
			String s = Character.toString(c);
			arr[i][j]=s;
		}
	}
}


i=0;
j=0;
int k=0;
int m=len-1;
for(i=len-1;i>=0;i--)
{
	for(j=0;j<len;j++)
	{
		if(j==k && i==m)
		{
			char d=str.charAt(j);
			String si = Character.toString(d);
			arr[i][j]=si;
			k++;
			m--;
		}
	}
}


//loop for printing the matrix:
for(i=0;i<len;i++)
{
for(j=0;j<len;j++)
{
System.out.print(arr[i][j]);
}
System.out.println();
}
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the word : ");
String str =sc.next();
matrix(str);
}
}
