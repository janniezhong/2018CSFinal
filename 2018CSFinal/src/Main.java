import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

import processing.awt.PSurfaceAWT;
/**
 * 
 * @author jzhong672
 * @version 5/7/18
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingSurface intro = new DrawingSurface();
		PSurfaceAWT surf = (PSurfaceAWT) intro.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame)canvas.getFrame();


		window.setLocation(new Point(50, 50));
		window.setSize(700, 600);
		window.setMinimumSize(new Dimension(200,200));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);
		window.setVisible(true);
	}

}
