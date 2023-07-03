package com.study.spring.learnspringframework.game;

public class SuperContraGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("super up");
	}

	@Override
	public void down() {
		System.out.println("super ddd");
	}

	@Override
	public void left() {
		System.out.println("super llll");
	}

	@Override
	public void right() {
		System.out.println("super rrr");
	}
	
	
}
