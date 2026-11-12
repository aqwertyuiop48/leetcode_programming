import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+")[1] instanceof String s
            && IntStream.range(0, 4).anyMatch(dir -> s.chars().allMatch(ch ->
                Integer.valueOf((ch == 48 ? 3 : (ch - 49) / 3) + new int[]{-1, 1, 0, 0}[dir]) instanceof Integer r
                && Integer.valueOf((ch == 48 ? 1 : (ch - 49) % 3) + new int[]{0, 0, -1, 1}[dir]) instanceof Integer c
                && (r >= 0 && r <= 2 && c >= 0 && c <= 2 || r == 3 && c == 1)))
            ? "NO" : "YES");
    }
}
