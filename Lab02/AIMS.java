//Phan Thanh Thang
//20225927
//class "AIMS" (Main class)
package Lab02;

import java.util.Scanner;
import Lab02.Aims.Cart.Cart;
import Lab02.Aims.Store.Store;

public class AIMS {
	public static void main(String[] args) {

		Store store = new Store(); // Khởi tạo cửa hàng
		Cart cart = new Cart(); // Khởi tạo giỏ hàng
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			showMenu();
			choice = scanner.nextInt(); // Đọc lựa chọn từ người dùng
			scanner.nextLine(); // Xử lý dòng nhập thừa
			switch (choice) {
				case 1: // Xem cửa hàng
					System.out.println("Danh sách mặt hàng trong cửa hàng:");
					store.printStore(); // Hiển thị danh sách trong cửa hàng
					storeMenu(); // Hiển thị menu liên quan đến cửa hàng
					break;
				case 2: // Cập nhật cửa hàng
						// Thêm logic cập nhật cửa hàng (nếu có)
					break;
				case 3: // Xem giỏ hàng hiện tại
					System.out.println("Nội dung trong giỏ hàng:");
					cart.totalCost(); // Hiển thị giỏ hàng
					cartMenu(); // Hiển thị menu giỏ hàng
					break;
				case 0: // Thoát
					System.out.println("Chương trình kết thúc. Cảm ơn bạn đã sử dụng!");
					break;
				default:
					System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
			}

		} while (choice != 0);
		scanner.close();
	}

	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. Xem cửa hàng");
		System.out.println("2. Cập nhật cửa hàng");
		System.out.println("3. Xem giỏ hàng hiện tại");
		System.out.println("0. Thoát");
		System.out.println("--------------------------------");
		System.out.println("Vui lòng chọn một số: 0-1-2-3");
	}

	public static void storeMenu() {
		System.out.println("Các tùy chọn: ");
		System.out.println("--------------------------------");
		System.out.println("1. Xem chi tiết một phương tiện");
		System.out.println("2. Thêm phương tiện vào giỏ hàng");
		System.out.println("3. Phát phương tiện");
		System.out.println("4. Xem giỏ hàng hiện tại");
		System.out.println("0. Quay lại");
		System.out.println("--------------------------------");
		System.out.println("Vui lòng chọn một số: 0-1-2-3-4");
	}

	public static void mediaDetailsMenu() {
		System.out.println("Các tùy chọn: ");
		System.out.println("--------------------------------");
		System.out.println("1. Thêm vào giỏ hàng");
		System.out.println("2. Phát");
		System.out.println("0. Quay lại");
		System.out.println("--------------------------------");
		System.out.println("Vui lòng chọn một số: 0-1-2");
	}

	public static void cartMenu() {
		System.out.println("Các tùy chọn: ");
		System.out.println("--------------------------------");
		System.out.println("1. Lọc các phương tiện trong giỏ hàng");
		System.out.println("2. Sắp xếp các phương tiện trong giỏ hàng");
		System.out.println("3. Xóa phương tiện khỏi giỏ hàng");
		System.out.println("4. Phát phương tiện");
		System.out.println("5. Đặt hàng");
		System.out.println("0. Quay lại");
		System.out.println("--------------------------------");
		System.out.println("Vui lòng chọn một số: 0-1-2-3-4-5");
	}
}