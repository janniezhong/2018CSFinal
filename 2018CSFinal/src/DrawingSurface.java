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
	
	private IntroPanel intro;
	private CityPanel city;
	private InstructionsPanel instructions;
	private InitPanel init;

	
	public DrawingSurface() {
		screenNum = 1;
		runSketch();
	}
	
	public void setup() {
		intro = new IntroPanel();
		city = new CityPanel();
		instructions = new InstructionsPanel();
		init = new InitPanel();
	}
	
	public void draw() {
		
		
		if (mousePressed) {
			mousePressed();
		}
		if (screenNum == 1) {
			intro.draw(this);
		} else if (screenNum == 2) {
			instructions.draw(this);
		} else if (screenNum == 3) {
			init.draw(this);
		} else if (screenNum == 4) {
			city.draw(this);;
		}
	
	}
	
	
	public void initPanel() {
		editable = loadImage("InitPanel.jpg");
		editable.resize(width,height);
		image(editable, 0, 0);
		
		
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
