import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {4, 7, 9, 2, 5};
        System.out.println("Before Sorting : "+Arrays.toString(arr));
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
            System.out.println("While Sorting : "+ i +" "+Arrays.toString(arr));
        }
        System.out.println("After Insertion Sorting : "+Arrays.toString(arr));
    }
}
