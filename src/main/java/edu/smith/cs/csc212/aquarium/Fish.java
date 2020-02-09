package edu.smith.cs.csc212.aquarium;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

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
		
		//this random number code from GuessingGame.java
		Random randX = new Random();
		Random randY = new Random();
		
		
		int highX = 1000;
		int lowX = 0;
		int highY = 1000;
		int lowY = 0;
		
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		this.facingLeft = facingLeft;
		this.destX = randX.nextInt(highX-lowX)+lowX; 
		this.destY = randY.nextInt(highY-lowY)+lowY;
		
		
		
	
		
	}
	
	public void swim() {
		
		if (this.x != this.destX && this.y != this.destY) {
			
			
		
			if (this.y <= this.destY) {
					this.y+= 1;	
					
			//is it okay that they all have the same speed? 
					
			} else {
				this.y-=1;
			}
			
			if (this.x <=this.destX) {
				this.x += 1;
				
			} else {
				this.x-=1;
			}
			
			
			
			if (this.x < this.destX) {
				this.facingLeft = false;
				
			} else {
				
				this.facingLeft = true;
				
			}
		
		
	} else {
		//find a new destination: this is a place-holder
		
		System.out.println("time to find a new place to swim");
		
		//should all the random stuff be in swim ()? or a whole new method? or is it fine in Fish?
		
	}
	}


	public void draw(Graphics2D g) {
		
		this.swim();
		
		
		
		if (this.isLittle) {
			if(this.facingLeft) {
				DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		
			}else {
				DrawFish.smallFacingRight(g, this.color, this.x, this.y);
			
		
			}
		}else if(this.facingLeft) {
				DrawFish.facingLeft(g, this.color, 
					this.x, this.y);
		
		}else {
			DrawFish.facingRight(g, this.color, this.x, this.y);
		
		}
	
		
	
	}

	
}



