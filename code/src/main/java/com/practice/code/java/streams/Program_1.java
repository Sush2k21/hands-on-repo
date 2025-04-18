package com.practice.code.java.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_1 {
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Find the longest string in a list of strings using Java streams
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> stringMaxLength = strings.stream().max(Comparator.comparingInt(String::length));
        System.out.println("String with max length - " + stringMaxLength);

        // Calculate the average age of a list of Person objects using Java streams
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        double avgAge = persons.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println("Average age - " + avgAge);

        // Check if a list of integers contains a prime number using Java streams
        List<Integer> numbers = Arrays.asList(4, 6, 8, 10, 12, 14, 15);
        boolean containsPrime = numbers.stream().anyMatch(Program_1::isPrime);
        System.out.println("List contains a prime number: " + containsPrime);

        // Merge two sorted lists into a single sorted list using Java streams
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Single sorted list - " + mergedList);

        // Find the intersection of two lists using Java streams:
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list4 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> intersectionList = list3.stream().filter(list4::contains).toList();
        System.out.println("Intersection List - " + intersectionList);

        // Remove duplicates from a list while preserving the order using Java streams:
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> remove_duplicates = numbersWithDuplicates.stream().distinct().toList();
        System.out.println("Remove duplicates from List - " + remove_duplicates);

        // Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        Map<String,Integer> sumByDay = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate,
                        Collectors.summingInt(Transaction::getAmount)));

        System.out.println("Sum of transaction amount for each day - " +sumByDay);

        // Find the kth smallest element in an array using Java streams:
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int n =2;
        int element = Arrays.stream(array)
                .sorted()
                .skip(n-1)
                .findFirst()
                .orElse(-1);
        System.out.println("Nth smallest element - " +element);

        //  Given a list of strings, find the frequency of each word using Java streams:
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String,Long> word_freq = words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                ));
        System.out.println("Frequency of each word - " +word_freq);

        //Implement a method to partition a list into two groups based on a predicate using Java streams:
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> partitioned = num.stream().collect(
                Collectors.partitioningBy(val -> val%2==0));
        List<Integer> evenNumber = partitioned.get(true);
        List<Integer> oddNumber = partitioned.get(false);
        System.out.println("EvenNumber - " +evenNumber);
        System.out.println("OddNumber - " +oddNumber);
    }

}


