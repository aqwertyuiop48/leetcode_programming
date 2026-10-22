import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Stream.of(s.next(), s.next()).mapToInt(t -> Integer.parseInt(t.substring(0, 2)) * 60 + Integer.parseInt(t.substring(3))).toArray() instanceof int[] m
            && Integer.valueOf(((m[0] - m[1]) % 1440 + 1440) % 1440) instanceof Integer d
            ? String.format("%02d:%02d", d / 60, d % 60) : "");
    }
}
