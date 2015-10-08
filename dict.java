package newTest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class dict {

	public static void main(String[] ar) {

		HashMap<Integer, Stack<String>> dd=new HashMap<Integer,Stack<String>>();
		Stack<String> st=new Stack<String>();
boolean bStop=true;
		do
		{

			System.out.println("Please enter the key");
			Scanner scKey=new Scanner(System.in);
			
			int ky=scKey.nextInt();
			System.out.println("Please enter the value");
			Scanner sc2Value=new Scanner(System.in);
			String strVal=sc2Value.next();
			
			if(dd.get(ky)==null)
			{
				st=new Stack<String>();
				st.add(strVal);
			}
			else
			{
				st=dd.get(ky);
				st.add(strVal);
			}
			dd.put(ky, st);
			for(Integer ssw : dd.keySet())
			{
				Stack<String> ss=dd.get(ssw);
				for(String f:ss)
				{
					System.out.println("Stack Out:"+ f+" Key:"+ssw);
				}
			}
			System.out.println("Do you want to continue? true/false");
			Scanner sc2Exit=new Scanner(System.in);
			bStop=sc2Exit.nextBoolean();
		}		
		while (bStop);
	}
}
