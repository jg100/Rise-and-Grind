/**
 * Creator: Joel Giannelli
 */

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {

        ArrayList<dataFile> dataLoad = new ArrayList<dataFile>();
        ArrayList<dataFile> backUpData = new ArrayList<dataFile>();


        try {
            System.out.println("!Loading Data...");
            for (dataFile data : dataFile.values()) {
                dataLoad.add(data);

            }
        } catch (Exception e) {
            System.out.println("An error has occurred. Please restart the program and try again ");
        }
        backUpData = (ArrayList<dataFile>) dataLoad.clone();

        System.out.println("!Loading completed...");

        ArrayList<String> posList = new ArrayList<String>();
        for(dataFile data : dataLoad) {
            posList.add(data.getPartOfSpeech());
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("----DICTIONARY 340 JAVA------");

        while (true) {
            dataLoad = (ArrayList<dataFile>) backUpData.clone();

            System.out.print("Search: ");
            String userInput = scan.nextLine().toLowerCase();
            String wordsUsed[] = {null,null,null};
            wordsUsed = userInput.split(" ");
            String searchWord = wordsUsed[0];
            if(searchWord.equalsIgnoreCase("!Q")) {
                System.out.println("----THANK YOU-----");
                break;
            }

            if(wordsUsed.length == 3 || wordsUsed.length == 2) {

                if (!validEntry(wordsUsed[1],posList) ) {
                    continue;
                }

                      if(wordsUsed.length ==  2) {
                          if (wordsUsed[1].equalsIgnoreCase("distinct")) {
                              dataLoad = (ArrayList<dataFile>) distinct(dataLoad).clone();

                          }
                          if(posList.contains(wordsUsed[1])) {
                              dataLoad = partOfSpeechFinder(wordsUsed[1],dataLoad);
                          }

                        }
                      if(wordsUsed.length == 3) {

                          if(posList.contains(wordsUsed[1])) {
                              dataLoad = (ArrayList<dataFile>) partOfSpeechFinder(wordsUsed[1],dataLoad).clone();
                          }
                          if (wordsUsed[2].equalsIgnoreCase("distinct") || wordsUsed[1].equalsIgnoreCase("distinct")) {
                              dataLoad = (ArrayList<dataFile>) distinct(dataLoad).clone();

                          }

                      }
            }
            System.out.println("|");
            int foundCount = 0;
            for (dataFile word : dataLoad) {
                if (word.getWord().equalsIgnoreCase(searchWord)) {
                    System.out.println(word.getWord() + ": " + " [" + word.getPartOfSpeech() + "] :" + word.getDefinition());
                    foundCount++;
                }


            }
            if (foundCount == 0) {
                System.out.println("<Not Found>");
            }
            System.out.println("|");
        }
    }


    private static boolean validEntry( String x, ArrayList<String> posList) {
        if(posList.contains(x) || x.equalsIgnoreCase("distinct")) {
            return true;
        }

        System.out.println("|\n<2nd Argument must be a part of speech or distinct>\n|");
        return false;
    }

    private static ArrayList<dataFile> distinct(ArrayList<dataFile> dataLoad) {
        ArrayList<dataFile> placeHolder = (ArrayList<dataFile>) dataLoad.clone();

        for (int i = 0; i < placeHolder.size(); i++) {
            dataFile currentObject = placeHolder.get(i);

            for (int k = i + 1; k < placeHolder.size(); k++) {
                dataFile comparedObject = placeHolder.get(k);
                if (currentObject.getDefinition().equals(comparedObject.getDefinition()) &&
                currentObject.getPartOfSpeech().equals(comparedObject.getPartOfSpeech())) {
                    placeHolder.remove(comparedObject);
                    k--;
                }
            }

        }

        return placeHolder;
    }
    public static ArrayList<dataFile> partOfSpeechFinder(String POS, ArrayList<dataFile> dataLoad) {

        ArrayList<dataFile> placeHolder = new ArrayList<dataFile>();

        for(int i = 0; i < dataLoad.size(); i++) {
            dataFile currentData = dataLoad.get(i);
            if(currentData.getPartOfSpeech().equalsIgnoreCase(POS)) {
                placeHolder.add(currentData);
            }
        }
        return placeHolder;
    }
}
