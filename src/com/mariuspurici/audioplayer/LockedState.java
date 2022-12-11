package com.mariuspurici.audioplayer;

public class LockedState extends State {
    public LockedState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickLock() {
        if(this.player.playing) {
            System.out.println("The player is unlocked and playing!!!");
            player.changeState(new PlayingState(this.player));
        } else {
            System.out.println("The player is unlocked and stopped!!!");
            player.changeState(new ReadyState(this.player));
        }
    }

    @Override
    public void clickPlay() {
        System.out.println("clickPlay does not do anything, player locked!!!");
    }

    @Override
    public void clickNext() {
        System.out.println("clickNext does not do anything, player locked!!!");
    }

    @Override
    public void clickPrevious() {
        System.out.println("clickPrevious does not do anything, player locked!!!");
    }
}
