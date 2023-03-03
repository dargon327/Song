import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class SongTester {

    private Song song = new Song("Lavender Haze", "Taylor Swift");

    @Test
    public void TestForTitleAndArtist() {
        assertEquals("Wrong title!", "Lavender Haze", song.getTitle());
        assertEquals("Wrong artist!", "Taylor Swift", song.getArtist());
    }

    @Test
    public void TestForDataEncapsulation() {
        assertEquals("Make sure that your attributes are private!", 0, song.getClass().getFields().length);
    }

    @Test
    public void TestHowManyMethod() {
        assertEquals(5, song.howMany(new ArrayList<String>(Arrays.asList("Jonathan", "Sylvia", "Rena", "Teri", "Ann Ling"))));
        assertEquals(2, song.howMany(new ArrayList<String>(Arrays.asList("JoNathan", "Renita", "Amanda"))));
        assertEquals(1, song.howMany(new ArrayList<String>(Arrays.asList("AmAnda", "RENITA", "AmandA", "Athan"))));
        assertEquals(3, song.howMany(new ArrayList<String>(Arrays.asList("TERI", "RENA", "rena", "Cherry", "Vanessa", "Natalie"))));
        assertEquals(1, song.howMany(new ArrayList<String>(Arrays.asList("Sherry", "SherRY"))));
    }

}