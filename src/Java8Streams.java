import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Streams {

    public static void main(String[] args) {
        //Find the sum of all even numbers in a list of integers.
       /*List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sum = list.stream().filter(integer -> integer%2==0)
                .mapToInt(Integer::intValue).sum();
        System.out.println("Even numbers sum: "+sum);*/

        //Find and print the count of strings that have length greater than 5.
      /*  List<String> strings = Arrays.asList("apple","banana","grape","orange","watermelon","kiwi");
        Long count = strings.stream().filter(s -> s.length()> 5).count();
        System.out.println("count of strings that have length greater than five: "+count);*/

//Implement a function that takes a list of integers as input and returns
// a new list containing the square of each element.
        /*List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> newList = list.stream().map(integer -> integer*integer)
                .collect(Collectors.toList());
        System.out.println("a new list containing the square of each element: "+newList);*/

        //Find the maximum element in a list of integers.
        /*List<Integer> list = Arrays.asList(1,25,3,43,56,62,71,98,95,10);
        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("the maximum element in a list of integers: "+max);*/

        //Concatenate all the strings in a list into a single string.
        /*List<String> strings = Arrays.asList("apple","banana","grape","orange","watermelon","kiwi");
        String ss = strings.stream().collect(Collectors.joining("\s"));
        System.out.println("Concatenate all the strings: "+ss);
*/
//Convert each string to uppercase and then sort them in alphabetical order.
       /* List<String> strings = Arrays.asList("apple","banana","grape","orange","watermelon","kiwi");
        List<String> results = strings.stream().map(String::toUpperCase)
                .sorted().collect(Collectors.toList());
        System.out.println(results);*/

    //Find the average of all the numbers in a list of doubles using Streams.
       /* List<Double> list = Arrays.asList(1.0,2.0,3.0,4.0);
        double ll = list.stream()
                .mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println(ll);*/

        //Create a new list that contains only unique words (remove duplicates).
      /*  List<String> strings = Arrays.asList("apple","banana","grape","banana","watermelon","grape");
        List<String>  result = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(result);*/

        //Check if all elements in a List satisfy a given condition using streams.
   /*     List<Integer> list = Arrays.asList(2,4,6,21);
       boolean result = list.stream().allMatch(integer -> integer%2==0);
       System.out.println(result);*/

        //Check if a list contains a specific element using streams.
       /* List<Integer> list = Arrays.asList(4,6,21);
        boolean res = list.stream().anyMatch(integer -> integer==2);
        System.out.println(res);*/

        //Find the longest string in a list using streams.
/*        List<String> strings = Arrays.asList("apple","banana","grape","orange","watermelon","kiwi");
       String str = strings.stream().collect(Collectors.toMap(Function.identity(), s -> s.length()))
                .entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).findFirst()
                .get().getKey();
       System.out.println(str);*/
// Remove null values from a list using streams.
        /*List<String> strings = Arrays.asList("apple",null,"grape","orange","watermelon",null);
        List<String> nonNullList =  strings.stream().filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(nonNullList);*/

        //Problem Statement: GROUP BY Department and Find Max Salary



        //Find Second Smallest Element in a List
      /*  List<Integer> list = Arrays.asList(14,25,3,43,56,62,71,98,95,10);
        int value = list.stream().distinct().sorted().skip(1).findFirst().get();
        System.out.println(value);*/

        // Find Intersection of Two Lists
/*        List<Integer> list1 = Arrays.asList(14,25,3,43);
        List<Integer> list2 = Arrays.asList(3,25,4,18);

List<Integer> interSect = list1.stream().filter(list2::contains).collect(Collectors.toList());
System.out.println(interSect);*/



    }
}
