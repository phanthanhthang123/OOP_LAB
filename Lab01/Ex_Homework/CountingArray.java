//Phan Thanh Thang
//20225927
//6.5
package Lab01.Ex_Homework;
 
import java.util.Arrays;
import java.util.Scanner;

public class CountingArray {
    public static double avg (int[] arr){
        int length = arr.length;
        int sum = 0;
        for(int i = 0;i<length;i++){
            sum += arr[i];
        }
        return (double)sum / length;
    }

    public static void print(int[] arr){
        int length = arr.length;
        for(int i = 0;i<length;i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println("");
    }

    public static double sum(int[] arr){
        int length = arr.length;
        double sum = 0;
        for(int i=0;i<length;i++){
            sum+=(double)arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for(int i = 0;i <n;i++){
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        print(array);
        double temp = avg(array);
        double sum = sum(array);

        System.out.printf("GIa tri tong cua mang: %.2f\n",sum);
        System.out.printf("GIa tri trung binh cua mang: %.2f",temp);
        input.close();
    }
}
