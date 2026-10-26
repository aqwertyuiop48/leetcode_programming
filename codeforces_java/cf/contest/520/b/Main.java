import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            ? n >= m ? n - m : Stream.iterate(new int[]{m, 0}, st -> st[0] > n, st -> new int[]{st[0] % 2 == 1 ? st[0] + 1 : st[0] / 2, st[1] + 1}).count()
                + (n - Stream.iterate(new int[]{m, 0}, st -> st[0] > n, st -> new int[]{st[0] % 2 == 1 ? st[0] + 1 : st[0] / 2, st[1] + 1}).reduce((a, b) -> b).map(st -> st[0] % 2 == 1 ? st[0] + 1 : st[0] / 2).get()) : 0);
    }
}
