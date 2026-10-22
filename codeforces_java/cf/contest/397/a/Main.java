import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{sc.nextInt(), sc.nextInt()}).toArray(int[][]::new) instanceof int[][] s
            ? IntStream.range(s[0][0], s[0][1]).filter(x -> IntStream.range(1, n).noneMatch(i -> s[i][0] <= x && x < s[i][1])).count() : "");
    }
}
