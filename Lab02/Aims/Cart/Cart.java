//Phan Thanh Thang
//20225927
//Class "Cart" source code
package Lab02.Aims.Cart;

import Lab02.hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;


public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    // Constructor không tham số
    public Cart() {
        this.itemsOrdered = new ArrayList<Media>();
    }
    
	public void addMedia(Media media) {
	    if (!itemsOrdered.contains(media)) {
	        itemsOrdered.add(media);
	        System.out.println(media.getTitle() + " has been added to the cart.");
	    } else {
	        System.out.println(media.getTitle() + " is already in the cart.");
	    }
	}

	public void removeMedia(Media media) {
	    if (itemsOrdered.contains(media)) {
	        itemsOrdered.remove(media);
	        System.out.println(media.getTitle() + " has been removed from the cart.");
	    } else {
	        System.out.println(media.getTitle() + " is not in the cart.");
	    }
	}
	
	public float totalCost() {
	    float total = 0;
	    for (Media media : itemsOrdered) {
	        total += media.getCost();
	    }
	    return total;
	}
	
    public void sortMediaByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortMediaByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
    
}
