package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class employeeRemovalTest {

    @Test
    void employeeNameRemoval(String args) {
        String[] employeesArray = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        int size = employeesArray.length;
        String name;
        employeeNameRemoval("John Smith");
        assertEquals(4, employeesArray.length);
    }
}