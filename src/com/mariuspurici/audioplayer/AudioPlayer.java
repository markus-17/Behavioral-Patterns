package com.mariuspurici.audioplayer;

import java.util.ArrayList;

public class AudioPlayer {
    protected State state;
    protected ArrayList<String> playlist;
    protected int currentSong;
    protected boolean playing;

    public AudioPlayer(ArrayList<String> playlist) {
        this.changeState(new ReadyState(this));
        this.playlist = playlist;
    }

    public void changeState(State state) {
        this.state = state;
        if(this.state instanceof ReadyState) {
            this.playing = false;
        } else if(this.state instanceof PlayingState) {
            this.playing = true;
        }
    }

    public void clickLock() {
        System.out.print("\u001B[32mLock was clicked: \u001B[0m");
        state.clickLock();
    }

    public void clickPlay() {
        System.out.print("\u001B[32mPlay was clicked: \u001B[0m");
        state.clickPlay();
    }

    public void clickNext() {
        System.out.print("\u001B[32mNext was clicked: \u001B[0m");
        state.clickNext();
    }

    public void clickPrevious() {
        System.out.print("\u001B[32mPrevious was clicked: \u001B[0m");
        state.clickPrevious();
    }

    public void previousSong() {
        if(this.currentSong == 0) {
            this.currentSong = this.playlist.size() - 1;
        } else {
            this.currentSong -= 1;
        }
    }

    public void nextSong() {
        if(this.currentSong == this.playlist.size() - 1) {
            this.currentSong = 0;
        } else {
            this.currentSong += 1;
        }
    }
}
