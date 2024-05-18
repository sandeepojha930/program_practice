import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestFile {

    public static void main(String[] args) {
        List<String> list = List.of("kk","ll","pp","kk","ll","pp","kk","ss","ww");
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().forEach(System.out::println);
    }
}
