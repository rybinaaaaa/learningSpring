package rybina.course.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music classicalMusic;

    private Music rockMusic;

    private List<Music> musicList;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicalMusic") Music classicalMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(MusicType music) {
        switch (music) {
            case ROCK:
                System.out.println(rockMusic.getSongs().get((int) (Math.random() * 10 % rockMusic.getSongs().size())));
                break;
            case CLASSICAL:
                System.out.println(classicalMusic.getSongs().get((int) (Math.random() * 10 % classicalMusic.getSongs().size())));
                System.out.println("match2");
                break;
        }
    }
}
