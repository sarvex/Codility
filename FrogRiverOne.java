public class FrogRiverOne {
  public static int solution(int X, int[] A) {
    int steps = X;
    boolean[] bitmap = new boolean[steps+1];

    for (int i = 0; i < A.length; i++) {
      if (!bitmap[A[i]]) {
        bitmap[A[i]] = true;
        steps--;
      }
      if (steps == 0) return i;
    }
    return -1;
  }

  public static void main (String[] args) {
    int [] array = new int [] {1, 3, 1, 4, 2, 3, 5, 4};
    System.out.println(solution(5, array));
  }
}
