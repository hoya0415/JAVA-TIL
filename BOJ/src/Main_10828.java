import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10828 {
    public static int[] setStack(String command, int[] stack) {
        System.out.println(command);
        if (command.split(" ")[0].equals("push")) {
            int num = Integer.parseInt(command.split(" ")[1]);
            int[] tmpStack = new int[stack.length+1];
            tmpStack[0] = num;
            for (int i=0; i<stack.length; i++) {
                tmpStack[i+1] = stack[i];
            }
            return tmpStack;
        } else if (command.equals("pop")) {
            if (stack.length == 0) {
                System.out.println(-1);
                return stack;
            }
            System.out.println(stack[0]);
            int[] tmpStack = new int[stack.length-1];
            for (int i=1; i<stack.length; i++) {
                tmpStack[i-1] = stack[i];
            }
            return tmpStack;
        } else if (command.equals("size")) {
            System.out.println(stack.length);
            return stack;
        } else if (command.equals("empty")) {
            if (stack.length == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return stack;
        } else if (command.equals("top")) {
            if (stack.length == 0) {
                System.out.println(-1);
            } else {
                System.out.println(stack[0]);
            }
            return stack;
        } else {
            return stack;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[0];
        for (int i=0; i<=n; i++) {
            String command = br.readLine();
            System.out.println(command);
            stack = setStack(command, stack);
        }
    }
}

