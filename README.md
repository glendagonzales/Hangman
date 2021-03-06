Hangman

Checkout the code:
    
    git clone git@github.com:glendagonzales/Hangman.git

Open up the project in IntelliJ IDEA as a new project. You should be able to run the code going to Run > Run 'Hangman' or using the keyboard shortcut shift + F10.

The goal is to implement 5 methods on Hangman in a test driven way that will allow us to play a game.

We have a stubbed out Hangman class that has all the methods we need to play a game. Some of those methods are implemented to save some time, but the main logic of the game needs to be implemented.

Read the documentation for each method carefully and write a test for each bit of logic that you implement. Write only enough code to make the test pass, even if it means not implementing any logic at all (the method returns false by default and that is result expected from your test). Work with a partner taking turns writing tests and implementing logic. If partner A writes a test, then partner B should implement the logic to make that test pass. Then partner B should write the test for the next bit of logic. Take turns writing tests and implementing logic until you're confident that your game works. Then uncomment the code to play the game. 

The Hangman class has 4 member variables:

    private String secretWord;        // the chosen secret word
    List<Character> correctLetters;   // correct guesses
    List<Character> incorrectLetters; // incorrect guesses
    private Scanner stdin = new Scanner(System.in); // for user input


These are the methods we need to implement to play the game:

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


There are 3 other methods that have been implemented for you so you can play the game

    /**
     * Prints the Hangman that corresponds to the given number of
     * wrong guesses so far.
     */
    public void printHangman() {
	    // Implemented for you
    }

    /**
     * Play one game of Hangman until
     * the user wins (guesses all of the letters in the secret word)
     * or loses (guesses 7 incorrect letters):
     */
    public void playGame() {
	    // Implemented for you
    }
    
    /**
     * Main method to play the game. Enjoy playing!
     */
    public static void main(String [] args) {
        // so we can play the game!
    }