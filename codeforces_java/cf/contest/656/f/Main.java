import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            ? 1 + s.substring(1).chars().map(c -> c - '0').sum() + 9 * IntStream.range(1, s.length() - 1).filter(i -> s.charAt(i) == '1' && s.charAt(i + 1) == '0').count()
            : "");
    }
}
