package rybina.course.core;

import java.util.List;
import java.util.function.Function;

public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        Function<List, Integer> random = (List list) ->(int) Math.random() * 10 / list.size();
        List<String> randomMusic = musicList.get(random.apply(musicList)).getSongs();

        System.out.println(randomMusic.get(random.apply(randomMusic)));
    }
}
