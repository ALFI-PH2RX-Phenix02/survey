package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);
    }
    public void clicked3(View view){
        Intent intent = new Intent(this,Activity4.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

