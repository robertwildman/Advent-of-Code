package main;

import java.util.Scanner;

public class Task2 {

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
		
			int firstlow = Math.min(l, Math.min(w, h));
			int secondlow;
			if(firstlow == l)
			{
				secondlow = Math.min(w,h);
			}else if(firstlow == w)
			{
				secondlow = Math.min(l,h);
			}else
			{
				secondlow = Math.min(w,l);
			}
			
			finalscore = finalscore + (firstlow*2+secondlow*2)+(l*w*h);
			input = in.nextLine();
		}
		System.out.println(finalscore);
	}
}
