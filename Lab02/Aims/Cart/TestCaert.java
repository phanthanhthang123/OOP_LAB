//Phan Thanh Thang
//20225927
//Class "TestCart" source code
package Lab02.Aims.Cart;

import Lab02.Aims.Disc.DigitalVideoDisc;

public class TestCaert {
      public static void main(String[] args) {
            // Tạo giỏ hàng trống
            Cart anOrder = new Cart();
            // Thêm đĩa vào giỏ hàng
            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                        "Roger Allers", 87, 19.95f);
            anOrder.addDigitalVideoDisc(dvd1);
            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science Fiction",
                        "Geogre Lucas", 87, 24.95f);
            anOrder.addDigitalVideoDisc(dvd2);
            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
            anOrder.addDigitalVideoDisc(dvd3);

            anOrder.print();
      }
}
