import java.util.Arrays;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStringsWordCharsCount {

    public static void main(String[] args) {
        String str = "i love to visit Australia";
      String res=  Stream.of(str.split("\\s"))
                .collect(Collectors.toMap(Function.identity(),s -> s.length()))
                .entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .skip(0).findFirst().get().getKey();
      System.out.println(res);

      //Consumer example
        Consumer<String> consumer = s -> System.out.println(s);
        Stream.of("xyz","abc").forEach(consumer);
      //Predicate example
        Predicate<String> predicate = s -> "xyz".equals(s);
        Stream.of("xyz", "abc", "pqr").filter(predicate).forEach(System.out::println);
       //Functions example
        Function<String, Character> function = s -> s.charAt(0);
        Stream.of("xyz", "abc", "pqr").map(function)
                .forEach(System.out::println);
        //Supplier
        Supplier<String[]> supplier = () -> new String[]{"xyz", "abc", "pqr"};
        Arrays.asList(supplier.get()).forEach(System.out::println);

    }
}
