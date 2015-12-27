package matthewallenlinsoftware.keepy_uppy.Music;

import android.media.MediaPlayer;

/**
 * Created by Darthpwner on 12/25/15.
 */
public class Music {
    static MediaPlayer mplayer;    //Used to play music
    private static Boolean startSongStarted = false;
    private static Boolean gameplaySongStarted = false;

    //Getters
    public Boolean getStartSongStarted() {
        return startSongStarted;
    }

    public Boolean getGameplaySongStarted() {
        return gameplaySongStarted;
    }

    //Setters
    public void setStartSongStarted(Boolean value) {
        startSongStarted = value;
    }

    public void setGameplaySongStarted(Boolean value) {
        gameplaySongStarted = value;
    }

    public void startMenuMusic(MediaPlayer mplayer) {
        //mplayer = MediaPlayer.create(getApplicationContext(), R.raw.start);    //Creates MediaPlayer with that specific file

        mplayer.setLooping(true);   //Song plays forever

        mplayer.start();    //Plays the music
    }
}
