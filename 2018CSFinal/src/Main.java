import java.awt.Dimension;

import javax.swing.JFrame;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingSurface intro = new DrawingSurface();
		PSurfaceAWT surf = (PSurfaceAWT) intro.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame)canvas.getFrame();


		window.setSize(700, 600);
		window.setMinimumSize(new Dimension(200,200));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);
		window.setVisible(true);
	}

}
