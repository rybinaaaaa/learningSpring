package rybina.course.core;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class ClassicalMusic implements Music{

    private List<String> songs = List.of("Song1", "Song2", "Song3");

    public void initMethod() {
        System.out.println("init");
    }

    public void destroyMethod() {
        System.out.println("destroy");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
