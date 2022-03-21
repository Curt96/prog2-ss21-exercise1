import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Students should between 1 and 60")
    void studentAmount_Scenario1() {
        int students = 47;
        assertTrue(GradingProgram.studentAmount(students));
    }
    //test zuviele Students
    @Test
    void studentAmount_Scenario2() {
        int students = 100;
        assertFalse(GradingProgram.studentAmount(students));
    }
    //zu wenig students
    @Test
    void studentAmout_Scenario3(){
        int students = 0;
        assertFalse(GradingProgram.studentAmount(students));
    }

    //testing if grade is valid
    @Test
    void validGradesPoints_Scenario1() {
        int points = 40;
        assertTrue(GradingProgram.gradePoints(points));
    }
    @Test
    void validGradesPoints_Scenario2() {
        int points = -20;
        assertFalse(GradingProgram.gradePoints(points));
    }
    @Test
    void validGradesPoints_Scenario3() {
        int points = 140;
        assertFalse(GradingProgram.gradePoints(points));
    }

    //testing if grades correct rounded
    @Test
    void gradingStudents_Scenario1() {
        List<Integer> studentsGradesActual = new ArrayList<>(Arrays.asList(4, 73, 67, 38, 33)); //https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
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
    //testing if first Entry of List is the studentAmount
    @Test
    void studentAmountDeclared() {
        List<Integer> studentsAndGrades = new ArrayList<>(Arrays.asList(4, 73, 67, 38, 33));
        List<Integer> students = new ArrayList<>(List.of(4));

       // assertArrayEquals(students,GradingProgram.totalStudent(studentsAndGrades));
    }

}
