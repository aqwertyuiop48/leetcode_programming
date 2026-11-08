import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Long.valueOf(t[0]) instanceof Long n && Long.valueOf(t[1]) instanceof Long m && Long.valueOf(t[2]) instanceof Long k
            && Long.valueOf((Long.parseLong(t[3]) - 1) / (m * k)) instanceof Long pa && Long.valueOf((Long.parseLong(t[3]) - 1) % (m * k) / k) instanceof Long fa
            && Long.valueOf((Long.parseLong(t[4]) - 1) / (m * k)) instanceof Long pb && Long.valueOf((Long.parseLong(t[4]) - 1) % (m * k) / k) instanceof Long fb
            ? pa.equals(pb) ? Math.min(5 * Math.abs(fa - fb), 10 + Math.abs(fa - fb)) * (fa.equals(fb) ? 0 : 1)
                : Math.min(5 * fa, 10 + fa) + Math.min(5 * fb, 10 + fb) + 15 * Math.min(Math.abs(pa - pb), n - Math.abs(pa - pb)) : "");
    }
}
