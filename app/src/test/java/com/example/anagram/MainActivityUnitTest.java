package com.example.anagram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainActivityUnitTest {

    @Test
    public void all_letters_isCorrect() {
        assertEquals("qwer1ty", new Anagram().getAnagram("ytre1wq"));
    }

    @Test
    public void all_chars_isCorrect() {
        assertEquals("!.23", new Anagram().getAnagram("!.23"));
    }

    @Test
    public void center_chars_isCorrect() {
        assertEquals("qwe234r1ty", new Anagram().getAnagram("ytr234e1wq"));
    }

    @Test
    public void empty_string_isCorrect() {
        assertEquals("", new Anagram().getAnagram(""));
    }

    @Test
    public void single_char_isCorrect() {
        assertEquals("&", new Anagram().getAnagram("&"));
    }

    @Test
    public void single_letter_isCorrect() {
        assertEquals("w", new Anagram().getAnagram("w"));
    }

    @Test
    public void left_part_of_chars_isCorrect() {
        assertEquals("57598asd", new Anagram().getAnagram("57598dsa"));
    }

    @Test
    public void some_words_isCorrect() {
        assertEquals("asd!f hj2-kl", new Anagram().getAnagram("fds!a lk2-jh"));
    }

}