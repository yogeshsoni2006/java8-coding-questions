package com.soni;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.List.of;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Test {
    public static void main(String args[]) {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> al = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,2,10);
        List<Integer> removeDup = al.stream().distinct().collect(Collectors.toList());
        System.out.println(removeDup);
        Set<Integer> removeDup1 = new HashSet<>(al);
        System.out.println(removeDup1);

        List<Integer> even = oneToTen.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even);

        String name = "yogesh yog";
        Map<String, Long> al1 = Arrays.stream(name.split("")).collect(groupingBy(Function.identity(), counting()));
        System.out.println(al1);

        Set<Integer> dupNumbers = new HashSet<>();
        Set<Integer> notDuplicates = al.stream().filter(x->!dupNumbers.add(x)).collect(Collectors.toSet());
        System.out.printf("notDuplicates=>"+notDuplicates);
        System.out.println("dupNumbers=>"+dupNumbers);
    }
}
