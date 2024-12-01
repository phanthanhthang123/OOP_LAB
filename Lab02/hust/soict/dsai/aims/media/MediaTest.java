package Lab02.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import Lab02.Aims.Disc.DigitalVideoDisc;


public class MediaTest {
    public static void main(String[] args) {
        // Tạo một ArrayList chứa các phương tiện Media
        ArrayList<Media> mediaList = new ArrayList<Media>();
        // Thêm các phương tiện vào danh sách
        mediaList.add(new CompactDisc(1, "CD Title", "Music", 15.99f, 60, "Director", "Artist"));
        mediaList.add(new DigitalVideoDisc("DVD Title", "Movies", 20.99f, 120, "Director"));
        mediaList.add(new Book(3, "Book Title", "Literature", 10.99f, "Author"));

        // Duyệt qua danh sách và in thông tin của các phương tiện
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}
