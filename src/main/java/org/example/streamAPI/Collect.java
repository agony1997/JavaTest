package org.example.streamAPI;

import java.util.Map;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collect {

    static List<String> list = new ArrayList<>();
    static String sex = "female";
    static String age = "10";

    public static void main(String[] args) {

        Collections.addAll(list, "cat-male-100", "cat-female-200", "dog-male-300", "god-female-10", "use-male-001", "dog-male-10");

        // collect()
        // 蒐集流中的元素放到集合中
        Collect collect = new Collect();

        collect.collectToList();
        collect.collectToSet();
        collect.collectToMap();

    }

    void collectToSet() {
        Set<String> newSet = list.stream().filter(item -> age.equals(item.split("-")[2])).filter(item -> sex.equals(item.split("-")[1])).collect(Collectors.toSet());
        System.out.println("newSet" + newSet);
    }

    void collectToList() {
        List<String> newList = list.stream().filter(item -> age.equals(item.split("-")[2])).filter(item -> sex.equals(item.split("-")[1])).collect(Collectors.toList());
        System.out.println("newList" + newList);
    }

    void collectToMap() {
        Map<String, Integer> newMap = list.stream()
                .filter(item -> sex.equals(item.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String string) {
                        return string.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String string) {
                        return Integer.valueOf(string.split("-")[2]);
                    }
                }));

        Map<String, Integer> map = list.stream()
                .filter(string -> sex.equals(string.split("-")[1]))
                .collect(Collectors.toMap(k -> k.split("-")[0], v -> Integer.parseInt(v.split("-")[2])));

    }

    // =======================================================================
    //                       Map (key 不能重複)

    // toMap : param1 => Key 的規則
    //         param2 => Value 的規則

    // param1 : Function 泛形參數1 => 流中元素的類型
    //                   泛形參數2 => 目標的類型 ( Key 的類型 )
    //
    //             apply 傳入參數 : 每一個元素
    //                     方法體 : 生成Key的邏輯
    //                     返回值 : Key

    // param2 : Function 泛形參數1 => 流中元素的類型
    //                   泛形參數2 => 目標的類型 ( Value 的類型 )
    //
    //             apply 傳入參數 : 每一個元素
    //                     方法體 : 生成Value的邏輯
    //                     返回值 : Value
    // =======================================================================
}
