import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        for (String s : input.split(" ")) {
            int num = Integer.parseInt(s);
            if (num == 1) {
                continue;
            }
            int flag = 1;
            for (int i=2; i < num; i++) {
                if (num % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                res++;
            }
        }
        System.out.print(res);
    }
}

