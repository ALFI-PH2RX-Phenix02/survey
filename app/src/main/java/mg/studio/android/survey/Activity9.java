package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity9 extends AppCompatActivity {
    RadioGroup r;
    static String report9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_nine);
        r=findViewById(R.id.radiogroup9);
    }
    public void clicked9(View view){
        RadioButton temp = findViewById(r.getCheckedRadioButtonId());
        report9 = (temp.getText().toString());
        Intent intent = new Intent(this, Activity10.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

