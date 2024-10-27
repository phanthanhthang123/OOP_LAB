//Phan Thanh Thang
//20225927
//class "AIMS" (Main class)
package Lab02;

import Lab02.Aims.Cart.Cart;
import Lab02.Aims.Disc.DigitalVideoDisc;

public class AIMS {
    public static void main(String[] args) {
        //Tạo giỏ hàng trống
        Cart anOrder = new Cart();

        
        //Thêm đĩa vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //Kiểm tra khi chưa thực hiện hàm xoá
        anOrder.print();

        //Kiểm tra khi dã thực hiện hàm xoá
        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd1);
        //Hàm System.out.printf() định dạng như ngôn ngữ C/C++
        System.out.printf("Total cost is: %.2f",anOrder.totalCost());
    }
}