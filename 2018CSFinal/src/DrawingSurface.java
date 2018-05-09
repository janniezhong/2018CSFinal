import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import processing.core.PApplet;
import processing.core.PImage;

public class DrawingSurface extends PApplet {

	//private PImage background;
	private PImage editable;
	public static int screenNum;
	private int size;
	public DrawingSurface() {
		screenNum = 1;
		runSketch();
	}
	
	public void setup() {
		//background = loadImage("IntroPic.jpg");
	}
	
	public void draw() {
		
		
		if (mousePressed) {
			mousePressed();
		}
		if (screenNum == 1) {
			introPanel();
		} else if (screenNum == 2) {
			instructionsPanel();
		} else if (screenNum == 3) {
			cityPanel();
		}
	
	}
	
	public void introPanel() {
		editable = loadImage("IntroPic.jpg");
		editable.resize(width,height); 
		//background(editable);   
		noFill();
		textAlign(CENTER);
		image(editable, 0, 0);


	}
	
	public void instructionsPanel() {
		background(255);
		stroke(0);
		text("INSTRUCTIONS", (float)(width *0.5), (float)(height *0.5));
	}
	
	public void cityPanel() {
		
	}
	
	public void cityPanel() {
		editable = loadImage("cityBackground.jpg");
		editable.resize(width,height);
		
		image(editable, 0, 0);
		
		stroke(0);
		strokeWeight(5);
		for (int i = 0; i < size - 1; i++) {
			line(0, i * (height / size), width, i * (height / size));
			line(i * (width / size), 0, i * (width / size), height);
		}
	}
	
	
	public void mousePressed() {
		if (screenNum == 1) {
			//if (mouseX)
			
			Rectangle a = new Rectangle((int) (0.107142857*width), (int) (0.423*height),  (int)(0.2642857*width), (int) (0.05*height));
			Rectangle b = new Rectangle((int)(0.7*width), (int) (0.423*height), (int) (0.107142857*width), (int) (0.05*height));

			
			Point p = new Point(mouseX, mouseY);
			
			if (a.contains(p)) {
				screenNum = 2;
			} else if (b.contains(p)) {
				screenNum = 3;
			}
			
		}
	}
	
	
}
