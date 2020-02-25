package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.Intent;

public class Activity1 extends AppCompatActivity {
    RadioGroup r;
    static String report1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_one);
        r=findViewById(R.id.radiogroup1);
//        r.setOnCheckedChangeListener(listener);
    }
//    RadioGroup.OnCheckedChangeListener listener = new RadioGroup.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(RadioGroup group, int checkedId) {
//            checked = true;
//        }
//    };

    public void clicked1(View view){
        //save the information from users
        RadioButton temp = findViewById(r.getCheckedRadioButtonId());
        report1 = (temp.getText().toString());

        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
    }
}