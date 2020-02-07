package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	
	int x;
	int y;
	Color color;
	boolean isLittle;
	boolean facingLeft;
	int destX;
	int destY;
	
	
	public Fish(Color c, int startX, int startY, 
			boolean isLittle, boolean facingLeft) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		this.facingLeft = facingLeft;
		this.destX = 450;
		this.destY = 450;
		//this will be random later
		//entire fish destination is playing guessing game
	}
	
	public void swim( ) {
		if (this.y < this.destY) {
				this.y+= 1;
		}
	}
	public void draw(Graphics2D g) {
		
		this.swim();
		
		if (this.isLittle)
			if(this.facingLeft)
				DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
			else
				DrawFish.smallFacingRight(g, this.color, this.x, this.y);
		
		else if(this.facingLeft)
			DrawFish.facingLeft(g, this.color, 
					this.x, this.y);
		else
			DrawFish.facingRight(g, this.color, this.x, this.y);
		
	}
}
