package repetitive;

public class Repetitive {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 3;
        arr[5] = 3;
        arr[6] = 3;
        arr[7] = 2;
        arr[8] = 1;
        arr[9] = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }
        int q = 0, w = 0, e = 0, r = 0;
        for (int i = 0; i < arr.length; i++) {

            if (1 == arr[i]) {
                q++;
            }
            if (2 == arr[i]) {
                w++;
            }
            if (3 == arr[i]) {
                e++;
            }
            if (4 == arr[i]) {
                r++;
            }

        }
        System.out.println();
        System.out.println("Еденичек: " + q);
        System.out.println("Двоек: " + w);
        System.out.println("Троек: " + e);
        System.out.println("Четвёрок: " + r);

        if (q > w) {
            if (q > e) {
                if (q > r) {
                    System.out.println("Еденичек больше");
                    return;
                }
            }
        }
        if (w > e) {
            if (w > r) {
                System.out.println("Двоек больше");
                return;
            }
        }
        if (e > r) {
            System.out.println("Троек больше");

        } else {
            System.out.println("Четвёрок больше");
        }
    }

}
