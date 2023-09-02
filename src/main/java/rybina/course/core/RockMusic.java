package rybina.course.core;

import org.springframework.stereotype.Component;

import java.util.List;

public class RockMusic implements Music{

    private List<String> songs = List.of("Song7", "Song8", "Song9");

    @Override
    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
