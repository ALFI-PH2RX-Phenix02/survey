package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity3 extends AppCompatActivity {
    RadioGroup r;
    static String report3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_three);
        r=findViewById(R.id.radiogroup3);
    }
    public void clicked3(View view){
        //save the information from users
        RadioButton temp = findViewById(r.getCheckedRadioButtonId());
        report3 = (temp.getText().toString());

        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}

