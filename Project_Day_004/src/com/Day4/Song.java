package com.Day4;

public class Song {
	
	String artist;
	
	String title;
	
	void play() {
		
		System.out.println(artist +" is singing "+ title);
		
	}

	public static void main(String[] args) {

		Song track1 = new Song();
		
		track1.play(); //null is singing null
		
		track1.artist = "Arijit"; //This is String object
		
		track1.title = "Dekho Aloy Alo Akash";
		
		track1.play(); //Arijit is singing Dekho Aloy Alo Akash
		
		
		Song track2 = new Song();
		
		track2.artist = "Atif";
		
		track2.title = "Taj-da-re-haram";
		
		track2.play(); //Atif is singing Taj-da-re-haram
		
//		Whatever the state of the object behavior will work accordingly
		


	}

}
