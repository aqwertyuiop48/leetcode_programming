import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            ? Math.min(v[0] * v[2], v[0] / v[1] * v[3] + Math.min(v[0] % v[1] * v[2], v[3]))
            : 0);
    }
}
