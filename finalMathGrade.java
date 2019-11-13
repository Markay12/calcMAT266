import java.util.Scanner;

public class finalMathGrade{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Grade on exam 1: ");
    double exam1 = in.nextDouble();

    System.out.print("Grade on exam 2: ");
    double exam2 = in.nextDouble();

    System.out.print("Grade on exam 3: ");
    double exam3 = in.nextDouble();

    System.out.print("Quiz %: ");
    double quiz = in.nextDouble();

    System.out.print("HW %: ");
    double homew = in.nextDouble();


    System.out.print("Skills check %: ");
    double skill = in.nextDouble();

    System.out.print("Final exam: ");
    double finalg = in.nextDouble();

    double finalMathGrade = ((exam1 * 16.6667) + (exam2 * 16.6667) + (exam3 * 16.6667) +
    (quiz * 10) + (homew * 10) + (skill * 5) + (finalg * 25))/100;

    System.out.printf("You will have a: %.2f%s in the class\n\n", finalMathGrade, "%");

  }
}
