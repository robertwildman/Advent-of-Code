package main;

import java.util.Scanner;

public class Task1 {
	//Program Passed!
	public static void main(String[] args) {
		//Main Task 1
		//Task is to work out what floor santa
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
		}
		//Print the answer
		System.out.println((open-closed));
	}

}
