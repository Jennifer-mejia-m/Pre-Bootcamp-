package PUZZLES;

import java.util.ArrayList;
import java.util.Random;


public class Puzzle {

    Random jenn = new Random();
    

    void getTenRolls(ArrayList<Integer> rolls){
        int i = 0;
        while (i<10) {
            rolls.add(jenn.nextInt(20)+1);   
            i++;        
        }
        System.out.println(rolls); 
    }

    public String getRandomLetter () {
        Random jenn = new Random();

        String Abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String [] alfabet = new String [26];
        for (int i= 1; i<26; i++) {
            alfabet[i] = String.valueOf(Abecedario.charAt(i));
        }

        return alfabet[jenn.nextInt(26)];

    }    

    public String generatePassword () {
        String password = "";
        for (int i= 0; i<8; i++) {
           password = password + getRandomLetter();
        }

        return password;

    }    

    public ArrayList<String> getNewPasswordSet (int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i=0; i<length; i++) {
            passwordSet.add(generatePassword());
        }
        
        return passwordSet;
        
    }
    
}
