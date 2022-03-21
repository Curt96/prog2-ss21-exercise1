import java.util.ArrayList;
import java.util.List;

public class GradingProgram {

    public static final int MINIMAL_POINTS = 37;
    public static final int MODULO_FACTOR = 5;
    public static final int SCHWELLE = 3;

    protected static boolean studentAmount(int students) { //ist dann auch die anzahl der Noten = Länge vom Array
        return (students > 0 && students <= 60);
    }

    protected static boolean gradePoints(int points) {
        return points >= 0 && points <= 100;
    }

    protected static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> studentsGrades = new ArrayList<>();
        for (Integer index : grades) {
            studentsGrades.add(roundGrade(index));
        }
        return studentsGrades;
    }

    protected static Integer roundGrade(Integer singleGrade) {
        int finaleGrade = singleGrade;
        if (singleGrade > MINIMAL_POINTS && (singleGrade % MODULO_FACTOR >= SCHWELLE)) {
            finaleGrade += (MODULO_FACTOR - singleGrade % MODULO_FACTOR);
        }
        return finaleGrade;
    }

    public static Object totalStudent(List<Integer> studentsAndGrades) {
        Integer students;

        students = studentsAndGrades.get(0);
        return students;
    }
}



