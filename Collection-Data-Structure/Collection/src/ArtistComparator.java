import java.util.Comparator;

public class ArtistComparator implements Comparator<SongV2> {
    @Override
    public int compare(SongV2 o1, SongV2 o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
}
