package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Activity11 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_ten);
    }
    public void clicked11(View view){
        Intent intent = new Intent(this,Activity12.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

