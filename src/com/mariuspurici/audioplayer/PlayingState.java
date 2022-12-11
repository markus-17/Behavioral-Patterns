package com.mariuspurici.audioplayer;

public class PlayingState extends State {
    public PlayingState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickLock() {
        System.out.println("The player is now locked and playing!!!");
        player.changeState(new LockedState(this.player));
    }

    @Override
    public void clickPlay() {
        System.out.println("The player stopped playing");
        player.changeState(new ReadyState(this.player));
    }

    @Override
    public void clickNext() {
        this.player.nextSong();
        System.out.println("The player is at song " + this.player.playlist.get(this.player.currentSong));
    }

    @Override
    public void clickPrevious() {
        this.player.previousSong();
        System.out.println("The player is at song " + this.player.playlist.get(this.player.currentSong));
    }
}
