package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Activity14 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_survey);
        MainActivity.allactivities.add(this);
    }
    public void clicked14(View view){
        for(Activity a:MainActivity.allactivities){
            a.finish();
        }
    }
}