package chanceapps;

import chance.Die;

public class Roller {

    public static void main(String[] args) {
        // CREATE A STANDARD DIE AND ROLL IT 5 TIMES
        createAndRollStandardDieFiveTimes();
        // CREATE A TWENTY SIDED DIE AND ROLL IT 5 TIMES
        createAndRollTwentySidedDieFiveTimes();
        // CREATE A STANDARD DIE AND ROLL IT 20 TIMES
        createAndRollStandardDie(20);
        // CREATE A STANDARD DIE AND ROLL IT 30 TIMES
        createAndRollStandardDie(30);
        // CREATE A NINE SIDED DIE AND ROLL IT 20 TIMES
        createAndRollNineSidedDie(20);
        // CREATE A NINE SIDED DIE AND ROLL IT 30 TIMES
        createAndRollNineSidedDie(30);
        // TEN TIMES, CREATE A STANDARD DIE AND ROLL IT UNTIL YOU GET A 1
        for (int i = 1; i <= 10; i++) {
            createAndRollStandardDieFor1();
        }
        // TEN TIMES, CREATE A TWELVE SIDED DIE AND ROLL IT UNTIL YOU GET A 1
        System.out.println("Ten times, roll a twelve sided die for a 1.");
        for (int i = 1; i <= 10; i++) {
            createAndRollTwelveSidedDieFor1();
        }
    }

    private static void createAndRollStandardDieFiveTimes() {
        System.out.println("Roll a standard die 5 times ...");
        Die die = new Die();
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        System.out.println();
    }

    private static void createAndRollTwentySidedDieFiveTimes() {
        Die twentySidedDie = new Die(20);
        twentySidedDie.roll();
        System.out.print(twentySidedDie.top() + " ");
        twentySidedDie.roll();
        System.out.print(twentySidedDie.top() + " ");
        twentySidedDie.roll();
        System.out.print(twentySidedDie.top() + " ");
        twentySidedDie.roll();
        System.out.print(twentySidedDie.top() + " ");
        twentySidedDie.roll();
        System.out.print(twentySidedDie.top() + " ");
        System.out.println();
    }

    private static void createAndRollStandardDie(int nrOfTimes) {
        System.out.println("Roll a standard die " + nrOfTimes + " times ...");
        Die lucky = new Die();
        int i = 1;
        while (i <= nrOfTimes) {
            lucky.roll();
            System.out.print(lucky.top() + " ");
            i = i + 1;
        }
        System.out.println();
    }

    private static void createAndRollNineSidedDie(int nrOfTimes) {
        System.out.println("Roll a nine sided die " + nrOfTimes + " times ...");
        Die nines = new Die(9);
        for (int i = 1; i <= nrOfTimes; i = i + 1) {
            nines.roll();
            System.out.print(nines.top() + " ");
        }
        System.out.println();
    }

    private static void createAndRollStandardDieFor1() {
        Die standard1 = new Die();
        int i = standard1.top();
        System.out.println("Roll a standard die for a 1 ...");
        if (i == 1) {
            System.out.print(i);
        }
        while (i != 1) {
            standard1.roll();
            System.out.print(standard1.top() + " ");
            i = standard1.top();
        }
        System.out.println();
    }

    private static void createAndRollTwelveSidedDieFor1() {
        Die twelveFor1 = new Die();
        int i = twelveFor1.top();
        System.out.println("Roll a twelve sided die for a 1 ...");
        if (i == 1) {
            System.out.print(i);
        }
        while (i != 1) {
            twelveFor1.roll();
            System.out.print(twelveFor1.top() + " ");
            i = twelveFor1.top();
        }
        System.out.println();
    }
}
