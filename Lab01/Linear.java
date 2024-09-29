//Phan Thanh Thang
//20225927
//2.2.6
package Lab01;

import java.util.Scanner;

public class Linear {
    public static void LinearEquation(){
        Scanner sc = new Scanner(System.in);

        // Nhập hệ số a và b từ người dùng
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();

        // Kiểm tra xem a có phải là 0 hay không
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            // Tính nghiệm x
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }


    public static void SystemLinearEquation(){
        // Nhập hệ số
        //a1*x + b1*y = c1
        //a2*x + b2*y = c2
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a1: ");
        double a1 = sc.nextDouble();
        System.out.print("Input b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Input c1: ");
        double c1 = sc.nextDouble();
        System.out.print("Input a2: ");
        double a2 = sc.nextDouble();
        System.out.print("Input b2: ");
        double b2 = sc.nextDouble();
        System.out.print("Input c2: ");
        double c2 = sc.nextDouble();

        // Tính định thức hệ số
        double det = a1 * b2 - a2 * b1;

        // Kiểm tra xem hệ phương trình có nghiệm hay không
        if (det == 0) {
            if (c1/c2 == a1/a2) {
                System.out.println("He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        } else {
            // Tính nghiệm x và y
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;

            System.out.println("Nghiem cua he phuong trinh la:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
    public static void main(String[] args){
        LinearEquation();
        SystemLinearEquation();
    }
}