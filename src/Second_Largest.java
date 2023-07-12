import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println(second_largest(array, size));
    }

    static int second_largest(int[] array, int size) {
        int temp=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        if(array[size-1]==array[size-2]){
            return -1;
        }
        return array[size-2];
    }
}
