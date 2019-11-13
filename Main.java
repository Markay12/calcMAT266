import javax.swing.JFrame;

public class Main{
  public static void main(String[] args) {

    // create calculator frame

    JFrame calculator = new JFrame();

    calculator.setBounds(10, 10, 850, 850);
    GradeCalculator grade = new GradeCalculator();
    // set JFrame properties
    calculator.setTitle("MAT266 Final Grade Calculator");
    calculator.setResizable(true);
    calculator.setVisible(true);
    calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    calculator.add(grade);

  }
}
