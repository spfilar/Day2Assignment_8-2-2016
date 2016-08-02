package com.stuart.day2assignment;

import java.util.*;

public class RubberChicken {
	
	public static void main(String[] args) {
		
		// Explorer mode, first part, #1 to #6
		String helloWorld = "Hello World";
		int columbusWasAMassMurderer = 1492;
		boolean dogAtHome = false;
		String todaysDate = "August 2nd, 2016";
		float currency = 5.45f;
		char xMarksTheSpot = 'X';
		
		//Explorer mode, second part, #1 to #6
		System.out.println(helloWorld);
		System.out.println("Columbus sailed the world in " + columbusWasAMassMurderer + ".");
		System.out.println("It is " + !(dogAtHome) + " that I have a dog at home.");
		System.out.println("Today is " + todaysDate + ".");
		System.out.println("I spent $" + currency + " on a cheeseburger.");
		System.out.println(xMarksTheSpot + " marks the spot.");
		
		//Adventurer mode, arrays 1 and 2 written two different ways and printed
		String[] movies = new String[10];
		movies[0] = "The Godfather";
		movies[1] = "The Shawshank Redemption";
		movies[2] = "Schindler's List";
		movies[3] = "Raging Bull";
		movies[4] = "Casablanca";
		movies[5] = "Citizen Kane";
		movies[6] = "Gone with the Wind";
		movies[7] = "The Wizard of Oz";
		movies[8] = "One Flew Over the Cuckoo's Nest";
		movies[9] = "Lawrence of Arabia";

		String[] books = {"Anna Karenina", "Madame Bovary", "War and Peace",
				"The Great Gatsby", "Lolita", "Middlemarch", 
				"The Adventures of Huckleberry Finn", "The Stories of Anton Chekhov",
				"In Search of Lost Time", "Hamlet"};
	
		//Print out of the arrays in Adventurer mode
		Arrays.stream(movies).forEach(System.out::println);
		Arrays.stream(books).forEach(System.out::println);
		
		//Epic mode, using the arrays from Adventurer mode
		String[][] myFavorites = new String[2][10];
		for (int i = 0; i < movies.length; i++)
		{
			myFavorites[0][i] = movies[i];
		}
		for (int j = 0; j < books.length; j++)
		{
			myFavorites[1][j] = books[j];
		}
		
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.print(myFavorites[i][j] + ", ");				
			}
			System.out.println(" ");
		}

		//Print out of some of my methods
		System.out.println("Square root is " + RubberChicken.computeSquare(7));
		
		System.out.println(RubberChicken.sendText());
		
		System.out.println(RubberChicken.add(5, 8));
		
	}
	// method #1
	public static int add(int x, int y)
	{	
		return x + y;
	}
		
	// method #2
	public static float computeSquare(float i)
	{
		float squareRt;
		squareRt = (float) Math.sqrt(i);
		return squareRt;
	}
	
	// method #3
	public static String sendText()
	{
		String textMessage = "this is a test text message.";
		return textMessage;
	}
	
	// method #4
	String row;
	int column;
	
	public RubberChicken (String row, int column)
	{
		this.row = row;
		this.column = column;
	}

	// method #5
	public boolean isHit(String row, int column)
	{
		if ((this.row == row) && (this.column == column))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// method #6
	private RubberChicken[] ptBoats = new RubberChicken[6];
	private int numberOfBoats = 0;
	
	public void addBoat(String row, int column)
	{
		ptBoats[numberOfBoats] = new RubberChicken(row, column);
		numberOfBoats++;
	}

	// method #7
	public boolean guess(String row, int column)
	{
		for(int i = 0; i < ptBoats.length; i++)
		{
			if (ptBoats[i].isHit(row, column))
			{
				return true;
			}
		}
		return false;
	}
	
	// method #8
	public void checkGuess(String row, int column)
	{
		if (guess(row, column))
		{
			System.out.println("Hit");
		}
		else 
		{
			System.out.println("Miss");
		}
	}
	
	// method #9
	private float atBats;
	private float battingAvg;
	private float slugPrct;
	
	private void Batter(float atBats, float battingAvg, float slugPrct)
	{
		this.atBats = atBats;
		this.battingAvg = battingAvg;
		this.slugPrct = slugPrct;
	}
	
	// #10
	private float largeChickens = 50000.0f;
	public float getLargeChickens()
	{
		return largeChickens;
	}
}
	