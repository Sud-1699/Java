package design.pattern.structural.adapter;

public class MediaPlayerAdapter implements MediaPlayer {
    private final AVIPlayer aviPlayer;
    private final VLCPlayer vlcPlayer;

    public MediaPlayerAdapter(AVIPlayer aviPlayer, VLCPlayer vlcPlayer) {
        this.aviPlayer = aviPlayer;
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(Format format, String filename) {
        switch (format) {
            case AVI -> this.aviPlayer.playAVIMedia(filename);
            case VLC -> this.vlcPlayer.playVLCMedia(filename);
        }
    }
}
