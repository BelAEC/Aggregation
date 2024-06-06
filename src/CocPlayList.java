import java.util.Arrays;

public class CocPlayList {

    public static void main(String[] args) {

        Playlist p1 = new Playlist(19, "favorites"); //
        Song s1 = new Song("Close your eyes", "Bangles");
        Song s2 = new Song("Greatest", "Sia");
        p1.addSong(s1);
        p1.addSong(s2);
        p1.addSong(new Song("hello", "Lionel Rithcie"));
        p1.displayPlaylistInfo(p1.getSongs());
        //s2.addSong("x", "Sia");
       // Playlist list1 = new Song(("Blow up", "Stones"));
    }
}
    class Playlist {

    //Song objects are the songs in the playlisg
        private Song [] songs; //list of songs that will be added to a playlist
        private int numSongs;
        private String playlistName;

        public Playlist(int numSongs, String playlistName) {

            this.numSongs = numSongs;
            this.playlistName = playlistName;
            //Playlist [] playlist = new Playlist[0];

            }

        //build list of songs one at a time

        public void addSong (Song song) {
            //not initialised ,
            if(songs == null) {
                //create a son list
                songs = new Song[1];
                //his creates a new local variable 'songs', not updating the class field
                songs[0] = song;

            }else{
                //create a a list with one more space to keep adding songs
                //added ab extra soace at tge edb
                songs = Arrays.copyOf(songs, songs.length + 1);
                songs[songs.length-1] = song;

             }
         }
        public void playAllSongs(Playlist playlist) {
            Song[] songs = playlist.getSongs(); // Get the array of songs from the playlist

            if (songs == null || songs.length == 0) {
                System.out.println("No songs in the playlist.");
            } else {
                System.out.println("Playing all songs in the playlist:");
                for (Song song : songs) {
                    System.out.println("Song Name: " + song.getName());
                    System.out.println("Author: " + song.getAuthor());
                    System.out.println("---------------------------------------");
                }
            }
        }


        public void displayPlaylistInfo(Song[] songs){
            for(Song s : songs){
                System.out.println("Playlist info = \n"
                +playlistName + ", Songs : \n"
                        +" Song name : "+ s.getName()
                        +" Author : " +s.getAuthor()

                );
            }

         }
        public String getPlaylistName() {
            return playlistName;
        }

        public void setPlaylistName(String playlistName) {
            this.playlistName = playlistName;
        }

        public Song[] getSongs() {
            return songs;
        }

        public void setSongs(Song[] songs) {
            this.songs = songs;
        }

        public int getNumSongs() {
            return numSongs;
        }

        public void setNumSongs(int numSongs) {
            this.numSongs = numSongs;
        }
    }

    class  Song {
    private String name;
    private String author;

        public Song(String name, String author) {
            this.name = name;
            this.author = author;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }
