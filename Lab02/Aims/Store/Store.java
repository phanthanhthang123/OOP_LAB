//Phan Thanh Thang
//20225927
//class "Store"
package Lab02.Aims.Store;
import Lab02.hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    // Thuộc tính: mảng chứa các DVD trong cửa hàng
    private ArrayList<Media> itemsInStore;
    // Constructor
    public Store() {
        this.itemsInStore = new ArrayList<>();
    }
    // Phương thức thêm DVD vào cửa hàng
    public void addMedia(Media media) {
        if (media != null) {
            itemsInStore.add(media);
            System.out.println("DVD đã được thêm vào Store: " + media.getTitle());
        } else {
            System.out.println("DVD không hợp lệ, không thể thêm!");
        }
    }
    // Phương thức xóa DVD khỏi cửa hàng
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("DVD đã được xóa khỏi Store: " + media.getTitle());
        } else {
            System.out.println("DVD không có trong Store, không thể xóa!");
        }
    }
    
    // Hiển thị tất cả các phương tiện trong cửa hàng
    public void printStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("Store hiện không có phương tiện nào.");
        } else {
            System.out.println("Danh sách các phương tiện trong Store:");
            for (Media media : itemsInStore) {
                System.out.println(media.toString());
            }
        }
    }

}
