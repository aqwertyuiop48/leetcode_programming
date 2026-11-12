import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && new int[]{sc.nextInt(), sc.nextInt(), 0} instanceof int[] s
            && IntStream.range(0, 1000).takeWhile(x -> s[0] > 0 && s[1] > 0 && s[0] + s[1] > 2)
                .peek(x -> s[2] += (s[0] < s[1] ? (s[0] = Math.min(100, s[0] + 1)) + (s[1] -= 2) : (s[1] = Math.min(100, s[1] + 1)) + (s[0] -= 2)) * 0 + 1).count() >= 0
            ? s[2] : "");
    }
}
