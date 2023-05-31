import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AnagramShould {



    @Test
    void know_that_the_same_phrases_are_anagrams() {

        //arrange
        Anagram anagram = new Anagram();

        //act

        //assert

        assertFalse(anagram.areAnagrams("Debit Card", "Debit Card"));
    }

    @Test
    void know_that_phrases_with_special_chars_are_anagrams() {

        //arrange
        Anagram anagram = new Anagram();

        //act

        //assert

        assertTrue(anagram.areAnagrams("Cash Lost In 'Em", "Slot Machines"));
    }



    @Test
    void know_anagrams() {

        //arrange
        Anagram anagram = new Anagram();

        //act

        //assert

        assertTrue(anagram.areAnagrams("Debit Card", "Bad Credit"));
    }

    @Test
    void approval(){

        //arrange

        Anagram anagram = new Anagram();

        String[] input = new String[]{"Debit Card", "Cash Lost In 'Em", "School Master", "Mother-In-Law", "Your Mind", "Parliament", "Bad Credit", "Slot Machines", "Mental Pair", "The Classroom", "Woman Hitler", "Rumoydin", "Ear Implant"};

        //act

        String match = "[";

        String matchingPhrases = "";

        for (String phrase : input) {
            match += "[" + phrase;
            for (String phrase2 : input) {
            if (anagram.areAnagrams(phrase, phrase2)){
                matchingPhrases += ", " + phrase2;
                }

            }

            match += matchingPhrases + "], ";
            matchingPhrases = "";
        }

        match = match.substring(0,match.length()-2);

        match += "]";


        //assert

       // Approvals.verify("[[Debit Card, Bad Credit], [Cash Lost In 'Em, Slot Machines], [School Master, The Classroom], [Mother-In-Law, Woman Hitler], [Your Mind, Rumoydin], [Parliament, Mental Pair, Ear Implant]");

        Approvals.verify(match);

    }



}
