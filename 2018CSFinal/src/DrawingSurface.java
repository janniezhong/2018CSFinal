import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * @author arleenliu
 * @version 5/9/18
 *
 */
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
			initPanel();
		} else if (screenNum == 4) {
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
	
	public void initPanel() {
		editable = loadImage("InitPanel.jpg");
		editable.resize(width,height);
		
		image(editable, 0, 0);
		
		
	}
	
	public void instructionsPanel() {
		background(255);
		stroke(0);
		text("INSTRUCTIONS", (float)(width *0.5), (float)(height *0.5));
		image(loadImage("shelbyface.png") /*.resize(w, h)*/, (float)(width *0.25), (float)(height *0.25));
		
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
		Point p = new Point(mouseX, mouseY);
		
		if (screenNum == 1) {
			//if (mouseX)
			
			Rectangle a = new Rectangle((int) (0.107142857*width), (int) (0.423*height),  (int)(0.2642857*width), (int) (0.05*height));
			Rectangle b = new Rectangle((int)(0.7*width), (int) (0.423*height), (int) (0.107142857*width), (int) (0.05*height));
			
			if (a.contains(p)) {
				screenNum = 2;
			} else if (b.contains(p)) {
				screenNum = 3;
			}
		
		}
		
		if (screenNum == 3) {
			Rectangle a = new Rectangle(225, 300, 50, 30);
			
			if (a.contains(p)) {
				screenNum = 4;
			}
		}
	}
	
	
}
