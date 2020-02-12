/**
 * Creator: Joel Giannelli
 */

import java.util.*;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {

        ArrayList<dataFile> dataLoad = new ArrayList<dataFile>();

        try {
            System.out.println("!Loading Data...");
            for (dataFile data : dataFile.values()) {
                dataLoad.add(data);

            }
        } catch (Exception e) {
            System.out.println("An error has ocured. Please restart the program and try again ");
        }

        System.out.println("!Loading completed...");
        //CHECKING MY WORK TO MAKE SURE ARRAY-LIST IS THE CORRECT SIZE
        System.out.println(dataLoad);


        //User input/search
        Scanner scan = new Scanner(System.in);
        String userInput = null;
        System.out.println("----DICTIONARY 340 JAVA------");


        //looping while to make sure search continues until canceled by user
        while (true) {
            System.out.print("Search: ");
            userInput = scan.nextLine().toLowerCase();

            System.out.println("|");
            //Basic word searching return
            for (dataFile word : dataLoad) {
                if (word.getWord().equalsIgnoreCase(userInput) ){
                    System.out.println(word.getWord() + ": " + " [" + word.getPartOfSpeech() + "] :" + word.getDefinition());
                }
            }
        }
       // System.out.println("------THANK YOU-------");
    }


}



