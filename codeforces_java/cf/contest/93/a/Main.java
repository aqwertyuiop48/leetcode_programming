import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] v
            ? (v[2] - 1) / v[1] == (v[3] - 1) / v[1] || ((v[2] - 1) % v[1] == 0 && (v[3] % v[1] == 0 || v[3] == v[0]))
                ? 1
                : (v[2] - 1) % v[1] == 0 || v[3] % v[1] == 0 || v[3] == v[0]
                    || (v[3] - 1) / v[1] - (v[2] - 1) / v[1] == 1 || (v[2] - 1) % v[1] == v[3] % v[1]
                    ? 2
                    : 3
            : 0);
    }
}

