import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && IntStream.range(0, 4).map(i -> sc.nextInt()).toArray() instanceof int[] v
            && Integer.valueOf(Math.abs(v[0] - v[2])) instanceof Integer dr && Integer.valueOf(Math.abs(v[1] - v[3])) instanceof Integer dc
            ? (dr == 0 && dc == 0 ? 0 : dr == 0 || dc == 0 ? 1 : 2) + " " + (dr == 0 && dc == 0 ? 0 : (dr + dc) % 2 == 1 ? 0 : dr == dc ? 1 : 2) + " " + Math.max(dr, dc) : "");
    }
}
