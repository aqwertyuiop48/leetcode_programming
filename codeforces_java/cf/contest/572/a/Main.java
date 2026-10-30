import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t && t[4 + (int) t[2] - 1] < t[4 + (int) t[0] + (int) t[1] - (int) t[3]] ? "YES" : "NO");
    }
}
