import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {
		// 1. Create a robot
		Robot bob = new Robot();
		// 2. Set the speed to 100
		bob.setSpeed(100);
		bob.setY(500);
		int colorChoice = JOptionPane.showOptionDialog(null, "Choose a color for your polygons.", "Polygon Fun",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "Color 1", "Color 2", "Color 3" }, 0);
		// 3. Set the pen color of the robot according to the value of the colorChoise
		// variable
		if (colorChoice == 0) {
			bob.setPenColor(100, 200, 0);
		}
		if (colorChoice == 1) {
			bob.setPenColor(200, 0, 100);
		}
		if (colorChoice == 2) {
			bob.setPenColor(50, 50, 80);
		}
		// 4. Ask the use how many polygons they want to be drawn.
		String number = JOptionPane.showInputDialog("How many polygons do you want to draw?");
		int numbwer = Integer.parseInt(number);
		// 5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < numbwer; i++) {

			for (int j = 0; j < 8; j++) {
				bob.penDown();
				bob.move(50);
				bob.turn(45);

			}
			bob.penUp();
			bob.move(150);
		}

	}
	// 6. Make it so your shapes do not overlap

	// 7. Challenge: add more colors to the Option Dialog.

	// Note to Sarah= This one was hard for you. And so is charAt. Thats hard for you too.
}
