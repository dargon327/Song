import java.util.ArrayList;
import java.util.Locale;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> newListener;
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        newListener = new ArrayList();
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int howMany(ArrayList<String> listeners) {
        int ans = 0;

        for (int i = 0; i < listeners.size(); i++) {
            boolean maybe = false;
            listeners.set(i,listeners.get(i).toLowerCase());
            for (int j = 0; j < newListener.size();j++) {
                if (listeners.get(i).equals(newListener.get(j))) {
                    maybe = true;
                }
            }
            if (maybe == true) {
                continue;
            }
            ans++;
            newListener.add(listeners.get(i));
        }
        return ans;
    }

}
