package rybina.course.core;

import java.util.List;

public class JazzMusic implements Music {

    private List<String> songs = List.of("Jazz1", "Jazz2", "Jazz3");
    @Override
    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
