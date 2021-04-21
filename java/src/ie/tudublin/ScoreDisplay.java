package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	//String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<Note> notes = new ArrayList<Note>(); //new a Note arraylist to store the note

	public void loadScore() {
		for(int i = 0; i < score.length() - 1; i++)
		{
			//convert character to the number
			char a = score.charAt(i);
			int m = a - '0';

			char b = score.charAt(i + 1);
			int n = b - '0';
			
			//check what type of the note it is and add to the arraylist
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
			line(100, height / 2 - 40 + i * 20, width - 100, height / 2 - 40 + i * 20);
		}
	}

	public void drawNotes()
	{
		float gap = (width - 260) / notes.size(); // gap between each notes

		for(int i = 0; i < notes.size(); i++) {

			Note n = notes.get(i);
			
			if(n.getNote() == 'D') {
				fill(0);
				stroke(0);
				//hightlight the notes
				if(130 + i * gap - 10 <= mouseX && mouseX <= 130 + i * gap + 10) {
					fill(255, 0, 0);
					stroke(255, 0, 0);
				}
				//text above the note
				text(n.getNote(), 130 + i * gap, 100);
				textSize(25);
				line(130 + i * gap + 10, height / 2 + 50, 130 + i * gap + 10, height / 2);
				circle(130 + i * gap, height / 2 + 50, 20);
				//check what types of note
				if(n.getDuration() == 1) {
					line(130 + i * gap + 10, height / 2, 130 + i * gap + 25, height / 2 + 15);
				}
			} else if(n.getNote() == 'E') {
				fill(0);
				stroke(0);
				if(130 + i * gap - 10 <= mouseX && mouseX <= 130 + i * gap + 10) {
					fill(255, 0, 0);
					stroke(255, 0, 0);
				}
				text(n.getNote(), 130 + i * gap, 100);
				textSize(25);
				line(130 + i * gap + 10, height / 2 + 40, 130 + i * gap + 10, height / 2 - 10);
				circle(130 + i * gap, height / 2 + 40, 20);
				if(n.getDuration() == 1) {
					line(130 + i * gap + 10, height / 2 - 10, 130 + i * gap + 25, height / 2 + 5);
				}
			} else if(n.getNote() == 'F') {
				fill(0);
				stroke(0);
				if(130 + i * gap - 10 <= mouseX && mouseX <= 130 + i * gap + 10) {
					fill(255, 0, 0);
					stroke(255, 0, 0);
				}
				text(n.getNote(), 130 + i * gap, 100);
				textSize(25);
				line(130 + i * gap + 10, height / 2 + 30, 130 + i * gap + 10, height / 2 - 20);
				circle(130 + i * gap, height / 2 + 40 - 10, 20);
				if(n.getDuration() == 1) {
					line(130 + i * gap + 10, height / 2 - 20, 130 + i * gap + 25, height / 2 - 5);
				}
			} else if(n.getNote() == 'G') {
				fill(0);
				stroke(0);
				if(130 + i * gap - 10 <= mouseX && mouseX <= 130 + i * gap + 10) {
					fill(255, 0, 0);
					stroke(255, 0, 0);
				}
				text(n.getNote(), 130 + i * gap, 100);
				textSize(25);
				line(130 + i * gap + 10, height / 2 + 20, 130 + i * gap + 10, height / 2 - 30);
				circle(130 + i * gap, height / 2 + 40 - 20, 20);
				if(n.getDuration() == 1) {
					line(130 + i * gap + 10, height / 2 - 30, 130 + i * gap + 25, height / 2 - 15);
				}
			} else if(n.getNote() == 'A') {
				fill(0);
				stroke(0);
				if(130 + i * gap - 10 <= mouseX && mouseX <= 130 + i * gap + 10) {
					fill(255, 0, 0);
					stroke(255, 0, 0);
				}
				text(n.getNote(), 130 + i * gap, 100);
				textSize(25);
				line(130 + i * gap + 10, height / 2 + 10, 130 + i * gap + 10, height / 2 - 40);
				circle(130 + i * gap, height / 2 + 40 - 30, 20);
				if(n.getDuration() == 1) {
					line(130 + i * gap + 10, height / 2 - 40, 130 + i * gap + 25, height / 2 - 25);
				}
			} else if(n.getNote() == 'B') {
				fill(0);
				stroke(0);
				if(130 + i * gap - 10 <= mouseX && mouseX <= 130 + i * gap + 10) {
					fill(255, 0, 0);
					stroke(255, 0, 0);
				}
				text(n.getNote(), 130 + i * gap, 100);
				textSize(25);
				line(130 + i * gap + 10, height / 2, 130 + i * gap + 10, height / 2 - 50);
				circle(130 + i * gap, height / 2 + 40 - 40, 20);
				if(n.getDuration() == 1) {
					line(130 + i * gap + 10, height / 2 - 50, 130 + i * gap + 25, height / 2 - 35);
				}
			} else if(n.getNote() == 'c') {
				fill(0);
				stroke(0);
				if(130 + i * gap - 10 <= mouseX && mouseX <= 130 + i * gap + 10) {
					fill(255, 0, 0);
					stroke(255, 0, 0);
				}
				text(n.getNote(), 130 + i * gap, 100);
				textSize(25);
				line(130 + i * gap + 10, height / 2 - 10, 130 + i * gap + 10, height / 2 - 60);
				circle(130 + i * gap, height / 2 + 40 - 50, 20);
				if(n.getDuration() == 1) {
					line(130 + i * gap + 10, height / 2 - 60, 130 + i * gap + 25, height / 2 - 45);
				}
			} else if(n.getNote() == 'd') {
				fill(0);
				stroke(0);
				if(130 + i * gap - 10 <= mouseX && mouseX <= 130 + i * gap + 10) {
					fill(255, 0, 0);
					stroke(255, 0, 0);
				}
				text(n.getNote(), 130 + i * gap, 100);
				textSize(25);
				line(130 + i * gap + 10, height / 2 - 20, 130 + i * gap + 10, height / 2 - 70);
				circle(130 + i * gap, height / 2 + 40 - 60, 20);
				if(n.getDuration() == 1) {
					line(130 + i * gap + 10, height / 2 - 70, 130 + i * gap + 25, height / 2 - 55);
				}
			}
		}
	}
	
	public void settings()
	{
		size(1000, 500);
	}

	public void setup() 
	{
		colorMode(RGB);
		loadScore(); //initialize notes array
		printScores(); //print scores
	}

	public void draw()
	{
		background(255);
		drawStaveLines(); //draw the 5 lines
		drawNotes(); //draw notes
	}
}
