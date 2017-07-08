package la.iok.northwestfeelings.daedal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import la.iok.northwestfeelings.daedal.R;
import la.iok.northwestfeelings.daedal.RegisterAndLoginActivity;
import la.iok.northwestfeelings.daedal.activity.videochat.VideoChatViewActivity;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public void toVideoCall(View view){
        Intent intent=new Intent(MainActivity.this,VideoChatViewActivity.class);
        startActivity(intent);
    }

    public void toMessage(View view){
        Intent intent=new Intent(MainActivity.this,RegisterAndLoginActivity.class);
        startActivity(intent);
    }
    public void toVoicePractice(View view){
        Intent intent=new Intent(MainActivity.this,RegisterAndLoginActivity.class);
        startActivity(intent);
    }
}
