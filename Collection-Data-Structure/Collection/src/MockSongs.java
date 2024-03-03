import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<String> getSongStrings(){
        List<String> songs = new ArrayList<>();
        songs.add("abc");
        songs.add("sdf");
        songs.add("dfjk");
        songs.add("yeh toh bata zindgi");
        songs.add("darshan deb aahan kahiya");
        return songs;
    }
    public static List<SongV2> getSongsV2(){
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("abc","ram",12));
        songs.add(new SongV2("sdf","sanu",123));
        songs.add(new SongV2("dfjk","shankar",12));
        songs.add(new SongV2("yeh toh bata","kishor",12));
        songs.add(new SongV2("baba nene chalu","lata",12));
        songs.add(new SongV2("kai suntai sansar me","mukesh",12));
        return songs;
    }
}
