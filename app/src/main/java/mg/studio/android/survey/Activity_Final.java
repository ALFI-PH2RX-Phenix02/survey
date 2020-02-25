package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_Final extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_survey);
    }
    public void clicked13(View view){
        MainActivity.allactivities.add(this);
        Intent intent = new Intent(this,Report.class);
        startActivity(intent);
    }
}