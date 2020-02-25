package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5,c6,c7;
    static String report4 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);
        c1=findViewById(R.id.checkbox4_1);
        c2=findViewById(R.id.checkbox4_2);
        c3=findViewById(R.id.checkbox4_3);
        c4=findViewById(R.id.checkbox4_4);
        c5=findViewById(R.id.checkbox4_5);
        c6=findViewById(R.id.checkbox4_6);
        c7=findViewById(R.id.checkbox4_7);
    }
    public void clicked4(View view){
        if(c1.isChecked()||c2.isChecked()||c3.isChecked()||c4.isChecked()||c5.isChecked()||c6.isChecked()||c7.isChecked()) {
            if(c1.isChecked())
                report4 = report4 + (c1.getText().toString()) + " ";
            if(c2.isChecked())
                report4 = report4 + (c2.getText().toString()) + " ";
            if(c3.isChecked())
                report4 = report4 + (c3.getText().toString()) + " ";
            if(c4.isChecked())
                report4 = report4 + (c4.getText().toString()) + " ";
            if(c5.isChecked())
                report4 = report4 + (c5.getText().toString()) + " ";
            if(c6.isChecked())
                report4 = report4 + (c6.getText().toString()) + " ";
            if(c7.isChecked())
                report4 = report4 + (c7.getText().toString()) + " ";
            Intent intent = new Intent(this, Activity5.class);
            startActivity(intent);
            MainActivity.allactivities.add(this);
        }
        else
            Toast.makeText(getApplicationContext(),"Please select at least one item",Toast.LENGTH_LONG).show();
    }
}

