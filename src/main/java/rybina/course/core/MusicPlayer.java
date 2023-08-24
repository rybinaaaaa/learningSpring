package rybina.course.core;

public class MusicPlayer {
    private Music music;

    //IoC

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }
}
