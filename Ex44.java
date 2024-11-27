package loops;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex44 {

	public static void main(String[] args) {

		ArrayList<String> sex = new ArrayList<>();

		ArrayList<String> eyeColor = new ArrayList<>();

		ArrayList<String> hairColor = new ArrayList<>();

		ArrayList<Integer> age = new ArrayList<>();

		ArrayList<Double> height = new ArrayList<>();

		ArrayList<Double> weight = new ArrayList<>();

		String userSex, userHair, userEye, userAnswer;

		int userAge, averageAge, ageSum = 0, count = 0, percentualWoman, percentualMan, countBlonde = 0, countGreen = 0;

		Double userHeight, userWeight, weigthSum = 0.0, heightSum = 0.0, averageHeight, averageWeigth;

		do {

			userSex = JOptionPane.showInputDialog(null, "Input user sex");

			userSex.trim();

			if (userSex.equalsIgnoreCase("man") || userSex.equalsIgnoreCase("woman")) {

				sex.add(userSex);

			}

			else {

				JOptionPane.showMessageDialog(null, "You did not enter any gender.");
			}

			userEye = JOptionPane.showInputDialog(null, "Enter the user's hair color.");

			userEye.trim();

			if (userEye.equalsIgnoreCase("blue") || userEye.equalsIgnoreCase("green")
					|| userEye.equalsIgnoreCase("brown")) {

				eyeColor.add(userEye);

			}

			else {

				JOptionPane.showMessageDialog(null, "You did not enter a valid eye color.");
			}

			userHair = JOptionPane.showInputDialog(null, "Enter the user's hair color.");

			userHair.trim();

			if (userHair.equalsIgnoreCase("blonde") || userHair.equalsIgnoreCase("brown")
					|| userHair.equalsIgnoreCase("black")) {

				hairColor.add(userHair);

			}

			else {

				JOptionPane.showMessageDialog(null, "You did not enter a valid hair color.");
			}

			userAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Input user age: "));

			if (userAge <= 0) {

				JOptionPane.showMessageDialog(null, "Please input a positive value or greater than zero");
			}

			else {

				age.add(userAge);
			}

			userHeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input user height: "));

			if (userHeight <= 0) {

				JOptionPane.showMessageDialog(null, "Please input a positive value or greater than zero");

			}

			else {

				height.add(userHeight);

			}

			userWeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input user weight: "));

			if (userWeight <= 0) {

				JOptionPane.showMessageDialog(null, "Please input a positive value or greater than zero");

			}

			else {

				weight.add(userWeight);

			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue: ");

			userAnswer = userAnswer.toLowerCase().trim();

		} while (userAnswer.equals("yes"));

		if (!age.isEmpty()) {

			for (int i = 0; i < age.size(); i++) {

				ageSum += age.get(i);

			}

			averageAge = ageSum / age.size();

			JOptionPane.showMessageDialog(null, "Average Age: " + averageAge);
		}

		else {

			JOptionPane.showMessageDialog(null, "No age was entered.");
		}

		if (!height.isEmpty()) {

			for (int i = 0; i < height.size(); i++) {

				heightSum += height.get(i);

			}

			averageHeight = heightSum / height.size();

			JOptionPane.showMessageDialog(null, "Average Height: " + averageHeight);
		}

		else {

			JOptionPane.showMessageDialog(null, "No height was entered.");

		}

		if (!weight.isEmpty()) {

			for (int i = 0; i < weight.size(); i++) {

				weigthSum += weight.get(i);

			}

			averageWeigth = weigthSum / weight.size();

			JOptionPane.showMessageDialog(null, "Average Weight: " + averageWeigth);
		}

		else {

			JOptionPane.showMessageDialog(null, "No weight was entered.");

		}

		if (!sex.isEmpty()) {

			for (int i = 0; i < sex.size(); i++) {

				if (sex.get(i).equalsIgnoreCase("woman")) {

					count++;

				}

			}

			percentualWoman = (count * 100) / sex.size();

			percentualMan = ((sex.size() - count) * 100) / sex.size();

			JOptionPane.showMessageDialog(null,
					"Percentage of women: " + percentualWoman + "%" + "\nPercentage of Man: " + percentualMan + "%");

		}

		else {

			JOptionPane.showMessageDialog(null, "No sex was entered.");

		}

		if (!hairColor.isEmpty()) {

			for (int i = 0; i < hairColor.size(); i++) {

				if (hairColor.get(i).equalsIgnoreCase("blonde")) {

					countBlonde++;

				}

			}

		}

		else {

			JOptionPane.showMessageDialog(null, "No hair color was entered.");
		}

		if (!eyeColor.isEmpty()) {

			for (int i = 0; i < eyeColor.size(); i++) {

				if (eyeColor.get(i).equalsIgnoreCase("green")) {

					countGreen++;
				}

			}
		}

		else {

			JOptionPane.showMessageDialog(null, "No eye color was entered.");
		}

		JOptionPane.showMessageDialog(null,
				"Number of Blonde hair: " + countBlonde + "\nNumber of people with green eyes: " + countGreen);

	}

}
