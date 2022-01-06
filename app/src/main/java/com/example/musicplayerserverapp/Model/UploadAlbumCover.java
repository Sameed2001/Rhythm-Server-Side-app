package com.example.musicplayerserverapp.Model;

public class UploadAlbumCover {
    public String albumName;
    public String url;
    public String songGenre;

    public UploadAlbumCover(String albumName, String url, String songGenre) {
        this.albumName = albumName;
        this.url = url;
        this.songGenre = songGenre;
    }

    public UploadAlbumCover() {
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }
}
