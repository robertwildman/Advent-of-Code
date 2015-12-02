package main;

import java.util.Scanner;

public class Task1 {
	//Program Worked
	public static void main(String[] args) {
		//Main Task 1
		//Working out how much paper the elfs will need
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int finalscore = 0;
		while(input.isEmpty() == false){
			int l = Integer.parseInt(input.split("x")[0]);
			int w = Integer.parseInt(input.split("x")[1]);
			int h = Integer.parseInt(input.split("x")[2]);
			//Find the lowest number to add for extra 
			int newscore = Math.min((l*w), Math.min((w*h), (h*l)));
			finalscore = finalscore + 2*(l*w) + 2*(w*h) + 2*(h*l)+newscore;
			input = in.nextLine();
		}
		System.out.println(finalscore);
	}

}
