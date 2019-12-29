package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
int userPet = JOptionPane.showOptionDialog(null, "What pet do you want to buy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Dog", "Cat", "Chameleon" }, null);
//String userPetName;
System.out.println(userPet);
//if(userPet == 0) {
	//userPetName = "dog";
//}
///else if (userPet ==1) {
	//userPetName = "cat";
//}
//else if(userPet == 2) {
	//userPetName = "chameleon";
//}
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		String petSound = null;
		if(userPet == 0) {
	petSound = "barks";
	}
	else if (userPet ==1) {
		petSound = "purrs";
	}
	else if(userPet == 2) {
	petSound = "swings its tail and jutts out its toungue";
	}
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for(int i = 0; i<=3; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "walk ", "groom", "Buy him/her a gaming set." }, null);
			if(task == 0) {
				walk(petSound);
			}
			else if(task == 1){
				groom(petSound);
			}	
			else if(task == 2) {
				gamingSet(petSound);
			}
			
			if(happinessLevel < 5) {
				i--;
			}
			else {
				i++;
			}
			}
		JOptionPane.showMessageDialog(null, "You have made your pet happy!");
		
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void walk( String petSound) {
		happinessLevel++;
		JOptionPane.showMessageDialog(null, "Your pet is happy.");
		JOptionPane.showMessageDialog(null, "It "+petSound+" in joy!");
	}
	static void groom( String petSound) {
		JOptionPane.showMessageDialog(null, "Your pet is clean, but not exactly happy");
		JOptionPane.showMessageDialog(null, "It "+petSound+" in cleanliness!");
	}
	static void gamingSet( String petSound) {
		happinessLevel+= 2;
		JOptionPane.showMessageDialog(null, "Your pet is extremely happy.");
		JOptionPane.showMessageDialog(null, "It "+petSound+" in joy!");
	}
}