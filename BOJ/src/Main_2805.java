import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main_2805 {
    static long answer=0;
    public static void check(long min, long max,  long M, Integer[] trees) {
        if (min > max) return;
        long mid = (min + max) / 2;
        long cur = 0;
        for (int t: trees) {
            if (t > mid) {
                cur += t-mid;
            }
        }
//        System.out.println(mid + " "+ cur);
        if (cur >= M) {
            if (answer < mid) {
                answer = mid;
            }
            check(mid+1, max, M, trees);

        } else {
            check(min, mid-1, M, trees);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        long M = Integer.parseInt(input.split(" ")[1]);
        String [] tInput = br.readLine().split(" ");
        Integer [] trees = new Integer[N];
        long max = 0;
        for (int i=0; i<N; i++) {
            trees[i] = Integer.parseInt(tInput[i]);
            if (trees[i] > max) {
                max = trees[i];
            }
        }
        check(0, max, M, trees);
        System.out.println(answer);
    }
}

