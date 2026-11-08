import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Long.valueOf(t[0]) instanceof Long n && Long.valueOf(Math.min(Long.parseLong(t[1]), n / 2)) instanceof Long m
            ? m * (2 * n - 3) - 2 * m * (m - 1) : "");
    }
}
