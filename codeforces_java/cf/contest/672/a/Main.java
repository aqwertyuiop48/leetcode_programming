import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(IntStream.rangeClosed(1, 1000).mapToObj(String::valueOf).collect(Collectors.joining()).charAt(Integer.parseInt(new String(System.in.readAllBytes()).trim()) - 1));
    }
}
