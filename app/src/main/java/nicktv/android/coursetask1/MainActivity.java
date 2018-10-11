package nicktv.android.coursetask1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "MainActivity: onCreate()");

        CharSequence text = "5 минут уже прошло";
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "MainActivity: onPause()");
        super.onPause();
    }


    @Override
    protected void onStop() {
        Log.d(TAG, "MainActivity: onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "MainActivity: onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        Log.d(TAG, "MainActivity: onBackPressed()");
        super.onBackPressed();
    }
}
