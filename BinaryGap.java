class BinaryGap {
    public static int solution(int N) {
        int gap = -1;
        int max = 0;

        while (N > 0) {
            int bit = N & 1;
            if (bit == 1) {
                if (gap > 0) {
                    max = Math.max(max, gap);
                }
                gap = 0;
            } else if (gap >= 0){
                gap++;
            }
            N >>= 1;
        }
        return max;
    }

    public static void main (String[] args) {
      System.out.println(solution(1024));
    }
}
