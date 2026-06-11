package design.pattern.structural.adapter;

public class VideoPlayer implements MediaPlayer {
    private final MediaPlayerAdapter adapter;

    public VideoPlayer(MediaPlayerAdapter adapter) {
        this.adapter = adapter;
    }

    public void play(Format format, String filename) {
        switch (format) {
            case AVI, VLC -> this.adapter.play(format, filename);
            default -> System.out.println("Playing mp4 video: " + filename);
        }
    }
}
