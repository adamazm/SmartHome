package v1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class HouseShape extends JPanel{
	
	public HouseShape() {
		this.setBounds(150, 200, 500, 500);
	}
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.white);
		g2.drawRect(0, 0, 400, 300);
	}
}
