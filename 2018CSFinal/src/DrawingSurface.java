import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * @author jzhong672
 * @version 5/16/18
 *
 */
public class DrawingSurface extends PApplet {

	// private PImage background;
	private PImage editable;
	public static int screenNum;
	private boolean justPressed;


	private IntroPanel intro; // 1
	private CityPanel city; // 4
	private InstructionsPanel instructions; // 2
	private InitPanel init;// 3
	private ShopPanel shop; //5

	public DrawingSurface() {
		screenNum = 1;
		runSketch();
		justPressed = false;
	}

	public void setup() {
		intro = new IntroPanel();
		instructions = new InstructionsPanel();
		init = new InitPanel();
		shop = new ShopPanel();
	}

	public void draw() {

		
		if (mousePressed) {
			mouseClicked();
			
		}
	
		if (screenNum == 1) {
			intro.draw(this);
		} else if (screenNum == 2) {
			instructions.draw(this);
		} else if (screenNum == 3) {
			init.draw(this);
		} else if (screenNum == 4) {
			city.draw(this);
			
			PImage shop = loadImage("shopButton.png");
			shop.resize(width/10, height/10);
			image(shop, (float)(width*9/10.0), (float)(height*9/10.0));
			
		
			
		} else if (screenNum == 5) {
			
			shop.draw(this);
			

			stroke(0);
			strokeWeight(2);
	
			rect((int)(630/700.0*width), (int)(555/600.0*height), (int)(60/700.0*width), (int)(25/600.0*height));

			
		}
		
	}

	public void initPanel() {
		editable = loadImage("InitPanel.jpg");
		editable.resize(width,height);
		image(editable, 0, 0);

	}

	// public void instructionsPanel() {
	// background(255);
	// stroke(0);
	// text("INSTRUCTIONS", (float)(width *0.5), (float)(height *0.5));
	// image(loadImage("shelbyface.png") /*.resize(w, h)*/, (float)(width *0.25),
	// (float)(height *0.25));
	//
	// }

	// public void cityPanel() {
	// editable = loadImage("cityBackground.jpg");
	// editable.resize(width,height);
	//
	// image(editable, 0, 0);
	//
	// stroke(0);
	// strokeWeight(5);
	// for (int i = 0; i < size - 1; i++) {
	// line(0, i * (height / size), width, i * (height / size));
	// line(i * (width / size), 0, i * (width / size), height);
	// }
	// }

	public void mouseClicked() {
		
		
		
		Point p = new Point(mouseX, mouseY);

		if (screenNum == 1) {
			// if (mouseX)

			Rectangle a = new Rectangle((int) (0.107142857 * width), (int) (0.423 * height), (int) (0.2642857 * width),
					(int) (0.05 * height));
			Rectangle b = new Rectangle((int) (0.7 * width), (int) (0.423 * height), (int) (0.107142857 * width),
					(int) (0.05 * height));

			if (a.contains(p)) {
				screenNum = 2;
			} else if (b.contains(p)) {
				screenNum = 3;		
				delay(500);

			}
			
		

		} else if (screenNum == 2) {
			
			Rectangle a = new Rectangle((int)(630/700.0*width), (int)(550/600.0*height), (int)(60/700.0*width), (int)(30/600.0*height));
			
			if (a.contains(p)) {
				screenNum = 1;
			}
			
		} else if (screenNum == 3) {			
			
			Rectangle a = new Rectangle((int)(209/700.0*width), (int)(285/600.0*height), (int)(95/700.0*width), (int)(52/600.0*width));
			Rectangle b = new Rectangle((int)(372/700.0*width), (int)(282/600.0*height), (int)(90/700.0*width), (int)(60/600.0*width));
			Rectangle c = new Rectangle((int)(535/700.0*width), (int)(243/600.0*height), (int)(70/700.0*width), (int)(90/600.0*width));
			Rectangle d = new Rectangle((int)(209/700.0*width), (int)(465/600.0*height), (int)(90/700.0*width), (int)(52/600.0*width));
			Rectangle e = new Rectangle((int)(380/700.0*width), (int)(465/600.0*height), (int)(88/700.0*width), (int)(52/600.0*width));
			Rectangle f = new Rectangle((int)(522/700.0*width), (int)(465/600.0*height), (int)(95/700.0*width), (int)(52/600.0*width));

			
			if (a.contains(p)) {
				screenNum = 4;
				city = new CityPanel(1);
			} else if (b.contains(p)) {
				screenNum = 4;
				city = new CityPanel(2);

			} else if (c.contains(p)) {
				screenNum = 4;
				city = new CityPanel(3);

			} else if (d.contains(p)) {
				screenNum = 4;
				city = new CityPanel(4);

			} else if (e.contains(p)) {
				screenNum = 4;
				city = new CityPanel(5);

			} else if (f.contains(p)) {
				screenNum = 4;
				city = new CityPanel(6);

			}
		} else if (screenNum == 4) {
			Rectangle a = new Rectangle((int)(width*9/10.0),(int)(height*9/10.0), width/10, height/10);
			
			if (a.contains(p)) {
				screenNum = 5;
			}
		} else if (screenNum == 5) {
			Rectangle a = new Rectangle((int)(630/700.0*width), (int)(555/600.0*height), (int)(60/700.0*width), (int)(25/600.0*height));

			if (a.contains(p)) {
				screenNum = 4;
			}
		}
	}

}
