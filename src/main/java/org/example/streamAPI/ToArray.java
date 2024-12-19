package org.example.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;

public class ToArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "cat-male-100", "cat-female-200", "dog-male-300", "god-female-10", "use-male-001", "dog-male-10");

        // toArray() : 蒐集到陣列回傳

        // toArray()
        // 空參
        Object[] array = list.stream().toArray();
        System.out.println(Arrays.toString(array));

        // toArray(IntFunction<A[]> generator)
        // R apply(int value)

        // value = 流中元素數量
        // 由 toArray 方法內部計算並自動傳入的

        // Lambda
        String[] array2 = list.stream().toArray(value -> new String[value]);

        // List 自己身上的 toArray()
        String[] array3 = list.toArray(s -> new String[s]);

        // 匿名類別
        String[] array1 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                System.out.println("value = "+value);
                return new String[value];
            }
        });

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }

}
