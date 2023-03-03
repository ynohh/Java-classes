public class Main {
  public static void main(String[] args) {
    StudentInformation student1 = new StudentInformation();

    student1.registration = 1;
    student1.name = "Yago";
    student1.firstTest = 3.5f;
    student1.secondTest = 5.7f;
    student1.assignment = 7.2f;
    student1.exam = 4.8f;

    System.out.println(student1.calculateMean(student1.firstTest, student1.secondTest, student1.assignment, student1.exam));

  }
}