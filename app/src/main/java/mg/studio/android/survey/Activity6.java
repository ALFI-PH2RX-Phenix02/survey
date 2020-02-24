package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity6 extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5,c6,c7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);
        c1=findViewById(R.id.checkbox6_1);
        c2=findViewById(R.id.checkbox6_2);
        c3=findViewById(R.id.checkbox6_3);
        c4=findViewById(R.id.checkbox6_4);
        c5=findViewById(R.id.checkbox6_5);
        c6=findViewById(R.id.checkbox6_6);
        c7=findViewById(R.id.checkbox6_7);
    }
    public void clicked6(View view){
        if(c1.isChecked()||c2.isChecked()||c3.isChecked()||c4.isChecked()||c5.isChecked()||c6.isChecked()||c7.isChecked()) {
            Intent intent = new Intent(this, Activity7.class);
            startActivity(intent);
            MainActivity.allactivities.add(this);
        }
        else
            Toast.makeText(getApplicationContext(),"Please select at least one item",Toast.LENGTH_LONG).show();
    }
}

