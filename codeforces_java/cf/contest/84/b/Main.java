import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && new long[(int) t[0] + 1] instanceof long[] c
            && IntStream.rangeClosed(1, (int) t[0]).allMatch(i -> (c[i] = i > 1 && t[i] == t[i - 1] ? c[i - 1] + 1 : 1) > 0)
            ? Arrays.stream(c).sum() : 0L);
    }
}

