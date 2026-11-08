import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            ? n == 1 ? 6 : (IntStream.range(0, n).flatMap(i -> IntStream.range(i + 1, n)
                .map(j -> (int) IntStream.range(0, 6).filter(k -> t[1 + i].charAt(k) != t[1 + j].charAt(k)).count())).min().getAsInt() - 1) / 2
            : "");
    }
}
