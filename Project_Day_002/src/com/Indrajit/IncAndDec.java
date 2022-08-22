package com.Indrajit;

public class IncAndDec {

	public static void main(String[] args) {
		
		int a=10;
		
		System.out.println(a); //10
		
		System.out.println(a++);//10 //post-increment => (print, increase)
		
		System.out.println(++a);//12
		
		System.out.println(a--);//12
		
		System.out.println(--a);//10
		
		System.out.println(a);//10
		
		int b=5;
		
		System.out.println(++b - ++b);  //-1
		
		int c=5;
		
		System.out.println((--c+--c)*(++c-c--)+(--c+c--)*(++c+c++)); //16

	}

}
