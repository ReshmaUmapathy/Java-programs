import java.util.*;
import java.io.*;

class Zoho31 
{ 
    static void splitString(String str) 
    { 
		int c_flag = 0,n_flag = 0,count = 0;
		String res = new String();
        StringBuffer alpha = new StringBuffer();
		int num=0;
          
        for (int i=0; i<str.length(); i++) 
        {   
			if(Character.isAlphabetic(str.charAt(i))) 
			{
                alpha.append(str.charAt(i));
				c_flag = 1;
			}
            else if(Character.isDigit(str.charAt(i)))
			{			
                num = (int)(str.charAt(i)) - 48; 
				n_flag = 1;
				
				while(((i+1)!= str.length())&& Character.isDigit(str.charAt(i+1)))
				{
					i=i+1;
					num = num * 10;
					num = num + ((int)str.charAt(i)-48);
				}
			}
			else {
				continue;
			}
		
				if(c_flag == 1 && n_flag == 1)
				{
					for(int j=0;j<num; j++)
					{
					res = res + alpha ;
					}
					c_flag =0;
					n_flag=0;
				}
				
				if(c_flag == 0 && n_flag ==0)
				{
				alpha.delete(0,alpha.length());
				num = 0;
				}
        } 
		System.out.println(res);
      
    } 
      
    // Driver method 
    public static void main(String args[]) 
    { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression : " );
        String str = sc.next(); 
        splitString(str); 
    } 
}
