package Lab02.hust.soict.dsai.aims.media;


import java.util.Comparator;

public class CompareByCostTitle implements Comparator<Media> {
	
    @Override
    public int compare(Media media1, Media media2) {
        int costCompare = Float.compare(media2.getCost(), media1.getCost()); // Sắp xếp theo giá giảm dần
        if (costCompare != 0) {
            return costCompare;
        }
        return media1.getTitle().compareTo(media2.getTitle()); // Nếu giá giống nhau, sắp xếp theo tiêu đề
    }
}

