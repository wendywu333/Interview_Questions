/**
 * 
 */

/**
 * @author Wenzhe
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class K_diff {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution.
         */
        int result = 0;
        Scanner sin = new Scanner(System.in);
        int N = sin.nextInt();
        int K = sin.nextInt();
        int num[] = new int[N];
        while (N > 0) {
            num[N-1] = sin.nextInt();
            N--;
        }
        Arrays.sort(num);
        for (int j = 0; j < num.length - 1; j++) {
            int number1 = num[j];
            for (int i = j + 1; i < num.length; i++) {
                int number2 = num[i];
                if (number2 - number1 == K) {
                    result++;
                    break;
                }
                if (number2 - number1 > K)
                    break;
            }
        }
        System.out.println(result);
    }
}
