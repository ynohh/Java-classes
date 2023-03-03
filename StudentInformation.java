public class StudentInformation {
    int registration;
    String name;
    float firstTest;
    float secondTest;
    float assignment;
    float exam;
    float gradeMean;

    float calculateMean(float n1, float n2, float n3, float n4) {
      return (n1 + n2 + n3 + n4) / 4.0f;
    }
}