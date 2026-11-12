import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] v
            ? Math.max(0L, Math.min(v[1], v[3]) - Math.max(v[0], v[2]) + 1) - (v[4] >= Math.max(v[0], v[2]) && v[4] <= Math.min(v[1], v[3]) ? 1 : 0)
            : 0);
    }
}
