import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new int[][]{{0, 10}, {2, 100}, {20, 1000}, {200000, 100}, {200001, 1}, {200002, 100}, {200040, 100}, {400000, 1}, {400003, 5}, {400010, 25}, {400030, 100}, {600000, 50}, {600005, 5}, {600009, 60}, {600013, 2}, {600040, 300}} instanceof int[][] b
            ? b.length + "\n" + Arrays.stream(b).map(a -> a[0] + " " + a[1]).collect(Collectors.joining("\n"))
            : "");
    }
}
