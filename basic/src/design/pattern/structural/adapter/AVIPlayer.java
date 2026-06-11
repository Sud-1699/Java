package design.pattern.structural.adapter;

public class AVIPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLCMedia(String filename) {
        // Do nothing
    }

    @Override
    public void playAVIMedia(String filename) {
        System.out.println("Play AVI video");
    }
}
