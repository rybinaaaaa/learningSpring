package rybina.course.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getMusic());
//        for (Music music: musicPlayer.getMusicList()) {
//            System.out.println(music.getSong());
//        }

        ClassicalMusic music = context.getBean("musicBean", ClassicalMusic.class);
                    System.out.println(music.getSong());
        context.close();
    }
}
