import java.util.Arrays;

class OddOccurance {
  public static int solution(int[] A) {
        int result = 0;
        for (int number: A) {
            result ^= number;
        }
        return result;
    }

    public static void main (String[] args) {
      int[] array = new int[] {9, 3, 9, 3, 9, 7, 9};
      System.out.println(solution(array));
    }
}
