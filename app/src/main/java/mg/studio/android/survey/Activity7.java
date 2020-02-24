package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Activity7 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_six);
    }
    public void clicked7(View view){
        Intent intent = new Intent(this,Activity8.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

