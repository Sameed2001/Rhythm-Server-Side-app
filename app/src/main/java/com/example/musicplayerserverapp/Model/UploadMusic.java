package com.example.musicplayerserverapp.Model;

public class UploadMusic {
    public String songGenre, songTitle, artist, album_name, songDuration, songLink, mKey;

    public UploadMusic(String songGenre, String songTitle, String artist, String album_name, String songDuration, String songLink) {

        if(songTitle.trim().equals(""))
        {
            songTitle = "No Title";
        }
        this.songGenre = songGenre;
        this.songTitle = songTitle;
        this.artist = artist;
        this.album_name = album_name;
        this.songDuration = songDuration;
        this.songLink = songLink;
    }

    public UploadMusic() {
    }

    public String getSongGenre() {
        return songGenre;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_art) {
        this.album_name = album_art;
    }

    public String getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(String songDuration) {
        this.songDuration = songDuration;
    }

    public String getSongLink() {
        return songLink;
    }

    public void setSongLink(String songLink) {
        this.songLink = songLink;
    }

    public String getmKey() {
        return mKey;
    }

    public void setmKey(String mKey) {
        this.mKey = mKey;
    }
}
