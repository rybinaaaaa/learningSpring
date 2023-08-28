package rybina.course.core;

import java.util.List;

public class IndieMusic implements Music{

    private List<String> songs = List.of("Song4", "Song5", "Song6");

    @Override
    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
