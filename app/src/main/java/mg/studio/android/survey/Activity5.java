package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5,c6,c7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);
        c1=findViewById(R.id.checkbox5_1);
        c2=findViewById(R.id.checkbox5_2);
        c3=findViewById(R.id.checkbox5_3);
        c4=findViewById(R.id.checkbox5_4);
        c5=findViewById(R.id.checkbox5_5);
        c6=findViewById(R.id.checkbox5_6);
        c7=findViewById(R.id.checkbox5_7);
    }
    public void clicked5(View view){
        if(c1.isChecked()||c2.isChecked()||c3.isChecked()||c4.isChecked()||c5.isChecked()||c6.isChecked()||c7.isChecked()) {
            Intent intent = new Intent(this, Activity6.class);
            startActivity(intent);
            MainActivity.allactivities.add(this);
        }
        else
            Toast.makeText(getApplicationContext(),"Please select at least one item",Toast.LENGTH_LONG).show();
    }
}

