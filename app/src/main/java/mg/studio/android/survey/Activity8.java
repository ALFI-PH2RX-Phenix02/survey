package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity8 extends AppCompatActivity {
    RadioGroup r;
    static String report8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);
        r=findViewById(R.id.radiogroup8);
    }
    public void clicked8(View view){
        RadioButton temp = findViewById(r.getCheckedRadioButtonId());
        report8 = (temp.getText().toString());
        Intent intent = new Intent(this, Activity9.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

