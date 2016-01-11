package matthewallenlinsoftware.keepy_uppy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class choose_background extends ActionBarActivity {

    ImageButton desert, beach, forest;
    String ball;

    private void grabChooseBallData() {
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            ball = extras.getString("ball");

            String temp = "";

      //      Log.i(temp, ball);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_background);

        grabChooseBallData();

        desert = (ImageButton) findViewById(R.id.desert_button);
        beach = (ImageButton) findViewById(R.id.beach_button);
        forest = (ImageButton) findViewById(R.id.forest_button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_background, menu);
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
        Intent nextScreen = new Intent(getApplicationContext(), choose_ball.class);

        //Sending data to another Activity
        startActivity(nextScreen);
    }

    String temp = "";

    //Forward clicks
    public void onClickDesert(View view) {
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), gameplay.class);

        nextScreen.putExtra("ball", ball);
        nextScreen.putExtra("background", "desert");

      //  Log.i(temp, "Desert");

        //Sending data to another Activity
        startActivity(nextScreen);
    }

    public void onClickBeach(View view) {
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), gameplay.class);

        nextScreen.putExtra("ball", ball);
        nextScreen.putExtra("background", "beach");

      //  Log.i(temp, "Beach");

        //Sending data to another Activity
        startActivity(nextScreen);
    }

    public void onClickForest(View view) {
        //Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(), gameplay.class);

        nextScreen.putExtra("ball", ball);
        nextScreen.putExtra("background", "forest");

//        Log.i(temp, "Forest");

        //Sending data to another Activity
        startActivity(nextScreen);
    }
}
