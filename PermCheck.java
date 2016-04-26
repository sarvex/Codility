public class PermCheck {
  public static int solution (int[] A) {
    int length = A.length;
    System.out.println(length);
    boolean[] bitmap = new boolean[length];

    for(int i = 0; i < length; i++) {
      if(1 > A[i] || A[i] > length) {
        return 0;
      } else if(bitmap[A[i] - 1] == true) {
        return 0;
      } else {
        bitmap[A[i] - 1] = true;
      }
    }

    return 1;
  }

  public static void main (String[] args) {
    int [] array1 = new int [] {4, 1, 3, 2};
    int [] array2 = new int [] {4, 1, 3};
    System.out.println(solution(array1));
    System.out.println(solution(array2));
  }
}
