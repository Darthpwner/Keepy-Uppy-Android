package matthewallenlinsoftware.keepy_uppy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class choose_ball extends ActionBarActivity {

    ImageButton beachBall, basketBall, bowlingBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_ball);

        beachBall = (ImageButton) findViewById(R.id.beach_ball_button);
        basketBall = (ImageButton) findViewById(R.id.basketball_button);
        bowlingBall = (ImageButton) findViewById(R.id.bowling_ball_button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_ball, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickBackArrow(View view) {
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);

        //Sending data to another Activity
        startActivity(nextScreen);
    }

    String temp = "";

    //Forward clicks
    public void onClickBeachBall(View view) {
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), choose_background.class);

        nextScreen.putExtra("ball", "beachBall");

        //Log.i(temp, "BeachBall");

        //Sending data to another Activity
        startActivity(nextScreen);
    }

    public void onClickBasketball(View view) {
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), choose_background.class);

        nextScreen.putExtra("ball", "basketball");

       // Log.i(temp, "Basketball");

        //Sending data to another Activity
        startActivity(nextScreen);
    }

    public void onClickBowlingBall(View view) {
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), choose_background.class);

        nextScreen.putExtra("ball", "bowlingBall");

//        Log.i(temp, "BowlingBall");

        //Sending data to another Activity
        startActivity(nextScreen);
    }
}
