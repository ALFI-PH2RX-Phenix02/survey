package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Activity13 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_twelve);
    }
    public void clicked13(View view){
        Intent intent = new Intent(this,Activity14.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

