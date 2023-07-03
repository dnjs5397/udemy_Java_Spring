package com.study.spring.learnspringframework;

import com.study.spring.learnspringframework.game.GameRunner;
import com.study.spring.learnspringframework.game.PacmanGame;

public class AppGame01 {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		PacmanGame game = new PacmanGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
