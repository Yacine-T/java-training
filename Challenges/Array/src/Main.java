import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length ; i++) {
            array[i] = r.nextInt(101);
        }
        System.out.println("Array before it has been sorted.");
        System.out.println(Arrays.toString(array));

        int[] newArray = Main.sortReverseOrder(array);
        System.out.println("Array after it has bee, sorted in descending order.");
        System.out.println(Arrays.toString(newArray));

    }

    public static int[] sortReverseOrder(int[] array){
        int tmp;
        for (int i = 0; i + 1 < array.length; i++) {
            while (array[i] < array[i+1]) {
                tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
            }
        }
        return array;
    }
}