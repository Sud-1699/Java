package design.pattern.structural.adapter;

public class AdapterPattern {
    public static void main(String[] args) {
        MediaPlayerAdapter adapter = new MediaPlayerAdapter(new AVIPlayer(), new VLCPlayer());
        VideoPlayer player = new VideoPlayer(adapter);

        player.play(Format.VLC, "hello.vlc");
    }
}
