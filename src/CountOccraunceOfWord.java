import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccraunceOfWord {

    public static void main(String[] args) {
        List<String> list = List.of("xyz", "abc", "pqrs", "xyz");
     Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),
                HashMap::new, Collectors.counting()));
     Long maxCount = 0l;
     String maxValue = "";
       String max = list.stream().collect(Collectors.groupingBy(Function.identity(),
                HashMap::new, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .get().getKey();
        System.out.println(max);
     for(Map.Entry<String, Long> entry : map.entrySet())
     {
         if (entry.getValue() > maxCount){
             maxCount = entry.getValue();
             maxValue = entry.getKey();
         }
     }
     System.out.println("Most occurred word: "+maxValue+" with the count: "+maxCount);
    }
}
