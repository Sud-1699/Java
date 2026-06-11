package design.pattern.structural.adapter;

public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLCMedia(String filename) {
        System.out.println("Play VLC video");
    }

    @Override
    public void playAVIMedia(String filename) {
        // Do nothing
    }
}
