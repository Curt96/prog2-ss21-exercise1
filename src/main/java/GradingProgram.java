import java.util.ArrayList;
import java.util.List;

public class GradingProgram {
    public static boolean studentAmount(int students) { //ist dann auch die anzahl der Noten = Länge vom Array
        if (students < 1 || students > 60) {
            return false;
        } else
            return true;
    }

    public static boolean gradePoints(int points) {
        if (points < 0 || points > 100) {
            return false;
        } else {
            return true;
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> studentsGrades = new ArrayList<>();
        for (Integer i : grades) {
            System.out.println(i + " Vor dem if");
            Integer singleGrade = i;
            if (singleGrade > 37 && (singleGrade % 5 >= 3)) { //wenn es näher zu 5 ist aufrunden
                System.out.println(singleGrade + " Im if vor dem runden");
                singleGrade = singleGrade + (5 - singleGrade % 5); //53 % 5 = 3 -> 53 + ( 5 - 3(=actual[i] %5)  = 55
                System.out.println(singleGrade + " nach dem runden");
            }
                else {
                System.out.println(singleGrade + " Im else");
            }
            studentsGrades.add(singleGrade);
        }
        return studentsGrades;
   /* public static int[] roundGrade(int[] actual) {
        for (int i = 0; i < actual.length; i++) {
            System.out.println("for dem if " + actual[i]);
            if (actual[i] > 37 && (actual[i] %5 >= 3)){ //wenn es näher zu 5 ist aufrunden
                System.out.println("Im ersten if vor dem runden " + actual[i]);
                actual[i] = actual[i] + (5 - actual[i] % 5); //53 % 5 = 3 -> 53 + ( 5 - 3(=actual[i] %5)  = 55
                System.out.println("nach dem runden " + actual[i]);
            }
            /*if (actual[i] > 37 && ((actual[i] %5 ==2 || actual[i] %5 ==1))){ //wenn es näher zu 0 ist abrunden
                System.out.println("im zweiten if ");
                actual[i] = actual[i] - actual[i] %5;
                System.out.println("nach runden im 2ten if " + actual[i]);
            }
        }
        return actual;
    } */
        }
}



