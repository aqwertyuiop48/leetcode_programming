import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String str
            && new int[]{str.length()} instanceof int[] nArr
            ? IntStream.iterate(nArr[0] - 1, len -> len - 1).limit(Math.max(0, nArr[0] - 1))
                .filter(len -> IntStream.rangeClosed(0, nArr[0] - len).mapToObj(i -> str.substring(i, i + len)).distinct().count() < (nArr[0] - len + 1))
                .findFirst().orElse(0)
            : 0);
    }
}
