//Phan Thanh Thang
//20225927
//Class "DigitalVideoDisc" source code
package Lab02.Aims.Disc;

import Lab02.hust.soict.dsai.aims.media.Disc;
import Lab02.hust.soict.dsai.aims.media.Media;
import Lab02.hust.soict.dsai.aims.media.Playable;


public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;
	
    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
		super(nbDigitalVideoDiscs++, title, category, cost, length, director);
	}

	// Ghi đè phương thức equals
    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu đối tượng so sánh chính là đối tượng hiện tại
        if (this == obj) return true;
        // Kiểm tra nếu obj là null hoặc không cùng kiểu
        if (obj == null || getClass() != obj.getClass()) return false;
        // Ép kiểu obj thành DigitalVideoDisc
        DigitalVideoDisc disc = (DigitalVideoDisc) obj;
        // So sánh các thuộc tính
        return this.getTitle().equals(disc.getTitle()) && 
               this.getCategory().equals(disc.getCategory()) && 
               this.getDirector().equals(disc.getDirector()) && 
               this.getCost() == disc.getCost() &&
               this.getLength() == disc.getLength();
    }
    
    
    @Override
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + 
        		this.getCategory() + " - " + getDirector() + " - " + 
        		getLength() + " mins: " + this.getCost() + " $";
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    
    @Override
    public int compareTo(Media other) {
        if (other instanceof DigitalVideoDisc) {
            DigitalVideoDisc dvd = (DigitalVideoDisc) other;
            int titleCompare = this.getTitle().compareTo(dvd.getTitle());
            if (titleCompare != 0) {
                return titleCompare;
            }
            int lengthCompare = Integer.compare(dvd.getLength(), this.getLength()); // Sắp xếp theo chiều dài giảm dần
            if (lengthCompare != 0) {
                return lengthCompare;
            }
            return Float.compare(dvd.getCost(), this.getCost()); // Sắp xếp theo giá giảm dần
        }
        return super.compareTo(other); // Nếu không phải DVD, sử dụng phương thức compareTo trong Media
    }
}

    









    // Phương thức khởi dựng các thông tin của đĩa DVD
    // Các phương thức khởi dựng trên nạp chồng
    // Constructor by title
    // public DigitalVideoDisc(String title) {
    //     super();
    //     this.title = title;
    //     this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    // }

    // // Constructor by category, title and cost
    // public DigitalVideoDisc(String title, String category, float cost) {
    //     this.title = title;
    //     this.category = category;
    //     this.cost = cost;
    //     this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    // }

    // // Constructor by title, category , director, cost
    // public DigitalVideoDisc(String title, String category, String director, float cost) {
    //     this.title = title;
    //     this.category = category;
    //     this.director = director;
    //     this.cost = cost;
    //     this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    // }

    // // Constructor by all attributes
    // public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    //     this.title = title;
    //     this.category = category;
    //     this.director = director;
    //     this.length = length;
    //     this.cost = cost;
    //     this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    // }

    // // Các phương thức lấy dữ liệu của đĩa DVD

    // // Getter for title
    // public String getTitle() {
    //     return title;
    // }

    // // Getter for category
    // public String getCategory() {
    //     return category;
    // }

    // // Getter for director
    // public String getDirector() {
    //     return director;
    // }

    // // Getter for length
    // public int getLength() {
    //     return length;
    // }

    // // Getter for cost
    // public float getCost() {
    //     return cost;
    // }

    // public int getId() {
    //     return id;
    // } // Ham lay id

    // // Cac phuong thuc chinh sua thuoc tinh cua du lieu
    // // Setting for title
    // public void setTitle(String titleSet) {
    //     title = titleSet;
    // }

    // public void setCategory(String categorySet) {
    //     category = categorySet;
    // }

    // public void setDirector(String directorSet) {
    //     director = directorSet;
    // }

    // public void setLength(int lengthSet) {
    //     length = lengthSet;
    // }

    // public void setCost(float costSet) {
    //     cost = costSet;
    // }
// }