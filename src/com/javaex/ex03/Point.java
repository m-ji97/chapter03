package com.javaex.ex03;

public class Point {
	
	//필드
	int x;
	int y;
	
	//생성자
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//메소드 g/s
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 읿반
	@Override
	public boolean equals(Object obj) {
		//'같다'는 결과의 로직을 다시 작성
		//o=p01의 주소
		//본인(p00)의 x값과 o의 x값이 같냐?
		//본인의 y값과 o의 y값이 같냐?
		Point p=(Point) obj;
		boolean result;
		
		if (this.x==p.x && this.y==p.y) {
			result=true;
		} else {
			result=false;
		}
		return result;
	}
	
	

}
