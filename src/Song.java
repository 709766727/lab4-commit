import java.util.Arrays;

public class Song {
	
	private String title;
	private String artist;
	private int[] time;
	
	public Song(String title, String artist, int[] time) {
		this.title = title;
		this.artist = artist;
		this.time = Arrays.copyOf(time, time.length);
	}
	/**
	 * Summary sentence for this block of code. 
	 * @this.title title
	 * @this.artist artist
	 * @this.time  time
	 * ...
	 */
	
	public String getTitle() {
		return title;
	}
	/**
	 * Summary sentence for this block of code.
	 * @return title
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * Summary sentence for this block of code.
	 * @return artist
	 * ...
	 */
	public int[] getTime() {
		return Arrays.copyOf(time, time.length);
	}
	/**
	 * Summary sentence for this block of code.
	 * @return time
	 * ...
	 */
}
