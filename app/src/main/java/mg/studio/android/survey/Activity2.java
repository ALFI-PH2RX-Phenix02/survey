package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity2 extends AppCompatActivity {
    RadioGroup r;
    static String report2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);
        r=findViewById(R.id.radiogroup2);
    }
    public void clicked2(View view){
        //save the information from users
        RadioButton temp = findViewById(r.getCheckedRadioButtonId());
        report2 = (temp.getText().toString());

        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

