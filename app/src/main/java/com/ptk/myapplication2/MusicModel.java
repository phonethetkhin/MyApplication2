package com.ptk.myapplication2;

public class MusicModel {
    private String musicName;
    private String artistName;

    private String releaseDate;

    public MusicModel(String musicName, String artistName, String releaseDate) {
        this.musicName = musicName;
        this.artistName = artistName;
        this.releaseDate = releaseDate;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
