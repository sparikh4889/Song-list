public class Song {

    public String name;
    public String artist;
    public String album;
    public int year;
    
    // first constructor with only name and artist
    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
        album = null;
        year = 0;
    }
    
    // second constructor with all fields: name, artist, album, and year
    public Song(String name, String artist, String album, int year) {
            this.name = name;
            this.artist = artist;
            this.album = album;
            this.year = year;
    }

    public void updateName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void updateArtist(String newArtist) {
        artist = newArtist;
    }

    public String getArtist() {
        return artist;
    }

    public void updateAlbum(String newAlbum) {
        album= newAlbum;
    }

    public String getAlbum() {
        return album;
    }

    public void updateYear(int newYear) {
        year = newYear;
    }

    public int getYear() {
        return year;
    }

    // compareTo helper method used to sort songs in alphabetical order
        // If song name are the same, sort in alphabetical order by artist
    public int compareTo(Song SongA, Song SongB) {
        if (SongA.getName().compareTo(SongB.getName()) != 0) {
            return SongA.getName().compareTo(SongB.getName());
        } else {
            return SongA.getArtist().compareTo(SongB.getArtist());
        }
    }

    public String toString() {
        // implement year and album as well (if statement).
        String testPrint = name + " Song by " + artist;
            if (album!=null) {
                testPrint += ", album: " + album;
            } 
            if (year != 0) {
                testPrint += ", in " + year;
            }
            return testPrint;
        
        //return name + "Song by " + artist;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Song A = new Song("Yall", "dan");
        System.out.println(A.toString());
    }

}
