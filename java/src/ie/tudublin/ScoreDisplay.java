package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	// String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<Note> notes = new ArrayList<Note>();

	public void loadScore() {
		for(int i = 0; i < score.length() - 1; i++)
		{
			char a = score.charAt(i);
			int m = a - '0';

			char b = score.charAt(i + 1);
			int n = b - '0';

			if(m != 2 && n == 2) {
				Note note = new Note(a, 2);
				notes.add(note);
			} else if(m != 2 && n != 2) {
				Note note = new Note(a, 1);
				notes.add(note);
			}
		}
	}

	public void printScores() {
		for(Note n:notes) {
			println(n);
		}
	}

	public void drawStaveLines() {
		for(int i = 0; i < 5; i++) {
			stroke(0);
			strokeWeight(3);
			line(100, 200 + i * 25, width - 100, 200 + i * 25);
		}
	}
	
	public void settings()
	{
		size(1000, 500);
	}

	public void setup() 
	{
		loadScore(); //initialize notes array
		printScores();
	}

	public void draw()
	{
		background(255);
		drawStaveLines();
		
	}

	void drawNotes()
	{
		background(255);
	}
}
