import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer f
            ? IntStream.range(0, 1440).filter(i -> f == 24 || (i / 60 >= 1 && i / 60 <= 12)).boxed()
                .min(Comparator.comparingInt(i -> (int) IntStream.range(0, 5).filter(k -> String.format("%02d:%02d", i / 60, i % 60).charAt(k) != t[1].charAt(k)).count()))
                .map(i -> String.format("%02d:%02d", i / 60, i % 60)).get() : "");
    }
}
