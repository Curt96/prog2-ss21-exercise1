import java.util.ArrayList;
import java.util.List;

public class GradingProgram {

    public static final int MINIMAL_POINTS = 37;
    public static final int MODULO_FACTOR = 5;
    public static final int SCHWELLE = 3;

    protected static boolean studentAmount(int students) {
        return (students > 0 && students <= 60);
    }

    protected static boolean gradePoints(int points) {
        return points >= 0 && points <= 100;
    }

    protected static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> studentsGrades = new ArrayList<>();
        if (studentAmount(grades.get(0))) {
            for (int i = 1; i < grades.size(); i++) {
                studentsGrades.add(roundGrade(grades.get(i)));
            }
        }
        return studentsGrades;
    }

    protected static Integer roundGrade(Integer singleGrade) {
        int finaleGrade = singleGrade;
        if (gradePoints(singleGrade)) {
            if (singleGrade > MINIMAL_POINTS && (singleGrade % MODULO_FACTOR >= SCHWELLE)) {
                finaleGrade += (MODULO_FACTOR - singleGrade % MODULO_FACTOR);
            }
        }
        return finaleGrade;
    }

    public static boolean passed_Exam(int pointsOccursaFail) {
        return pointsOccursaFail > 40;
    }

    public static int students(List<Integer> studentsGradesActual) {
            return studentsGradesActual.get(0);
    }
}



