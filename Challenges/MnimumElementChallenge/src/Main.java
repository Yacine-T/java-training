import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] res = Main.readIntegers();
        System.out.println(Arrays.toString(res));
        int val = Main.findMin(res);
        System.out.println("The minimum value is : " + val);
        System.out.println("-".repeat(20));

        System.out.println("Array before it has been reversed");
        System.out.println(Arrays.toString(res));
        Main.reverseArray(res);
        System.out.println("Array after it has been reversed");
        System.out.println(Arrays.toString(res));
    }

    private static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a serie of number delimited by comma.");
        return Arrays.stream(sc.nextLine().split(",")).
                        mapToInt(value -> Integer.parseInt(value.trim())).toArray();
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int elt: array) {
            if (min > elt)
                min = elt;
        }
        return min;
    }

    private static void reverseArray(int[] array){
        int j = array.length -1, tmp;
        for (int i = 0; i <= j ; i++) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            j--;
        }
    }
}