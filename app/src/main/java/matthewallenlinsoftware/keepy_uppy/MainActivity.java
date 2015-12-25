package matthewallenlinsoftware.keepy_uppy;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creates MediaPlayer with that specific file
        MediaPlayer mplayer = MediaPlayer.create(this, R.raw.start);

        mplayer.setLooping(true);   //Song plays forever

        mplayer.start();    //Plays the music
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        // Take what was typed into the EditText
        // and use in TextView
    }
}
