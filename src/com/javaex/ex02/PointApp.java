package com.javaex.ex02;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p00 = new Point(3,5);
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,5);
		Point p03 = p02;
		
		//클래스 정보보기
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p01.getClass());
		
		System.out.println("===========================");
		
		//tostring()
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02);
		
		System.out.println("===========================");
		
		//hashCode()
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println("===========================");
		
		//equals()
		System.out.println(p00.equals(p01)); //p00 부모의 메소드 사용
		System.out.println(p01.equals(p00)); //p01 부모의 메소드 사용
		
		System.out.println(p00.equals(p01)); //같다.
	}

}
