import java.util.*;
import java.io.*;

class Zoho34
{
static int match(String str1,String str2)
{
return str1.indexOf(str2);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first String  : ");
String str1=sc.next();
System.out.println("Enter the second String  : ");
String str2=sc.next();
int res = match(str1,str2);
System.out.println("OUTPUT " + res);
}
}
