package matthewallenlinsoftware.keepy_uppy;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.WakeLockOptions;
import org.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.util.FPSLogger;
import org.andengine.ui.activity.LayoutGameActivity;

import java.io.IOException;

import matthewallenlinsoftware.keepy_uppy.Background.Background;
import matthewallenlinsoftware.keepy_uppy.Background.Beach;
import matthewallenlinsoftware.keepy_uppy.Background.Desert;
import matthewallenlinsoftware.keepy_uppy.Background.Forest;
import matthewallenlinsoftware.keepy_uppy.Ball.Ball;
import matthewallenlinsoftware.keepy_uppy.Ball.Basketball;
import matthewallenlinsoftware.keepy_uppy.Ball.BeachBall;
import matthewallenlinsoftware.keepy_uppy.Ball.BowlingBall;


public class gameplay extends LayoutGameActivity {

    //AndEngine variables//
    private Camera camera;
    private int CAMERA_WIDTH = 320;
    private int CAMERA_HEIGHT = 480;
    public Scene currentScene;
    //End of AndEngine variables//

    String ballData, backgroundData;
    Ball ball;
    Background background;
    RelativeLayout backgroundImage;
    
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

//    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_gameplay);
//
//        grabChooseBallAndChooseBackgroundData();
//
//        setBallProperties();
//
//        setBackgroundProperties();
//
//        setUpScoreZone();
//
//        setUpDangerZone();
//
//        Log.i("STOP", "STOP");
//
//        //TODO: High score
////        //MODE_PRIVATE allows only your app to access this data
////        SharedPreferences sharedPreferences = this.getSharedPreferences("matthewallenlinsoftware.keepy_uppy", Context.MODE_PRIVATE);
////
////        //Saves data
////        sharedPreferences.edit().putInt("username", "rob").apply();
////
////        //Get the data back
////        String username = sharedPreferences.getString("username", "");
////
////        Log.i("username", username);
//    }

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

    //AndEngine boiler plate code//
    @Override
    protected int getLayoutID() {
        return R.layout.activity_gameplay;
    }

    @Override
    protected int getRenderSurfaceViewID() {
        return R.id.gameView;
    }

    @Override
    public EngineOptions onCreateEngineOptions() {
        this.camera = new Camera(0,0, CAMERA_WIDTH, CAMERA_HEIGHT);
        EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED, new FillResolutionPolicy(), camera);
        engineOptions.getAudioOptions().setNeedsMusic(true).setNeedsSound(true);
        engineOptions.setWakeLockOptions(WakeLockOptions.SCREEN_ON);
        return engineOptions;
    }

    @Override
    public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throws IOException {
        pOnCreateResourcesCallback.onCreateResourcesFinished();
    }

    @Override
    public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws IOException {
        mEngine.registerUpdateHandler(new FPSLogger());
        //Attempt to read from field 'org.andengine.engine.Engine org.andengine.opengl.view.EngineRenderer.mEngine' on a null object reference
        currentScene = new Scene();
        currentScene.setBackground(new org.andengine.entity.scene.background.Background(0.09804f, 0.7274f, 0.8f));
    }

    @Override
    public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws IOException {
        pOnPopulateSceneCallback.onPopulateSceneFinished();
    }
    //End of AndEngine boiler plate code//
}
