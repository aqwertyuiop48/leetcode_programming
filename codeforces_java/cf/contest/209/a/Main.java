import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? (Stream.iterate(new long[]{1, 1}, f -> new long[]{f[1], (f[0] + f[1]) % 1000000007L}).skip(n + 2).findFirst().get()[0] + 1000000005L) % 1000000007L : "");
    }
}

