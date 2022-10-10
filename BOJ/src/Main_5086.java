import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);
            if (a == 0 && b == 0) {
                break;
            } else {
                if (b % a == 0) {
                    System.out.println("factor");
                } else if (a % b == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            }
        }
    }
}

//8 16
//32 4
//17 5
//0 0