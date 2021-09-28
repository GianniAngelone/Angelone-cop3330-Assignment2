package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class checkAnagramTest {

    @Test
    @DisplayName("Compare two strings to see if they are anagrams:")

    public void isAnagram(String a, String b) {
        a = "note";
        b = "tone";
        isAnagram(a,b);
    }
}