package Lab02.hust.soict.dsai.aims.media;
import java.lang.Object;
import java.util.Comparator;

public abstract class Media {
	
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public static void main(String[] args) {
	}
	
	public Media() {
	}

	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true; // Kiểm tra tham chiếu
	    if (obj == null || getClass() != obj.getClass()) return false; // Kiểm tra kiểu đối tượng

	    Media media = (Media) obj; // Ép kiểu
	    return this.title.equals(media.title); // So sánh thuộc tính title
	}

    // Comparator cho việc sắp xếp theo tiêu đề rồi đến giá
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
    		new CompareByTitleCost();

    // Comparator cho việc sắp xếp theo giá rồi đến tiêu đề
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
    		new CompareByCostTitle();
	
    // Phương thức compareTo để sắp xếp theo tiêu đề rồi đến giá
    
    public int compareTo(Media other) {
        int titleCompare = this.getTitle().compareTo(other.getTitle());
        if (titleCompare != 0) {
            return titleCompare;
        }
        return Float.compare(other.getCost(), this.getCost()); // Sắp xếp theo giá giảm dần nếu tiêu đề giống nhau
    }
}
