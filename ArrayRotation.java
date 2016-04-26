import java.util.Arrays;

class ArrayRotation {
    public static int[] solution(int[] A, int K) {
        int length = A.length;
        if (length < 2) return A;

        K %= length;
        int pivot = length - K;
        int result[] = new int[length];

        System.arraycopy(A, pivot, result, 0, K);
        System.arraycopy(A, 0, result, K, pivot);

        return result;
    }

    public static void main (String[] args){
      int [] array = new int[] {3, 8, 9, 7, 6};
      System.out.println(Arrays.toString(solution(array, 8)));
    }
}
