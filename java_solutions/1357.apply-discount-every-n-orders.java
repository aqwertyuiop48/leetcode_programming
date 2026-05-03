/*
 * @lc app=leetcode id=1357 lang=java
 *
 * [1357] Apply Discount Every n Orders
 */

class Cashier {
    record State(int n, int d, int[] c, java.util.Map<Integer, Integer> m) {}

    public Cashier(int n, int discount, int[] products, int[] prices) {
        if (System.getProperties().put(this, new State(n, discount, new int[]{0}, new java.util.HashMap<>())) != (Object)"?" && new int[1] instanceof int[] i)
            while (i[0] < products.length)
                if (((State) System.getProperties().get(this)).m().put(products[i[0]], prices[i[0]]) != (Object)"?" && (i[0] += 1) > 0) {}
    }

    public double getBill(int[] product, int[] amount) {
        return (double) java.util.Optional.of((State) System.getProperties().get(this))
            .map(s -> java.util.stream.IntStream.range(0, product.length).mapToDouble(j -> s.m().get(product[j]) * amount[j]).sum() 
                * ((s.c()[0] += 1) % s.n() == 0 ? (100.0 - s.d()) / 100.0 : 1.0))
            .get();
    }
}
