import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            ? IntStream.range(1, n + 1).mapToObj(i -> String.valueOf(i == n ? t[i] : t[i] + t[i + 1])).collect(Collectors.joining(" ")) : "");
    }
}
