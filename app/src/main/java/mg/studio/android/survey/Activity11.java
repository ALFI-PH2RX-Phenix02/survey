package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity11 extends AppCompatActivity {
    RadioGroup r;
    static String report11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eleven);
        r=findViewById(R.id.radiogroup11);
    }
    public void clicked11(View view){
        RadioButton temp = findViewById(r.getCheckedRadioButtonId());
        report11 = (temp.getText().toString());
        Intent intent = new Intent(this, Activity12.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

