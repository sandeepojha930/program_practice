import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
     /*   System.out.println("Hello world!");

        int[] arr1 = {1, 4, 8, 9};
        int[] arr2 = {2, 3, 5, 6, 7};
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] arr3 = new int[l1 + l2];
        CopyTwoSortedArraysIntoThird.copyArray(arr1, arr2, l1, l2, arr3);
        System.out.println(Arrays.toString(arr3));*/

/*


       int capacity = 3;
        LeastFrequentlyUsedCache usedCache = new LeastFrequentlyUsedCache(capacity);
        usedCache.addCache(1);
        usedCache.showData();
        usedCache.addCache(2);
        usedCache.showData();
        usedCache.addCache(3);
        usedCache.showData();
        usedCache.addCache(4);
        usedCache.showData();
        usedCache.addCache(3);
        usedCache.showData();*/

/*        B b = new A();
        b.fun("abc");
        b.fun(null);*/

/*        String str = "teSt soMetHing";
        System.out.println(ReverseStringKeepCharacterCapitalBasedPosition.reverseString(str));*/
   /*     LinkedList list = new LinkedList();
        list.add(5);list.add(15);list.add(25);list.add(35);
        list.display();*/
   /*     int id = 101;
        Map<String, String> map = new HashMap<>();
        map.put("Sandeep","Kumar");
        Employee employee = new Employee(101,"Sandeep",35);
        EmployeeImmu employeeImmu = new EmployeeImmu(id, map, employee);
        System.out.println(employeeImmu.getEmployee());
        employeeImmu.getEmployee().setName("kkkk");
        System.out.println(employeeImmu.getEmployee());*/
/*        LocalTime localDate = LocalTime.of(6, 30, 0);
        LocalTime finalTime = localDate.plus(Duration.ofSeconds(30));*/
        //System.out.println(JavaToCPlusAndViceVersa.getVariableName("this_is_a_variable"));
/*        int student= 3;
        int subjects = 3;
        int[][] arrays = {{50,30,70},
                          {30,70,99},
                          {99,20,30}};
        System.out.println(StudentReport.getStudentReport(student, subjects, arrays));*/
        //Find the sum of even numbers using Java stream
        /*int sum = IntStream.rangeClosed(1,20).filter(value -> value % 2 == 0).sum();
        System.out.println(sum);*/
/*        ZemosoInterview interview = new ZemosoInterview();
        System.out.println(interview.solution(10,10));*/
/*        int[] arr= {1,2,3,4,5,6,7,8,9};
        RotateArray.rotate(arr, 4, 9);*/
/*        String strArr[] = {"4","13","5","/","+"};
        System.out.println(EvaluateReversePolishNotation.evaluateReversePolishNotation(strArr));*/
/*        String s = "aab";
        String t ="xyz";
        System.out.println(IsomorphicStrings.isomorphicStrings(s, t));*/
/*        String begin = "hit";
        String end = "cog";
        Set<String> set = new HashSet<>();
                set.add("hot"); set.add("dot"); set.add("dog");set.add("lot");set.add("log");
        System.out.println(WordLadder.wordLadder(begin, end, set));*/
        /*int[] nums = {3,2,1,8,6,4};
        System.out.println(KthLargestElemInArr.kthLargestElemInArr(nums,2));*/
       int[] nums1 = {1,2,3,0,0,0}; int m = 3; int[] nums2 = {2,5,6}; int n = 3;
        Main main = new Main();
        System.out.println(Arrays.toString(nums1));
        main.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m-1, j = n-1, k = m+n-1; j>=0; --k){
            nums1[k] = i>=0 && nums1[i] > nums2[j]? nums1[i--] : nums2[j--];
        }
    }
}