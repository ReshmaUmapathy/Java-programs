import java.util.*;
import java.io.*;
class Zoho_3{
static int Compute(int n)
{
int[] a = new int[n];
int id1=1,count=0,i;
while(id1<=n){
for(i=id1;i<=n;i=i+id1)
{
if(a[i-1]==0)
{
a[i-1]=1;
}
else
{
a[i-1]=0;
}
if((i+id1)>n)
{
	break;
}
}
id1++;
}
for(i=0;i<n;i++)
{
if(a[i]==1)
{
count++;
}
}
return count;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students : ");
int n = sc.nextInt();
int open=Compute(n);
int close=n-open;
System.out.println("Open : " +open + " Closed : " +close);
}
}
