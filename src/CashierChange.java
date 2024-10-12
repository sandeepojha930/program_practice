import java.util.*;

public class CashierChange {

    public static void main(String[] args) {
        double pp =230.0;
        double cash = 500.0;
        String result = getChange(pp, cash);
        System.out.println("Changed coins: "+result);
    }

    private static String getChange(double price, double cash) {
        double change = cash - price;
        if(price> cash){
            System.out.println("Insufficient cash");
        }
        double[]  billsAndCoins = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.25, 0.1, 0.05, 0.01};
        String[] names = {"One Hundred", "Fifty", "Twenty", "Ten", "Five", "Two", "One", "Half", "Quarter", "Dime", "Nickel", "Penny"};
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i =0; i< billsAndCoins.length; i++){
            while (change >= billsAndCoins[i]){
                change = Math.round((change - billsAndCoins[i])* 100)/100;
                map.merge(names[i], 1, Integer::sum);
            }
        }
        List<String> list = map.entrySet().stream().
                flatMap(entry -> Collections.nCopies(entry.getValue(), entry.getKey()).stream()).sorted().toList();
        return String.join(",", list);
    }
}
