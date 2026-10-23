import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(Integer.parseInt(t[0])) instanceof Integer m
            && IntStream.range(0, m).allMatch(i -> IntStream.range(0, m).allMatch(j ->
                (Integer) ((j > 0 && t[i + 1].charAt(j - 1) == 'o' ? 1 : 0)
                    + (j + 1 < m && t[i + 1].charAt(j + 1) == 'o' ? 1 : 0)
                    + (i > 0 && t[i].charAt(j) == 'o' ? 1 : 0)
                    + (i + 1 < m && t[i + 2].charAt(j) == 'o' ? 1 : 0)) instanceof Integer c
                && (c & 1) == 0))
            ? "YES"
            : "NO");
    }
}
