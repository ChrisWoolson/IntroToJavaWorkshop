package day3;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "time to start the math quiz!");
	int score = 0;
	
	String input1=JOptionPane.showInputDialog("what is 8 X 9?");
	
	if (input1.equals("72")) {
		JOptionPane.showMessageDialog(null, "correct");
	score=score+1;
	}


	
String input2=JOptionPane.showInputDialog("what is 1/8 of 28?  (use decimals)");
	
	if (input2.equals("3.5")) {
		JOptionPane.showMessageDialog(null, "correct");
	score=score+1;
	
	
	
	
	
String input3=JOptionPane.showInputDialog("what is 30% of 300?");
	
	if (input3.equals("90")) {
		JOptionPane.showMessageDialog(null, "correct");
	score=score+1;
	
	
	
	
	
	
String input4=JOptionPane.showInputDialog("how many sides does a pentagon have?");
	
	if (input4.equals("5")) {
		JOptionPane.showMessageDialog(null, "correct");
	score=score+1;
	
	
	
	
	
String input5=JOptionPane.showInputDialog("what is 1+1?");
	
	if (input5.equals("window")) {
		JOptionPane.showMessageDialog(null, "correct");
	score=score+1;
	
	
}
	
	JOptionPane.showInputDialog("YOUR SCORE IS"+score);
	
	}	
	}}}}
