package arrsum21_10_2016;

public class ArrSum21_10_2016 {

    public static void main(String[] args) {
       int[] arr = new int[10];
        int i = 1;
        for (int a = 0; a < 10; a++) {
            arr[a] = i;
            i++;
        }
        for (int b = 1; b < arr.length -1; b++) {
            System.out.print(arr[b] + "; ");
        }
         System.out.println();
         
        int[] arr2 = new int[10];
        int x = 10;
        for (int a = 9; a >= 0 ; a--) {
            arr2[a] = x;
            x--;
        }
         for (int b = 0; b < arr2.length; b++) {
            System.out.print(arr[b] + "; ");
        }
    }

}
