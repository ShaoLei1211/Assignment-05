import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int Strength = rand.nextInt(10)+10;
        System.out.print("Strength:"+Strength+"\n");

        int Agility = rand.nextInt(10)+10;
        System.out.print("Agility:"+Agility+ "\n");

        int Intelligence = rand.nextInt(10)+10;
        System.out.print("Intelligence:"+Intelligence+"\n");

        int Magic_missile = 5*Intelligence;
        System.out.print("Original magic missile's value:"+Magic_missile+"\n");

        double max = 1.5;
        double min = 0.5;
        double modifier = (rand.nextDouble()*(max-min)+min);

        double damage_1 = modifier*Magic_missile;
        double damage_2 = modifier*Magic_missile;
        double damage_3 = modifier*Magic_missile;
        double damage_4 = modifier*Magic_missile;
        double damage_5 = modifier*Magic_missile;
        double damage_6 = modifier*Magic_missile;
        double damage_7 = modifier*Magic_missile;
        double damage_8 = modifier*Magic_missile;
        double damage_9 = modifier*Magic_missile;
        double damage_10 = modifier*Magic_missile;

        double final_damage = damage_1+damage_2+damage_3+damage_4+damage_5+damage_6+damage_7+damage_8+damage_9+damage_10;
        System.out.print("The final damage is " + final_damage +"\n");

// Scenario 1
        int Intelligence_1 = rand.nextInt(10)+10;
        System.out.print("The intelligence is "+ Intelligence_1+ "\n");
        // Set the modifier to 1.2, which is in the range of 0.5 to 1.5
        double final_damage_1 = Intelligence_1*1.2*10*5;
        System.out.print("The final damage for the first scenario is " + final_damage_1+"\n");
// Scenario 2
        int Intelligence_2 = 10;
        int Base_Number = (rand.nextInt(25)+1);
        System.out.print("The Base number of the magic missile is " + Base_Number+"\n");
        int Base_Magic_missile = Intelligence_2*Base_Number;
        System.out.print("The Base magic missile attack is " + Base_Magic_missile+"\n");
    // Set the modifier to 0.5 and times 10 times to get the worst condition to get the minimum number required
        double Final_Damage_2= 0.5*Base_Magic_missile*10;
        System.out.print("The final damage for the second Scenario is " + Final_Damage_2);




















    }
}
