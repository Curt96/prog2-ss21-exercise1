import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradingProgramTest {
    // Input Students 1 <= n <= 60
    // Input grade 0 <= grades i <= 100
    // Input enthält nur Zahlen?
    // Grade less 40 is failing Grade
    //

//testing if the students amount is valid
    @Test
    public void studentAmount_Scenario1() {
        int students = 60;
        assertTrue(GradingProgram.studentAmount(students));
    }
    // testing if input is int

    //testing if grade is valid
    @Test
    public void validGradesPoints() {

        assertTrue(GradingProgram.gradePoints());
    }
    //
}
