package org.ConditionStatement;

import java.util.Scanner;

public class IfElseElseIf {
	
	public static void main(String[] args) {
		Scanner IfElseElseIf = new Scanner(System.in);
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			for(int k=5; k>=i;k--)	
			{
				if(k==4)
				{
					System.out.println(" Enter the Input");
					String symbol = IfElseElseIf.next();
					System.out.print(symbol);
				}
				else if(k==2)
				{
					System.out.print("*");
				}
				else {
			System.out.print(k);
			}
			
			}
		
			System.out.println();
	}

	}
}
