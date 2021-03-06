package edu.nd.se2018.homework.chipsChallenge.src;

import java.awt.Point;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RedDoor implements Door{
	
	ChipMap map;
	Point location = new Point();
	ImageView imageView;
	int scale = 20;
	int ID = 3;

	public RedDoor(ChipMap chipMap, int x, int y) {
		map = chipMap;
		location.x = x;
		location.y = y;
		Image redDoorImage = new Image("images\\redKeyWall.png", scale, scale, false, true);
		imageView = new ImageView(redDoorImage);
		imageView.setX(location.x*scale);
		imageView.setY(location.y*scale);
		map.chipsGrid[location.x][location.y] = 1;
	}
	// test
	@Override
	public Point getDoorLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public void lockDoor() {
		map.chipsGrid[location.x][location.y] = 1;
		
	}

	@Override
	public int getDoorId() {
		// TODO Auto-generated method stub
		return ID;
	}

	@Override
	public void unlockDoor() {
		map.chipsGrid[location.x][location.y] = 0;
		
	}

	@Override
	public ImageView getDoorImageView() {
		// TODO Auto-generated method stub
		return imageView;
	}

}
