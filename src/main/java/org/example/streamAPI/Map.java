package org.example.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Map {

    // .map()
    // 要求接收一個 Function<T:原始元素的型別, R:映射後元素的型別> 的介面 mapper
    // 對流中的每個元素做一次 mapper函式

    // 返回值：
    // 一個新的 Stream<R>，包含應用函式後的所有結果。

    // 重寫 :
    // R apply(T t) {
    //  函數方法體
    //  return r
    // }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "cat-100", "cat-200", "dog-300", "god-25", "user-001", "dog-10");

        // map 每個元素映射成數字 => ForEach 印出
        list.stream().map(item -> Integer.parseInt(item.split("-")[1])).forEach(s -> System.out.println("Lambda : " + s));
        // 過濾出 cat 後印出元素
        list.stream().filter(i -> "cat".equals(i.split("-")[0])).forEach(System.out::println);
        // 過濾出 cat 後映射成數字 => ForEach 印出
        list.stream().filter(i -> "cat".equals(i.split("-")[0])).map(i -> i.split("-")[1]).forEach(s -> System.out.println("cat : " + s));


        // 匿名類別
        // map 每個元素映射成數字 => ForEach 印出
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s.split("-")[1]);
            }
        }).forEach(integer -> System.out.println(integer));

    }
}
