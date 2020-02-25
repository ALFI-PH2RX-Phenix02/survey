package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity7 extends AppCompatActivity {
    RadioGroup r;
    static String report7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_seven);
        r=findViewById(R.id.radiogroup7);
    }
    public void clicked7(View view){
        RadioButton temp = findViewById(r.getCheckedRadioButtonId());
        report7 = (temp.getText().toString());
        Intent intent = new Intent(this, Activity8.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

