package joshua.castillo.com.castillojoshualab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);Log.d("4ITB", "onCreate() has started.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITB","onStart() has been enabled.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITB","onResume() has been enabled.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITB","onPause() has been enabled.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITB","onStop() has been enabled.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITB","onDestroy() has been enabled.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITB","onRestart() has been enabled.");
    }

    public void show (View v){
        Toast.makeText(this,"Going back", Toast.LENGTH_SHORT).show();
    }


    public void display(View v){
        Snackbar.make(v,"Snackbar:Next",Snackbar.LENGTH_LONG).show();
    }
}
