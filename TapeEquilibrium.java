import java.util.Arrays;

public class TapeEquilibrium {
  public static int solution(int[] A, int N) {
    int lower = A[0];
    int upper = A[N - 1];
    for (int i = 1; i < N - 1; i++) {
      upper += A[i];
    }

    int result = Math.abs(upper - lower);

    for (int i = 1; i < N - 1; i++) {
      upper -= A[i];
      lower += A[i];
      result = Math.min(result, Math.abs(upper - lower));
    }

    return result;
  }

  public static void main(String [] args) {
    int [] array = new int[]{3, 1, 2, 4, 3};
    System.out.println(solution(array, array.length));
  }
}
