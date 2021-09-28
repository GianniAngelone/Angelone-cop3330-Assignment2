package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkPasswordTest {

    @Test
    int passwordValidator(String password) {
        assertEquals(1, passwordValidator("12345"));
        return 1;
    }
}