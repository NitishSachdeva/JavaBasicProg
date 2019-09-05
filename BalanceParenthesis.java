
package basicprogques;

import java.util.Stack;
  import java.util.*;
public class BalanceParenthesis {

	public static boolean isValid(String str)
	{
		String Open="{[(",Close="}])" ;
		
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(Open.indexOf(str.charAt(i))>=0)
			
				st.push(str.charAt(i));
			
			if(Close.indexOf(str.charAt(i))>=0)
			{
				if(st.size()>0)
				{
					if(!(isParanthesisMatch(st.pop(),str.charAt(i))))
					return false;
				}
				else
				{
					return false;
				}
			}
			}
                
		return true;
	}
        

	public static boolean isParanthesisMatch(char c1,char c2)
	{
		if(c1=='[' && c2==']')
		{	
			return true;
		}
		if(c1=='(' && c2==')')
		{
			return true;
		}
		if(c1=='{' && c2=='}')
		{
		 return true;
		}
		
		return false;

		}
	
public static void main(String args[])
{
	String str="{()}{[()]}";
	
	System.out.println(isValid(str));
	}
}    

