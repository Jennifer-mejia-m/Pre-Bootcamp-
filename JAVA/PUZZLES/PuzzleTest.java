package PUZZLES;

import java.util.ArrayList;
import java.util.Random;

public class PuzzleTest {

    public static void main(String[] args) {
        
    Puzzle cartoon = new Puzzle();

    ArrayList<Integer> rolls = new ArrayList<>();
    cartoon.getTenRolls(rolls);  


    System.out.println(cartoon.getRandomLetter());

    System.out.println(cartoon.generatePassword());

    System.out.println(cartoon.getNewPasswordSet(7));

    }
}
