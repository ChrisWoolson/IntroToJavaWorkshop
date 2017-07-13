package day4;

import java.util.Random;

import javax.swing.JOptionPane;

public class HiLowGame {

		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int Random = new Random().nextInt(1000);

			// 2. Print out the random variable above
			System.out.println(Random);
			// 11. do the following 10 times
			int question=-1;
			for (int i = 0; i <10; i++) {
			
			
				// 1. ask the user for a guess using a pop-up window, and save their response 
			String answer =JOptionPane.showInputDialog("guess a number between 0-1000");
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
			question=(Integer.parseInt(answer));
				// 5. if the guess is correct
			if(question == Random){
			// 6. win
				JOptionPane.showMessageDialog(null,"Win ");
				// 7. if the guess is high
				JOptionPane.showMessageDialog(null, i+1 );
				break;
			}
	
			if(question > Random){
				// 8. tell them it's too high
					JOptionPane.showMessageDialog(null,"nope ");
				// 9. if the guess is low
				}
					if(question < Random){
				// 10. tell them it's too low
						JOptionPane.showMessageDialog(null,"nope ");
					}}
			// 12. tell them they lose
if(question != Random)
			JOptionPane.showMessageDialog(null,"you lose ");
				}	
	}
			
