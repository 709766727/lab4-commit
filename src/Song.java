import java.util.Arrays;

public class Song {
	
	private String title;
	private String artist;
	private int[] time;
	/**
	 * Initialize a Song class. 
	 * @param title Song's title
	 * @param artist Song's artist
	 * @param  time Songs's time
	 * ...
	 */
	
	public Song(String title, String artist, int[] time) {
		this.title = title;
		this.artist = artist;
		this.time = Arrays.copyOf(time, time.length);
	}
	
	/**
	 * get songs' title.
	 * @return title Songs' title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * get songs' artist.
	 * @return artist Songs' artist
	 * ...
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * get songs' time.
	 * @return time Get song's time 
	 * ...
	 */
	public int[] getTime() {
		return Arrays.copyOf(time, time.length);
	}
	
}
