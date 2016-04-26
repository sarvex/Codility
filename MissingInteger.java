import java.util.Arrays;

public class MissingInteger {
  public static int solution(int[] A) {
    boolean [] bitmap = new boolean[A.length];

    for(int number: A){
      if (0 < number && number < bitmap.length + 1) {
        bitmap[number - 1] = true;
      }
    }

    for(int i = 0; i < bitmap.length; i++) {
      if (bitmap[i] == false) return i + 1;
    }

    return bitmap.length;
  }

  public static void main (String [] args) {
    int[] array = new int [] {1, 3, 6, 4, 1, 2};
    System.out.println(solution(array));
  }

}
