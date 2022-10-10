import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] lst = new int[T];
        int sum = 0;
        for (int tc=0; tc<T; tc++) {
            int n = Integer.parseInt(br.readLine());
            lst[tc] = n;
            sum += n;
        }
        Arrays.sort(lst);
        int ava = (int) Math.round((double) sum / T);
        int center = lst[(T/2)];
        int mostI = 0;
        int gap = lst[T-1] - lst[0];
        int mostV = 0;
        int mostVcnt = 0;
        Map<Integer, Integer> mostCheck = new HashMap<>();

        for (Integer i : lst) {
            Integer count = mostCheck.get(i);
            if (count == null) {
                mostCheck.put(i, 1);
            } else {
                mostCheck.put(i, count+1);
            }
        }

        List<Integer> mostKey = new ArrayList<>(mostCheck.keySet());
        Collections.sort(mostKey);
        for (Integer key : mostKey) {
            if (mostCheck.get(key) > mostV) {
                mostV = mostCheck.get(key);
                mostVcnt = 1;
                mostI = key;
            } else if (mostCheck.get(key) == mostV) {
                if (mostVcnt <= 1) {
                    mostVcnt++;
                    mostI = key;
                }
            }
        }

        System.out.println(ava);
        System.out.println(center);
        System.out.println(mostI);
        System.out.println(gap);
    }
}

