import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t && Integer.valueOf(t[0]) instanceof Integer n
            && Long.valueOf(Arrays.stream(t).skip(1).filter(x -> x.equals("0")).count()) instanceof Long z
            ? (n.intValue() == 1 ? (z.longValue() == 0 ? "YES" : "NO") : (z.longValue() == 1 ? "YES" : "NO")) : "");
    }
}
