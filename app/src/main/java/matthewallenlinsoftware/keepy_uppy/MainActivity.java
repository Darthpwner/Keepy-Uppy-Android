package matthewallenlinsoftware.keepy_uppy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;

import matthewallenlinsoftware.keepy_uppy.Music.Music;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    static MediaPlayer mplayer;    //Used to play music

    Music music = new Music();    //Scaling issues

    PlayGifView pGif;   //Used to animate the GIF

    private void animateGif(PlayGifView pGif) {
        pGif = (PlayGifView) findViewById(R.id.viewGif);
        pGif.setImageResource(R.drawable.bouncing_ball);
    }

    private void startMenuMusic(MediaPlayer mplayer) {
        mplayer = MediaPlayer.create(this, R.raw.start);    //Creates MediaPlayer with that specific file

        mplayer.setLooping(true);   //Song plays forever

        mplayer.start();    //Plays the music
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animateGif(pGif);

        if(music.getStartSongStarted() == false) {
            System.out.println("CHRISTINE PANG");
            startMenuMusic(mplayer);
            music.setStartSongStarted(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), choose_ball.class);

        //Sending data to another Activity
        startActivity(nextScreen);
    }
}
