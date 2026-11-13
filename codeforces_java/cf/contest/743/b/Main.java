import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("[ \\n\\r\\t]+") instanceof String[] t
            ? Long.numberOfTrailingZeros(Long.parseLong(t[1])) + 1 : 0);
    }
}
