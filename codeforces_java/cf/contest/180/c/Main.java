import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String t && new int[2] instanceof int[] st && (Integer) (int) t.chars().filter(Character::isUpperCase).count() instanceof Integer U
            ? IntStream.rangeClosed(0, t.length()).map(p -> (Integer) (st[0] + U - st[1]) instanceof Integer v && (p == t.length() || ((st[0] += Character.isLowerCase(t.charAt(p)) ? 1 : 0) >= 0 && (st[1] += Character.isUpperCase(t.charAt(p)) ? 1 : 0) >= 0)) ? v : 0).min().getAsInt()
            : 0);
    }
}
