package com.Indrajit;

public class DoWhile {

	public static void main(String[] args) {
		
		/*
		    1.While loop is not giving any guarantee to execute loop body minimum one time.dowhile loop will give guarantee to execute loop 			body minimum one time.
		    2. In case of while, first, conditional expression will be executes, if it returns true then only loop body will be executed. In case of 			do-while loop, first loop body will be executed then condition will be executed.
			3. In case of while loop, condition will be executed for the present iteration.In case of do-while loop, condition will be executed 			for the next iteration.
		*/
		
		int i=0;
		
		do
			
		{
			
		System.out.println(i);
		
		i=i+1;
		
		}
		
		while (i<10);

	}

}
