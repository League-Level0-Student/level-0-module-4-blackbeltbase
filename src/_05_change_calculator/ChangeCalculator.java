package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickel = JOptionPane.showInputDialog("how many nickels do you have");
		// Convert their answer to an int using Integer.parseInt()
int nickelNumber = Integer.parseInt(nickel);
		// Ask the user how many dimes they have, and convert their answer
String dime = JOptionPane.showInputDialog("how many dimes do you have");
int dimeNumber = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
String quarter = JOptionPane.showInputDialog("how many quarters do you have");
int quarterNumber = Integer.parseInt(quarter);
		// Calculate how much money the user has and save it in a double variable 
double moneyUserHas = nickelNumber*0.05+dimeNumber*0.10+quarterNumber*0.25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have $"+moneyUserHas+".");
	}
}

