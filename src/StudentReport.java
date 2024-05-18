import java.util.ArrayList;
import java.util.List;

public class StudentReport {

    public static List<Integer> getStudentReport(int student, int subjects, int[][] arrays) {
        int lowest = 0;
        int index = 0;
     /*   for (int j = 1; j < arrays[0].length; j++) {
            if (lowest > arrays[0][j]) {
                lowest = arrays[0][j];
                index = j;
            }
        }*/
        List<Integer> listIndex = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            listIndex.clear();
            for (int j = 0; j < arrays[i].length; j++) {
                listIndex.add(arrays[j][i]);
            }
            int total = listIndex.stream().mapToInt(Integer::intValue).sum();
            if (lowest == 0) {
                lowest = total;
                index = i;
            } else if (lowest > total) {
                lowest = total;
                index = i;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int[] array : arrays) {
            int report = 0;
            for (int j = 0; j < array.length; j++) {
                if (index == j) {
                    continue;
                }
                report += array[j];
            }
            list.add(report);
        }
        return list;
    }
}
