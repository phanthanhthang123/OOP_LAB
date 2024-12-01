//Phan Thanh Thang
//20225927
//6.6
package Lab01.Ex_Homework; 
import java.util.Scanner; 
public class AddTwoMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int row = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int col = sc.nextInt();

        //Khai báo ma trận số thực
        double[][] matA = new double[row][col]; //Ma trận A
        double[][] matB = new double[row][col]; //Ma trận B
        double[][] matAns = new double[row][col]; //Ma trận kết quả

        //Nhập các phần tử trong các ma trận
        System.out.println("\nHay nhap cac phan tu trong ma tran A: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matA[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\nHay nhap cac phan tu trong ma tran B: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matB[i][j] = sc.nextDouble();
            }
        }

        //Tính matA + matB
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matAns[i][j] = matA[i][j] + matB[i][j];
            }
        }

        //In kết quả
        System.out.println("\n________________________________");
        System.out.println("Ket qua matA + amtB la: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matAns[i][j]+" ");
            }
            System.out.println();   //Xuống dòng
        }
        sc.close();
    }
}