import java.io.*;
import java.util.*;

class Zoho36
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Sentence to be reversed : ");
String str = sc.nextLine();
String[] arr = str.split(" ");
String res ="";
int n = arr.length;
for(int i=n-1;i>=0;i--)
{
res = res + arr[i];
res = res + " ";
}
System.out.println(res);
}
}
