package LambdasAndStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Student> l1 = new ArrayList<>(List.of(
                new Student(2, "Mohit", 90.0),
                new Student(1, "Akshay", 10.0),
                new Student(3, "Yogesh", 20.0)
        ));

        //method 1 - anonymous class created
        //we created Comparator names StudentNameCom.. and StudentPspCom..
        //we create obj of above and pass it at 2nd param
        //but why we need to create class to implement only 1 class
        //so we can do like below without creating new class and use that obj here
        Collections.sort(l1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        //method 2 - lambda expression using syntactical sugar (sugar code to beautify code)
        //using compareTo method without creating obj like we did above
        //lambda expressions are only return for functional interfaces
        //and functional interface have only 1 function to be implemented
        //in method 1 description - why create obj above, sort take Comparator and lambda just
        //point the implementation
        Collections.sort(l1, (Student x, Student y) -> {
            return x.name.compareTo(y.name);
        });

        //------------------------------------------------------------------------------------
        //lets understand above method in below, simple terms
        //Thread obj takes runnable task

        //assume we created different class just for below code
        //assume it's method 1
        Runnable r = () -> {
            System.out.println("Hello World " + Thread.currentThread().getName());
        };
        //now passing obj here to Thread which take runnable
        Thread thread = new Thread(r);


        //now do the same thing using lambda like method 2
        Thread t = new Thread(() -> {
            System.out.println("Hello World " + Thread.currentThread().getName());
        });

        //if only 1 line statement like above we can do like this
        Thread t2 = new Thread(() -> System.out.println("Hello World " + Thread.currentThread().getName()));

        //--------------------------------------------------------------------------------------

        //one of the use case of using lambda
        //I don't want to operate method to hard coded by mathematical operation
        //so I created this dynamically using lambda
        MathematicalOperation addition = (a, b) -> a + b;
        MathematicalOperation subtraction = (a, b) -> a - b;

        System.out.println(addition.operate(2, 3));
        System.out.println(subtraction.operate(3, 2));

        //---------------------------------------------------------------------------------------

        //Streams API
        List<Integer> s1 = List.of(2, 5, 1, 3, 4, 6);
        Stream<Integer> s = s1.stream();

        //limit method will only grab first x elements
        //s.limit(4);

        //Intermediate Method : returns the stream reference
        //stream() and limit() return the stream reference, use sout to print

        //Terminal : return the data
        System.out.println(s.limit(4).count());

        //I'll get error bcz once above terminal called, stream closed
        //Error: stream has already been operated upon or closed
        //System.out.println(s.limit(4).count());

        //to get the count again then have to create another stream
        Stream<Integer> s2 = s1.stream();
        System.out.println(s2.limit(4).count());

        //stream doesn't affect the actual data source
        //stream taking the data, not affecting the actual data source
        System.out.println(s1);

        //can print the stream also
        //used Consumer interface in the forEach, used lambda
        Stream<Integer> s3 = s1.stream();
        s3.forEach((ele) -> {
            System.out.println("element is: " + ele);
        });

        //returning even elements
        List<Integer> l2 = s1.stream()
                .filter((ele) -> ele % 2 == 0) //filter is intermediate method
                .collect(Collectors.toList()); //terminal method
        System.out.println(l2);

        //return square of even element using map method which is Intermediate method
        List<Integer> l3 = s1.stream()
                .filter((ele) -> ele % 2 == 0) //filter is intermediate method
                .map(ele -> ele * ele) //1 by 1 ele will be coming, map ele*ele to the ele, intermediate method
                .collect(Collectors.toList()); //terminal method
        System.out.println(l3);

        //there might be possibility that after doing intermediate method operation will not find any first
        //so putting Optional
        Optional<Integer> l4 = s1.stream()
                .filter((ele) -> ele % 2 == 0) //filter is intermediate method
                .map(ele -> ele * ele) //1 by 1 ele will be coming, map ele*ele to the ele, intermediate method
                .sorted((x1, y) -> {
                    return y - x1;
                }) //terminal method, can keep only sorted() or use the comparator like i did
                .findFirst(); //another terminal method
        //checking condition then printing
        if (l4.isPresent()) {
            System.out.println(l4.get());
        }

        Integer l5 = s1.stream()
                .filter((ele) -> ele % 2 == 0) //filter is intermediate method
                .map(ele -> ele * ele) //1 by 1 ele will be coming, map ele*ele to the ele, intermediate method
                //default value is 0
                .reduce(0, (curr_sum, ele) -> {
                    return curr_sum + ele;
                }); //terminal, doing sum of integers present in the stream
        System.out.println(l5);

        //get the maximum from the list
        Integer l6 = s1.stream()
                .filter((ele) -> ele % 2 == 0)
                .map(ele -> ele * ele)
                //terminal method
                .reduce(Integer.MIN_VALUE, (max, ele) -> {
                    return Math.max(max, ele);
                });
        System.out.println(l6);

        //till Intermediate method it is lazy loading
        //as soon as the Terminal method comes the eager loading happened, findFirst(), findAny()

        //later instructor tried lots of combination
    }
}