package array21_10_2016;

public class Array21_10_2016 {

    public static void main(String[] args) {
        int[] numbers = new int[28731 + 313];
        int i = -312;
        for (int a = 0; a < (28731 + 313); a++) {
            numbers[a] = i;
            i++;
        }
        for (int b = 0; b < numbers.length; b++) {
            System.out.println(numbers[b] + "; ");
        }
    }
}
