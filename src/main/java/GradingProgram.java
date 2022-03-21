import java.util.ArrayList;
import java.util.List;

public class GradingProgram {
    protected static boolean studentAmount(int students) { //ist dann auch die anzahl der Noten = Länge vom Array
        return (students > 0 && students <= 60);
    }

    protected static boolean gradePoints(int points) {
        return points >= 0 && points <= 100;
    }

    protected static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> studentsGrades = new ArrayList<>();
        for (Integer index : grades) {
            System.out.println(index + " Vor dem if");
            studentsGrades.add(roundGrade(index));
        }
        return studentsGrades;
    }

    protected static Integer roundGrade(Integer singleGrade) {
        int finaleGrade = singleGrade;
        if (singleGrade > 37 && (singleGrade % 5 >= 3)) { //wenn es näher zu 5 ist aufrunden
            System.out.println(singleGrade + " Im if vor dem runden");
            finaleGrade += (5 - singleGrade % 5); //53 % 5 = 3 -> 53 + ( 5 - 3(=actual[i] %5)  = 55
            System.out.println(singleGrade + " nach dem runden");
        } else {
            System.out.println(singleGrade + " Im else");
        }
        return finaleGrade;
    }

    public static Object totalStudent(List<Integer> studentsAndGrades) {
        Integer students;

        students = studentsAndGrades.get(0);
        return students;
    }
}



