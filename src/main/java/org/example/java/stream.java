package org.example.java;

import java.util.*;
import java.util.stream.Stream;

public class stream {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("ccc");
        list.add("ddd");

        list.stream().forEach((String a) ->{
            System.out.println(a);
        });


        // in filter , we just apply the filter and those who passes the filter , goes to final list
        List<String> se = list.stream().filter(a -> a.length() > 2).toList();

        List<Integer> list1 = Arrays.asList(1, 3, 45, 67, 78, 1);

        // here we are filtering ele which are odd number
        List<Integer> newList = list1.stream().filter(a -> a % 2 != 0).toList();
        System.out.println(newList);

        // we use map for just applying the function to the ele
        // here we are just adding 2 to every ele of the list
        List<Integer> addedList = list1.stream().map(a -> a + 2).toList();
        System.out.println(addedList);

        // we use sorted to sort the list based on some param , and by default it will sort in
        // ascending order

        List<Integer> sortedList = addedList.stream().sorted().toList();
        System.out.println(sortedList);


        List<List<String>> namesList = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David")
        );

        //here map will return list of streams
        List<Stream<String>> seeew = namesList.stream().map(List::stream).toList();

        // flatmap is used to flatten the list
        // here we converting the list of list to single list
        List<String> seewwe = namesList.stream().flatMap(List::stream).toList();

        System.out.println(seewwe);


        List<String> sentences = Arrays.asList("Hello World", "Java Streams");


        // here we are splliting the string and then converting that to single string
        // and then using flatmap we can get the flatten list of string
        List<String> newList1 = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).toList();

        System.out.println(newList1);
//
        List<String>see=namesList.stream().map((a)-> {
            return a.get(0) + " " + a.get(1);
        } ).toList();
        System.out.println(see);



        // we can also use flatmap for reducing the checks for optional.isPresent
        // here we just apply a function and then returning another optional
        Optional<String> optionalString = Optional.ofNullable("ase");
        Optional<Integer> length = optionalString.flatMap(str -> Optional.of(str.length()));

        length.ifPresent(System.out::println);
//        System.out.println(length.get());  // Output: 5


        List<String> numbers = Arrays.asList("1", "2", "3","3");

        // here we are using map function to parse string to integer
        List<Integer> newNumberList = numbers.stream().map(Integer::parseInt).toList();
        System.out.println(newNumberList);

        // distinct is use to return distinct ele from the list
        System.out.println(newNumberList.stream().distinct().toList());

//        List<Integer>sortedNumberList=newNumberList.stream().sorted().toList();

        // here we have write custom comparator function
        // we are sorting here in descending order
//        How it works:
//
//        If b - a > 0 → b is greater, so b comes before a (descending order).
//        If b - a == 0 → They are equal, so their order remains unchanged.
//        If b - a < 0 → b is smaller, so it remains after a.
        List<Integer>descsortedNumberList=newNumberList.stream().sorted((a,b)->b-a).toList();


        // here we are using default function to sort in reverse i.e descending order
        System.out.println(newNumberList.stream().sorted(Comparator.reverseOrder()).toList());

        System.out.println(descsortedNumberList);



        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // peek function is very useful as in this we can do any operation , and it will return the original
        // stream , and then we can do other operation on the stream
        //  peek does not modify the stream , we can see here that we are printing the ele
        // before doing any processing , it is using here as logs
        // and then we are applying map function to convert the string to upper case
        // so majorly it is used for debugging purposes .
        List<String>currentNames=names.stream().peek(a-> System.out.println("Processing element: " + a))
                .map(String::toUpperCase)
                .toList();

        System.out.println(currentNames);




    }

}
