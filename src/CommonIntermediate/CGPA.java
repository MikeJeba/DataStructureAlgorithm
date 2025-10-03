package CommonIntermediate;
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("\nEnter details for Subject " + i + ":");
            System.out.print("Enter credits for Subject " + i + ": ");
            double credits = scanner.nextDouble();
            System.out.print("Enter grade points for Subject " + i + ": ");
            double gradePoints = scanner.nextDouble();

            totalCredits += credits;
            totalGradePoints += (credits * gradePoints);
        }

        double cgpa = totalGradePoints / totalCredits;

        System.out.println("\nCGPA: " + cgpa);

        scanner.close();
    }
}
