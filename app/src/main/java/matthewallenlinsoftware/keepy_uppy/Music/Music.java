package matthewallenlinsoftware.keepy_uppy.Music;

import android.media.MediaPlayer;

/**
 * Created by Darthpwner on 12/25/15.
 */
public class Music {
    static MediaPlayer mplayer;    //Used to play music
    static Boolean songStarted = false;

    public void startMenuMusic() {
        //mplayer = MediaPlayer.create(R.raw.start);    //Creates MediaPlayer with that specific file

        mplayer.setLooping(true);   //Song plays forever

        mplayer.start();    //Plays the music
    }

}
