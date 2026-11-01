import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).strip() instanceof String t && new int[2] instanceof int[] st
            && t.chars().map(c -> c == 'M' ? ++st[0] : st[0] > 0 ? st[1] = Math.max(st[1] + 1, st[0]) : 0).max().orElse(0) >= 0 ? st[1] : "");
    }
}

