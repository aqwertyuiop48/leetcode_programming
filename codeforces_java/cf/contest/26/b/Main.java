import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            new int[2] instanceof int[] st
            && s.next().chars().allMatch(c -> c == '(' ? st[0]++ >= 0 : st[0] > 0 ? (st[0]-- + (st[1] += 2)) >= 0 : true)
            ? st[1] : 0));
    }
}
