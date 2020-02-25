package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity10 extends AppCompatActivity {
    RadioGroup r;
    static String report10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_ten);
        r=findViewById(R.id.radiogroup10);
    }
    public void clicked10(View view){
        RadioButton temp = findViewById(r.getCheckedRadioButtonId());
        report10 = (temp.getText().toString());
        Intent intent = new Intent(this, Activity11.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

