import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Integer n
            ? IntStream.rangeClosed(1, n).mapToObj(k -> k == 1 ? "2" : String.valueOf((long) k * (k + 1) * (k + 1) - (k - 1))).collect(Collectors.joining("\n"))
            : "");
    }
}
