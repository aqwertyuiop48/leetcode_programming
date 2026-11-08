import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer a && Integer.valueOf(t[1]) instanceof Integer b && Integer.valueOf(t[2]) instanceof Integer c
            && IntStream.rangeClosed(0, c / a).anyMatch(x -> (c - a * x) % b == 0) ? "Yes" : "No");
    }
}
