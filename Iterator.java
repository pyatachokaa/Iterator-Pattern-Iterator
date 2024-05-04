import java.util.ArrayList;
import java.util.List;

interface Iterator {
    boolean hasNext();
    Song next();
}

interface Playlist {
    Iterator createIterator();
    void addSong(Song song);
}

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

class PlaylistImpl implements Playlist {
    private List<Song> songs;

    public PlaylistImpl() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public Iterator createIterator() {
        return new SongIterator();
    }

    private class SongIterator implements Iterator {
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < songs.size();
        }

        public Song next() {
            return songs.get(currentIndex++);
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        Playlist playlist = new PlaylistImpl();

        playlist.addSong(new Song("Song 1", "Artist 1"));
        playlist.addSong(new Song("Song 2", "Artist 2"));
        playlist.addSong(new Song("Song 3", "Artist 3"));

        Iterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Playing: " + song.getTitle() + " by " + song.getArtist());
        }
    }
}

