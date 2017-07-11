package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot chris=new Robot();
		chris.penDown();
		chris.move(500);
		chris.move(-100);
chris.turn(180);
	chris.turn(360);
		chris.setPenColor(Color.CYAN);
		
		
	}
}
