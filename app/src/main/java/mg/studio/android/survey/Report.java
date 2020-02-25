package mg.studio.android.survey;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Report extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);
        MainActivity.allactivities.add(this);
        t1=findViewById(R.id.t14_q1);
        t2=findViewById(R.id.t14_q2);
        t3=findViewById(R.id.t14_q3);
        t4=findViewById(R.id.t14_q4);
        t5=findViewById(R.id.t14_q5);
        t6=findViewById(R.id.t14_q6);
        t7=findViewById(R.id.t14_q7);
        t8=findViewById(R.id.t14_q8);
        t9=findViewById(R.id.t14_q9);
        t10=findViewById(R.id.t14_q10);
        t11=findViewById(R.id.t14_q11);
        t12=findViewById(R.id.t14_q12);

        t1.setText(Activity1.report1);
        t2.setText(Activity2.report2);
        t3.setText(Activity3.report3);
        t4.setText(Activity4.report4);
        t5.setText(Activity5.report5);
        t6.setText(Activity6.report6);
        t7.setText(Activity7.report7);
        t8.setText(Activity8.report8);
        t9.setText(Activity9.report9);
        t10.setText(Activity10.report10);
        t11.setText(Activity11.report11);
        t12.setText(Activity12.report12);
    }
    public void clicked14(View view){
        for(Activity a:MainActivity.allactivities){
            a.finish();
        }
    }
}