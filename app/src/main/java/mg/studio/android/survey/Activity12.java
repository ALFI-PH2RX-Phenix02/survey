package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity12 extends AppCompatActivity {
    RadioGroup r;
    static String report12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_twelve);
        r=findViewById(R.id.radiogroup12);
    }
    public void clicked12(View view){
        RadioButton temp = findViewById(r.getCheckedRadioButtonId());
        report12 = (temp.getText().toString());
        Intent intent = new Intent(this, Activity_Final.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

