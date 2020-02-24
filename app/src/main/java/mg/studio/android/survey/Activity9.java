package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Activity9 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);
    }
    public void clicked9(View view){
        Intent intent = new Intent(this,Activity10.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

