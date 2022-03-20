import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GradingProgramTest {
    // Input Students 1 <= n <= 60
    // Input grade 0 <= grades i <= 100
    // Input enthält nur Zahlen?
    // Grade less 40 is failing Grade
    //

    //testing if the students amount is valid
    @Test
    void studentAmount_Scenario1() {
        int students = 60;
        assertTrue(GradingProgram.studentAmount(students));
    }
    // testing if input is int

    //testing if grade is valid
    @Test
    void validGradesPoints() {
        int points = 40;
        assertTrue(GradingProgram.gradePoints(points));
    }

    //testing if grades correct rounded
    @Test
    void gradingStudents_Scenario1() {
        List<Integer> studentsGradesActual = new ArrayList<>(Arrays.asList(73, 67, 38, 33)); //https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
        List<Integer> studentsGradesExpected = new ArrayList<>((Arrays.asList(75, 67, 40, 33)));

        assertEquals(studentsGradesExpected, GradingProgram.gradingStudents(studentsGradesActual));
        //testing if grade is right rounded
    /*@Test
    void roundGrade_scenario_1(){
        int[] actual = {73, 67, 38, 33};
        int[] expected = {75, 67, 40, 33};

        assertArrayEquals(expected,GradingProgram.roundGrade(actual));
    } */
    }

}
