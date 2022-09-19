import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(max(initializeArray()));
    }

    public static int[] initializeArray() throws IOException {
        int[] arr = new int[10];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(buf.readLine());
            arr[i] = num;
            }
            return arr;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
