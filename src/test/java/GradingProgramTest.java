import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GradingProgramTest {
    // Input Students 1 <= n <= 60
    // Input 0 <= grades i <= 100
    // Grade less 40 is failing Grade

    //testing if the students amount is valid
    @Test
    void studentAmount_is_valid() {
        int students = 47;
        assertTrue(GradingProgram.studentAmount(students));
    }
    //test zuviele Students
    @Test
    void studentAmount_to_high() {
        int students = 100;
        assertFalse(GradingProgram.studentAmount(students));
    }
    //zu wenig students
    @Test
    void studentAmout_to_low(){
        int students = 0;
        assertFalse(GradingProgram.studentAmount(students));
    }

    //testing if grade is valid
    @Test
    void validGradesPoints_() {
        int points = 40;
        assertTrue(GradingProgram.gradePoints(points));
    }
    @Test
    void gradesPoints_to_low() {
        int points = -20;
        assertFalse(GradingProgram.gradePoints(points));
    }
    @Test
    void GradesPoints_to_high() {
        int points = 140;
        assertFalse(GradingProgram.gradePoints(points));
    }

    //testing if grades correct rounded
    @Test
    void gradingStudents_valid_list() {
        List<Integer> studentsGradesActual = new ArrayList<>(Arrays.asList(4, 73, 67, 38, 33)); //https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
        List<Integer> studentsGradesExpected = new ArrayList<>((Arrays.asList(75, 67, 40, 33)));

        assertEquals(studentsGradesExpected, GradingProgram.gradingStudents(studentsGradesActual));
    }
    @Test
    void first_int_is_Student_Amount() {
        List<Integer> studentsGradesActual = new ArrayList<>(Arrays.asList(4 ,73, 67, 38, 33));

        assertEquals(4,GradingProgram.students(studentsGradesActual));
    }

    @Test
    void roundGrade_too_low() {
        int actual = GradingProgram.roundGrade(30);
        int expected = 30;
        assertEquals(expected,actual);
    }

    @Test
    void roundGrade_in_range_minimum() {
        int actual = GradingProgram.roundGrade(38);
        int expected = 40;
        assertEquals(expected,actual);
    }
    @Test
    void roundGrade_in_normal_range() {
        int actual = GradingProgram.roundGrade(54);
        int expected = 55;
        assertEquals(expected,actual);
    }
    @Test
    void grade_not_to_round() {
        int actual = GradingProgram.roundGrade(62);
        int expected = 62;
        assertEquals(expected, actual);
    }
    @Test
    void points_marked_as_failed_Exam(){
        int points = 30;

        assertFalse(GradingProgram.passed_Exam(points));
    }
    @Test
    void points_marked_as_passed_Exam() {
        int points = 50;
        assertTrue(GradingProgram.passed_Exam(points));
    }
}
