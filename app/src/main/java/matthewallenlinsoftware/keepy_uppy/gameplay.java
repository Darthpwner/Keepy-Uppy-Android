package matthewallenlinsoftware.keepy_uppy;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import matthewallenlinsoftware.keepy_uppy.Background.Background;
import matthewallenlinsoftware.keepy_uppy.Background.Beach;
import matthewallenlinsoftware.keepy_uppy.Background.Desert;
import matthewallenlinsoftware.keepy_uppy.Background.Forest;
import matthewallenlinsoftware.keepy_uppy.Ball.Ball;
import matthewallenlinsoftware.keepy_uppy.Ball.Basketball;
import matthewallenlinsoftware.keepy_uppy.Ball.BeachBall;
import matthewallenlinsoftware.keepy_uppy.Ball.BowlingBall;


public class gameplay extends ActionBarActivity {

    String ballData, backgroundData;
    Ball ball;
    Background background;
    RelativeLayout backgroundImage;

//    private PhysicsWorld x;

    private void grabChooseBallAndChooseBackgroundData() {
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            ballData = extras.getString("ball");
            backgroundData = extras.getString("background");

            String temp = "";

            Log.i(temp, ballData);
            Log.i(temp, backgroundData);
        }
    }

    private void setBallProperties() {
        if(ballData.equals("beachBall")) {
            //Create beachBall
            ball = new BeachBall();
        } else if(ballData.equals("basketball")) {
            //Create basketball
            ball = new Basketball();
        } else {
            //Create bowling ball
            ball = new BowlingBall();
        }
    }

    private void setBackgroundProperties() {
        backgroundImage = (RelativeLayout) findViewById(R.id.backgroundImage);

        if(backgroundData.equals("desert")) {
            //Create desert
            background = new Desert();

            //BUGGY
            backgroundImage.setBackgroundResource(R.drawable.desert);
        } else if(backgroundData.equals("beach")) {
            //Create beach
            background = new Beach();
            backgroundImage.setBackgroundResource(R.drawable.beach);
        } else {
            //Create forest
            background = new Forest();
            backgroundImage.setBackgroundResource(R.drawable.forest);
        }
    }

    private void setUpScoreZone() {
//        View v = new View(this);
//        v.setLayoutParams(new LinearLayout.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                5
//        ));
//        v.setBackgroundColor(Color.parseColor("#B3B3B3"));
//
//        LinearLayout.addView(v);
    }

    private void setUpDangerZone() {

    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        grabChooseBallAndChooseBackgroundData();

        setBallProperties();

        setBackgroundProperties();

        setUpScoreZone();

        setUpDangerZone();

        Log.i("STOP", "STOP");

        //TODO: High score
//        //MODE_PRIVATE allows only your app to access this data
//        SharedPreferences sharedPreferences = this.getSharedPreferences("matthewallenlinsoftware.keepy_uppy", Context.MODE_PRIVATE);
//
//        //Saves data
//        sharedPreferences.edit().putInt("username", "rob").apply();
//
//        //Get the data back
//        String username = sharedPreferences.getString("username", "");
//
//        Log.i("username", username);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gameplay, menu);
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
}
