package rybina.course.core;

import java.util.List;

public class IndieMusic implements Music{

    private List<String> songs = List.of("Indie1", "Indie2", "indie3");

    @Override
    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
