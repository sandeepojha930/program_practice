import java.util.LinkedList;
import java.util.List;

public class LeastFrequentlyUsedCache {
    List<Integer> list;
    int capacity;

    public LeastFrequentlyUsedCache(int capacity) {
        this.capacity = capacity;
        this.list = new LinkedList<>();
    }

    public void addCache(int value) {
        int index = checkDuplicate(value);
        if (index != -1) {
            list.remove(index);
            list.add(value);
        } else if (capacity > list.size()) {
            list.add(value);
        } else {
            list.remove(0);
            list.add(value);
        }
    }

    private int checkDuplicate(int value) {
        return list.indexOf(value);

    }


    public void showData() {
        System.out.println(list);
    }
}
