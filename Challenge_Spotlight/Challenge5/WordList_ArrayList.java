/* 
 * Program featuring an array to store and interactively manipulate a list of words. 
 */
package arraylistplay;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordList {
    // VARIABLES LOCAL TO THE CLASS, AND HENCE GLOBAL TO THE METHODS
    private static final int LIMIT = 1000;
    private static ArrayList<String> words2 = new ArrayList<>();
    private static int numberOfWords = 0;
    private static Scanner commandReader = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // ESTABLISH THE ARRAY OF NUMBERS
            readWords();
            // CHECK THE DATA
            System.out.println("The original list of words ...");
            displayWords();
            // ENTER THE INTERPRETER
            interpreter();
        } catch (FileNotFoundException ex) {
            System.out.println("The file was not found. Please think again.");
            System.exit(-1);
        }
    }

    // Assuming that the data file will be found in the public_html/data
    // subdirectory of the user’s home directory.
    private static Scanner establishScanner(String fn) throws FileNotFoundException {
        String separator = File.separator;
        String homeDirectory = System.getProperty("user.home");
        String path = homeDirectory + separator + "CS1Files" + separator + "data" + separator;
        String fullFileName = path + fn;
        return new Scanner(new File(fullFileName));
    }

    private static void readWords() throws FileNotFoundException {
        Scanner scanner = establishScanner("WordSet.txt");
        while (scanner.hasNext()) {
            words2.add(scanner.next());
            numberOfWords = numberOfWords + 1;
        }
    }

    private static void displayWords() {
        for (int x = 0; x < numberOfWords; x = x + 1) {
            System.out.println(words2.get(x));
        }
    }

    private static void interpreter() {
        System.out.print(">>> ");
        String command = commandReader.next();
        if (command.equalsIgnoreCase("DISPLAY")) {
            interpreterDisplayCommand();
        } else if (command.equalsIgnoreCase("PRINT")) {
            interpretPrintCommand();
        } else if (command.equalsIgnoreCase("SWAP")) {
            interpretSwapCommand();
        } else if (command.equalsIgnoreCase("ADD")) {
            interpretAddCommand();
        } else if (command.equalsIgnoreCase("HELP")) {
            interpretHelpCommand();
        } else if (command.equalsIgnoreCase("EXIT")) {
            System.exit(0);
        } else {
            System.out.println("### Unrecognizable command: " + command);
        }
        interpreter();
    }

    private static void interpreterDisplayCommand() {
        displayWords();
    }

    private static void interpretPrintCommand() {
        String operand = commandReader.next();
        if (operand.equalsIgnoreCase("FIRST")) {
            System.out.println(words2.get(0));
        } else if (operand.equalsIgnoreCase("LAST")) {
            System.out.println(words2.get(numberOfWords - 1));
        } else {
            int index = Integer.valueOf(operand);
            System.out.println(words2.get(index - 1));
        }
    }

    private static void interpretHelpCommand() {
        System.out.println("HELP - display a menu of commands");
        System.out.println("DISPLAY - display the list of words");
        System.out.println("PRINT - print a word (FIRST;LAST;nth)");
        System.out.println("SWAP - exchange two elements (nth;mth)");
        System.out.println("ADD - add a word to the list (FIRST;LAST)");
        System.out.println("EXIT - terminate execution of the program");
    }

    private static void interpretSwapCommand() {
        int position1 = commandReader.nextInt();
        int position2 = commandReader.nextInt();
        String temp = words2.get(position1);
        words2.set(position1, words2.get(position2));
        words2.set(position2, temp);
    }

    private static void interpretAddCommand() {
        String position = commandReader.next();
        if (position.equalsIgnoreCase("LAST")) {
            addLast();
        } else if (position.equalsIgnoreCase("FIRST")) {
            addFirst();
        } else {
            System.out.println("### invalid operand for add command");
        }
        numberOfWords = numberOfWords + 1;
    }

    private static void addLast() {
        words2.add(commandReader.next());
    }

    private static void addFirst() {
        words2.add(0, commandReader.next());
    }
}
