import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Arrays.stream(t, 1, 1 + (int) t[0]).distinct().sorted().toArray() instanceof long[] d
            ? (d.length < 3 || d.length == 3 && d[1] - d[0] == d[2] - d[1] ? "YES" : "NO")
            : "");
    }
}
