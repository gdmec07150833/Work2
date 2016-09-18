package cn.edu.s07150833gdmec.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        @Override
        protected void onStart() {
            super.onStart();
            Log.d("Work1","启动了");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d("Work1","吓，不行？");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d("Work1","看到了");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d("Work1","又看到啦，开不开心");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d("Work1","没看错啦，就是看到啦");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d("Work1","你看到就很不妙了");
        }

}
