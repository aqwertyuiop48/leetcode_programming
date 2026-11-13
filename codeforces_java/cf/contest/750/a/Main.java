public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new java.util.Scanner(System.in) instanceof java.util.Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            ? java.util.stream.IntStream.rangeClosed(1, n).filter(i -> 5 * i * (i + 1) / 2 <= 240 - k).count() : "");
    }
}
