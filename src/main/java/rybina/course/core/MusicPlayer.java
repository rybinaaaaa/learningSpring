package rybina.course.core;

public class MusicPlayer {
    private Music music;

    //IoC

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String getMusic() {
        return music.getSong();
    }
}
