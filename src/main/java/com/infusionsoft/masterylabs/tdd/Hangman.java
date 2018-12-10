package com.infusionsoft.masterylabs.tdd;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    private static String [] words =   //For game playing
            {"geography", "cat", "yesterday", "java", "truck", "opportunity",
                    "fish", "token", "transportation", "bottom", "apple", "cake",
                    "remote", "pocket", "terminology", "arm", "cranberry", "tool",
                    "caterpillar", "spoon", "watermelon", "laptop", "toe", "toad",
                    "fundamental", "capitol", "garbage", "anticipate", "apple"};

    protected String secretWord;        // the chosen secret word
    List<Character> correctLetters;   // correct guesses
    List<Character> incorrectLetters; // incorrect guesses

    private Scanner stdin = new Scanner(System.in); // for user input

    /**
     * Constructs a Hangman game.
     */
    public Hangman() {
        this.correctLetters = new ArrayList<Character>();
        this.incorrectLetters = new ArrayList<Character>();

        //Randomly choose a word from list of words
        //UNCOMMENT LINES BELOW TO PLAY WHEN DONE TESTING
        //Random randIndex = new Random();
        //int index = randIndex.nextInt(Hangman.words.length);
        //this.setSecretWord(Hangman.words[index]);
    }

    /**
     * Method for setting a secret word. This allows game play by
     * setting the secret word for character comparison and setting
     * the correct amount of '_' in the correct letters list.
     * @param secretWord the word to be guessed
     */
    protected void setSecretWord(String secretWord) {

    }

    /**
     * If the guessed letter (parameter guess) is in the secret word
     * then add it to the array list of correct guesses and tell the user
     *      that the guess was correct;
     * otherwise, add the guessed letter to the array list of incorrect
     *      guesses and tell the user that the guess was wrong.
     *
     * @param guess the guessed letter
     */
    public void handleGuess(char guess) {

    }

    /**
     * Returns true if the user has won the game; otherwise, return false.
     * The user has won the game when all the letters have been guessed.
     * If the secret word has not been set, the game cannot be won.
     *
     * @return true if the user has won, false otherwise
     */
    public boolean gameWon() {
        return false;
    }

    /**
     * Returns true if the user has lost the game; otherwise, return false.
     * The user has lost the game if he has guessed incorrectly 7 times.
     *
     * @return true if the user has lost, false otherwise
     */
    public boolean gameLost() {
        return false;
    }

    /**
     * Return true if the user has either won or lost the game; otherwise, return false.
     *
     * @return true if the user has won or lost, false otherwise
     */
    public boolean gameOver() {
        return false;
    }

    /**
     * Prints the Hangman that corresponds to the given number of
     * wrong guesses so far.
     */
    public void printHangman() {
        int poleLines = 6;   // number of lines for hanging pole
        System.out.println("  ____");
        System.out.println("  |  |");

        int badGuesses = this.incorrectLetters.size();
        if (badGuesses == 7) {
            System.out.println("  |  |");
            System.out.println("  |  |");
        }

        if (badGuesses > 0) {
            System.out.println("  |  O");
            poleLines = 5;
        }
        if (badGuesses > 1) {
            poleLines = 4;
            if (badGuesses == 2) {
                System.out.println("  |  |");
            } else if (badGuesses == 3) {
                System.out.println("  | \\|");
            } else if (badGuesses >= 4) {
                System.out.println("  | \\|/");
            }
        }
        if (badGuesses > 4) {
            poleLines = 3;
            if (badGuesses == 5) {
                System.out.println("  | /");
            } else if (badGuesses >= 6) {
                System.out.println("  | / \\");
            }
        }
        if (badGuesses == 7) {
            poleLines = 1;
        }

        for (int k = 0; k < poleLines; k++) {
            System.out.println("  |");
        }
        System.out.println("__|__");
        System.out.println();
    }

    /**
     * Play one game of Hangman until
     * the user wins (guesses all of the letters in the secret word)
     * or loses (guesses 7 incorrect letters):
     */
    public void playGame() {

        while (!gameOver()) {

            //Print the Hangman picture
            printHangman();

            //Print the correct guesses in the secret word
            for (int i = 0; i < this.correctLetters.size(); i++)
                System.out.print(this.correctLetters.get(i) + " ");

            //Print the incorrect letters that have been guessed
            System.out.print("\nWrong letters: ");
            for (int i = 0; i < this.incorrectLetters.size(); i++)
                System.out.print(this.incorrectLetters.get(i) + " ");

            //Prompt and read the next guess
            System.out.print("\nEnter a lower-case letter as your guess: ");
            String guess = stdin.nextLine();

            if (StringUtils.isNotBlank(guess)) {
                //Process the next guess
                handleGuess(guess.charAt(0));
            }
        }

        System.out.println("The secret word was: " + secretWord);
        if (gameWon()) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Sorry, you lost.");
            printHangman();
        }
    }

    /**
     * Main method to play the game. Enjoy playing!
     */
    public static void main(String [] args) {
        Hangman game = new Hangman();
        game.playGame();
    }
}
