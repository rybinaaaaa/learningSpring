package rybina.course.core;

import java.util.List;

public class MusicPlayer {
    private Music music;

    private List<Music> musicList;
    private int volume;

    public MusicPlayer() {
    }
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(Music music, List<Music> musicList) {
        this.music = music;
        this.musicList = musicList;
    }

    public String getMusic() {
        return music.getSong();
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
