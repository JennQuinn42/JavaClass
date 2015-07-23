package com.jenn.codeforces;

public class Pawn {
	
	private int positionX = -1;
	private int positionY = -1;
	
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	public boolean overlapPosition(Pawn otherPlayer){
		
		if(this.positionX == otherPlayer.getPositionX() 
				&& this.positionY == otherPlayer.getPositionY()){
			return true;
		}
		else{
			return false;
		}
		
	}
}
