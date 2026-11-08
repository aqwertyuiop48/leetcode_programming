import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            ? Arrays.stream(t, 1, n + 1).sorted((x, y) -> (x + y).compareTo(y + x)).collect(Collectors.joining()) : "");
    }
}
