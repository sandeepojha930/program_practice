import java.util.stream.IntStream;

public class TrianglePattern {
    public static void main(String[] args) {
        int height = 5;
        IntStream.range(0,height)
                .forEach( value -> {
                    System.out.print(" ".repeat(height-value-1));
                    System.out.println("*".repeat(2*value+1));
                });
    }
}
