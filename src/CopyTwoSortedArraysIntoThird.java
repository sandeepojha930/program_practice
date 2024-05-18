public class CopyTwoSortedArraysIntoThird {


    public static void copyArray(int[] arr1, int[] arr2, int l1, int l2, int[] arr3) {
       int i=0, j=0, k =0;
       while (i< l1 && j < l2){
           if(arr1[i]< arr2[j]){
               arr3[k++] = arr1[i++];
           } else {
               arr3[k++] = arr2[j++];
           }
       }
       while (i< l1){
           arr3[k++] = arr1[i++];
       }
       while (j< l2){
           arr3[k++] = arr2[j++];
       }
    }
}
