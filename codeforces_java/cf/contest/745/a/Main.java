import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            ? IntStream.range(0, s.length()).mapToObj(i -> s.substring(i) + s.substring(0, i)).distinct().count() : "");
    }
}
