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
        assertEquals("qwer1ty", new MainActivity().getAnagram("ytre1wq"));
    }

    @Test
    public void all_chars_isCorrect() {
        assertEquals("!.23", new MainActivity().getAnagram("!.23"));
    }

    @Test
    public void center_chars_isCorrect() {
        assertEquals("qwe234r1ty", new MainActivity().getAnagram("ytr234e1wq"));
    }

    @Test
    public void empty_string_isCorrect() {
        assertEquals("", new MainActivity().getAnagram(""));
    }

    @Test
    public void single_char_isCorrect() {
        assertEquals("&", new MainActivity().getAnagram("&"));
    }

    @Test
    public void single_letter_isCorrect() {
        assertEquals("w", new MainActivity().getAnagram("w"));
    }

    @Test
    public void left_part_of_chars_isCorrect() {
        assertEquals("57598asd", new MainActivity().getAnagram("57598dsa"));
    }

    @Test
    public void some_words_isCorrect() {
        assertEquals("asd!f hj2-kl", new MainActivity().getAnagram("fds!a lk2-jh"));
    }

}