//Phan Thanh Thang
//20225927
//6.4

package Lab01.Ex_Homework;
 
import java.util.Scanner;

public class NumberOfDayInMonth {
    public static int convertMonthToNumber(String monthStr) {
        switch (monthStr.toLowerCase()) {
            case "january":
            case "jan.":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun.":
            case "6":
                return 6;
            case "july":
            case "jul.":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "8":
                return 8;
            case "september":
            case "sept.":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "12":
                return 12;
            default:
                return 0;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int getDaysInMonth(int year, int month) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int check = 1;
        while (check==1) {
            System.out.println("Vi du: Cac cach nhap hop le cho thang 1 là January, Jan, hoac 1");
            System.out.print("Xin moi nhap thang: ");
            String monthStr = input.nextLine();
            System.out.print("Xin moi nhap nam: ");
            int year = input.nextInt();
            input.nextLine();
            int month = convertMonthToNumber(monthStr);

            if(month >12 || month <=0){
                System.out.println("Nhap thang khong hop le, vui long nhap lai!");
                check = 1;
            }else{
                System.out.printf("So ngay cua thang %d trong nam %d la: %d\n",month,year,getDaysInMonth(year, month));
                check = 0;
            }
        }
    }
}
