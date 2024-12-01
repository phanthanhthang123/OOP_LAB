package Lab02.hust.soict.dsai.aims.media;


import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	
	private String artist;
	private List<Track> listTracks = new ArrayList<Track>();
	
	public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
		super(id, title, category, cost, length, director);
		
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}
	

    // Phương thức thêm track vào danh sách
    public void addTrack(Track track) {
        if (listTracks.contains(track)) {
            System.out.println("Track " + track.getTitle() + " is already in the list.");
        } else {
            listTracks.add(track);
            System.out.println("Track " + track.getTitle() + " added to the list.");
        }
    }

    // Phương thức xóa track khỏi danh sách
    public void removeTrack(Track track) {
        if (listTracks.contains(track)) {
            listTracks.remove(track);
            System.out.println("Track " + track.getTitle() + " removed from the list.");
        } else {
            System.out.println("Track " + track.getTitle() + " is not in the list.");
        }
    }
	
	public int getLength() {
		return this.getLength();
	}
	
    @Override
    public void play() {
        if (listTracks.isEmpty()) {
            System.out.println("No tracks in the CD to play.");
            return;
        }
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("CD length: " + this.getLength());

        for (Track track : listTracks) {
            if (track != null) {
                track.play();
            } else {
                System.out.println("Null track encountered.");
            }
        }
    }
    
    @Override
    public String toString() {
        // Gọi phương thức getLength() từ lớp cha Disc, tránh đệ quy
        return "CD - " + this.getTitle() + " - " + 
                this.getCategory() + " - " + getArtist() + " - " + 
                super.getLength() + " mins: " + this.getCost() + " $";
    }

}
