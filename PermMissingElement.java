public class PermMissingElement {
  public static int solution (int [] A) {
    long result = 0L;
    int length = A.length;
    long sum = (long)(length + 1) * (length + 2) / 2;

    for (int number: A) {
      result += number;
      System.out.println(result);
    }

    return (int)(sum - result);
  }

  public static void main(String[] args) {
    int [] array = new int [] {2, 3, 1, 5};
    System.out.println(solution(array));
  }
}
