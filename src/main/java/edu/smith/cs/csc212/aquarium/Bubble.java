package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;

public class Bubble {
	
	int x;
	int y;	
	int destY;
	
	
	public Bubble(int startX, int startY) {
		
		this.x = startX;
		this.y = startY;
		this.destY = -100;
		
	}
	public void drawBubble(Graphics2D g) {
		//this code from DrawFish.java
		//why public void
		Shape bubble = new Ellipse2D.Double(x - 15, y - 10, 5, 5);
		//this eventually should not be set, and should be random
		g.setColor(Color.white);
		g.fill(bubble);
		
		this.move();
	}
	
	public void move() {
		
		if (this.y > this.destY) {
			this.y -=1;
			
		} 
		
		
		else {
			this.y = 500;
			
		}
		
	}
}

