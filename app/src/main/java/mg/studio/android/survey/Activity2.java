package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.Intent;

public class Activity2 extends AppCompatActivity {
    RadioGroup r;
//    boolean checked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_one);
        r=findViewById(R.id.radiogroup2);
//        r.setOnCheckedChangeListener(listener);
    }
//    RadioGroup.OnCheckedChangeListener listener = new RadioGroup.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(RadioGroup group, int checkedId) {
//            checked = true;
//        }
//    };

    public void clicked2(View view){
        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);
        MainActivity.allactivities.add(this);
//        if(checked){
//            Intent intent = new Intent(this,Activity3.class);
//            startActivity(intent);
//        }
//        else
//            Toast.makeText(getApplicationContext(),"Please select one item",Toast.LENGTH_LONG).show();
    }
}