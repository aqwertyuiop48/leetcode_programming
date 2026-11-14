public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new java.util.Scanner(System.in).nextInt()) instanceof Integer a ? (a < 13 ? 1L << a : 8092L << (a - 13)) : 0L);
    }
}
