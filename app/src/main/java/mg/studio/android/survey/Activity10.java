package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Activity10 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_nine);
    }
    public void clicked10(View view){
        Intent intent = new Intent(this,Activity11.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

