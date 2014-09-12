package com.infusionsoft.masterylabs.tdd;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HangmanTest {

    @Test
    public void testSetSecretWord() {
        Hangman hangman = new Hangman();
        hangman.setSecretWord("whatever");
        Assert.assertEquals(hangman.secretWord, "whatever");
    }

    @Test
    public void testSetSecretWordHasCorrectLetters(){
        Hangman hangman = new Hangman();
        final String expected = "whatever";
        hangman.setSecretWord(expected);
        Assert.assertEquals(hangman.secretWord, expected);
        final List<Character> correctLetters = hangman.correctLetters;
        Assert.assertEquals(correctLetters.size(), expected.length(), "Should have the correct number of _");
        for (char correctLetter : correctLetters) {
            Assert.assertEquals(correctLetter, '_', "This should be an _");
        }
    }
}