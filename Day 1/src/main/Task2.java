package main;

import java.util.Scanner;

public class Task2 {

	//Program Passed
		public static void main(String[] args) {
			//Main Task 2
			//Task is to work out when he first enter the basement 
			//Read the input
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			//Work out how many ( and how many ) there are
			int open = 0;
			int closed = 0;
			for(int i =0; i < input.length();i++)
			{
				if(String.valueOf(input.charAt(i)).equals("("))
				{
					open++;
				}else
				{
					closed++;
				}
				//Test if in the basement 
				if((open-closed) < 0)
				{
					//In basement at pos 
					System.out.println(i+1);
					//Close loop 
					i = input.length();
				}
			}
			//Print the answer
			System.out.println((open-closed));
		}

	}

