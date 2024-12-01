package Lab02.hust.soict.dsai.aims.media;

import java.util.Comparator;

public class CompareByTitleCost implements Comparator<Media> {
	
    @Override
    public int compare(Media media1, Media media2) {
        int titleCompare = media1.getTitle().compareTo(media2.getTitle());
        if (titleCompare != 0) {
            return titleCompare;
        }
        return Float.compare(media2.getCost(), media1.getCost()); // Sắp xếp theo giá giảm dần nếu tiêu đề giống nhau
    }
}

