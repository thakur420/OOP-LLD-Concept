public class SongV2 implements Comparable<SongV2>{
    private String title;
    private String artist;
    private int bpm;
    public SongV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }
    public String toString(){
        return this.getTitle() + "," + this.getArtist() + "," +this.getBpm();
    }

    @Override
    public int compareTo(SongV2 songs) {
        return this.getTitle().compareTo(songs.getTitle());
    }
}
