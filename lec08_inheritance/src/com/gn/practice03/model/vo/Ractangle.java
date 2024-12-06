package com.gn.practice03.model.vo;

public class Ractangle extends Point{
	private int width;
	private int height;
	
	public Ractangle() {}
	
	public Ractangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 : " + width* height );
		System.out.println("둘레 : " + 2*(width+height));
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
