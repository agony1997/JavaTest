package org.example.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Stream {

    // final method -------------------------------
    // 當方法返回值類型不是Stream,代表不能再操作
    // collect()
    // forEach()
    // toArray()
    // count()
    // ---------------------------------------------

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "cat-100", "cat-200", "dog-300", "god-25", "user-001", "dog-10");

        // count()
        // 回傳 : long
        long count = list.stream().count();
        System.out.println(count);

        // forEach()
        // 回傳 : void
        list.stream().forEach(new Consumer<>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        });

        list.stream().forEach(item -> System.out.println(item + " lambda"));

        // .distinct() 排除重複元素
        // .concat(a,b) 合併兩個stream   (靜態方法)

        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "cat", "dog", "ant", "ant", "dog");

        list2.stream()
                .distinct()
                .forEach(System.out::println);

        java.util.stream.Stream
                .concat(list.stream(), list2.stream())
                .forEach(System.out::println);

        java.util.stream.Stream
                .concat(list2.stream(), list.stream())
                .forEach(System.out::println);

        // .limit(獲取幾個元素)
        // .skip(跳過幾個元素)

        list.stream()
                .limit(3)
                .forEach(System.out::println);

        list.stream()
                .skip(2)
                .forEach(System.out::println);

        list.stream()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        list.stream()
                .limit(3)
                .skip(1)
                .forEach(System.out::println);
    }


    // filter(Predicate predicate)
    // 過濾
    void filter() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Abb", "Acce", "beeb", "cdg", "cfhdh", "ddghr");

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return string.startsWith("A");
            }
        }).forEach(s -> System.out.println(s));

        list.stream().filter(string -> string.startsWith("c"))
                .forEach(System.out::println);

        list.stream().filter(string -> string.startsWith("c"))
                .filter(string -> string.length() > 3)
                .forEach(System.out::println);

        java.util.stream.Stream<String> stream = list.stream();
        java.util.stream.Stream<String> a = stream.filter(string -> string.startsWith("A"));
        a.forEach(System.out::println);

        // Predicate
        // 用於接收單一參數並返回布林值的邏輯判斷函式
        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                boolean boo = integer % 2 == 0;
                return boo;
            }
        };
        Predicate<Integer> isEventest = integer -> integer % 2 == 0;
    }
}
