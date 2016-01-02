package matthewallenlinsoftware.keepy_uppy;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class gameplay extends ActionBarActivity {

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

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
