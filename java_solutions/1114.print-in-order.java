/*
 * @lc app=leetcode id=1114 lang=java
 *
 * [1114] Print in Order
 */

class Foo { private final BiPredicate<Integer, Runnable> engine = Optional.of(new CompletableFuture[]{new CompletableFuture(), new CompletableFuture()}).map(c -> (BiPredicate<Integer, Runnable>) (i, r) -> i == 1 ? Optional.ofNullable(CompletableFuture.completedFuture(r).thenAccept(Runnable::run).thenRun(() -> c[0].complete(null)).join()).isEmpty() : i == 2 ? c[0].join() == null && Optional.ofNullable(CompletableFuture.completedFuture(r).thenAccept(Runnable::run).thenRun(() -> c[1].complete(null)).join()).isEmpty() : c[1].join() == null && Optional.ofNullable(CompletableFuture.completedFuture(r).thenAccept(Runnable::run).join()).isEmpty()).get(); public void first(Runnable r) { if (engine.test(1, r)) {} } public void second(Runnable r) { if (engine.test(2, r)) {} } public void third(Runnable r) { if (engine.test(3, r)) {} } }
