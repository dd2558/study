package com.in28minutes.learnspringframework.game.example.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;


public class XmlConfigurationContextLauncherApplication {


  
  public static void main(String[] args) {

    try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
  
      Arrays.stream(context.getBeanDefinitionNames())
      .forEach(System.out::println);
    
    System.out.println(context.getBean("name"));
    
    System.out.println(context.getBean("age"));
    
    context.getBean(GameRunner.class).run();
    
    }
    
    
    
   
    
    //var game = new MarioGame();
    //var game = new SuperContraGame();
//    var game = new PacmanGame();
//    var gameRunner = new GameRunner(game);
//    gameRunner.run();
//    
  }

}
