import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main().go();
    }

    private void go() {
        List<SongV2 > songList = MockSongs.getSongsV2();
        Collections.sort(songList);
        System.out.println(songList);
        // sort based on Artist
        ArtistComparator artistComparator = new ArtistComparator();
        songList.sort(artistComparator);
        System.out.println(songList);
    }

    public static <T extends Animal> void f(ArrayList<T> list){
        System.out.println("generic type");
    }

    public static void f2(ArrayList<Animal> list){
        System.out.println("Animal type");
    }
}