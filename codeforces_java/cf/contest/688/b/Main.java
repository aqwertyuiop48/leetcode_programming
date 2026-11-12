public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s ? s + new StringBuilder(s).reverse() : "");
    }
}
