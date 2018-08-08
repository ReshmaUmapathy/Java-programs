import java.util.*;
import java.io.*;

public class Balance_paranthesis  
{ 
    static class stack  
    { 
        int top=-1; 
        char items[] = new char[100]; 
  
        void push(char x)  
        { 
            if (top == 99)  
            { 
                System.out.println("Stack full"); 
            }  
            else 
            { 
                items[++top] = x; 
            } 
        } 
  
        char pop()  
        { 
            if (top == -1)  
            { 
                System.out.println("Underflow error"); 
                return '\0'; 
            }  
            else 
            { 
                char element = items[top]; 
                top--; 
                return element; 
            } 
        } 
  
        boolean isEmpty()  
        { 
            if(top == -1)
			{
				return true;
			}				
			else
				return false;
        } 
    } 
    static boolean isMatchingPair(char character1, char character2) 
    { 
       if (character1 == '(' && character2 == ')') 
         return true; 
       else if (character1 == '{' && character2 == '}') 
         return true; 
       else if (character1 == '[' && character2 == ']') 
         return true; 
       else
         return false; 
    } 
    static boolean areParenthesisBalanced(String exp) 
    {
       stack st=new stack(); 
       for(int i=0;i<exp.length();i++) 
       { 
            char s = exp.charAt(i);
          if (s == '{' || s == '(' || s == '[') 
            st.push(s); 
   
          if (s== '}' || s== ')' || s== ']') 
          {
             if (st.isEmpty()) 
               { 
                   return false; 
               }  
             else if ( !isMatchingPair(st.pop(), s) ) 
               { 
                   return false; 
               } 
          } 
            
       }      
       if (st.isEmpty()) 
         return true; 
       else
         {  
             return false; 
         }  
    }  
    public static void main(String[] args)  
    { 
	Scanner sc = new Scanner(System.in);
        String exp= sc.next();
          if (areParenthesisBalanced(exp)) 
            System.out.println("Balanced "); 
          else
            System.out.println("Not Balanced ");   
    } 
  
}
