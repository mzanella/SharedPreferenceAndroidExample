package com.example.zanna.sharedpreferenceandroidexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Setting s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = new SettingImp(this);

        TextView tv = (TextView)this.findViewById(R.id.hello);

        assert tv != null : s.getSharedPreference() != null;
        //s.setPathPreference(PathPreference.NO_PREFERENCE);
        PathPreference pp = s.getPathPreference();
        int z = s.getSharedPreference().getInt("PathPreference", 0);
        tv.setText("preference:" + pp + " " + z);
        if (pp.equals(PathPreference.valueOf(z))){
            tv.append("\nfunziona");
        } else {
            tv.append("\nnon funziona");
        }
    }

    @Override
    public void onPause(){
        super.onPause();
        s.setPathPreference(PathPreference.ELEVATOR_PREFERENCE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
