package mg.studio.android.survey;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;



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
        //Get date
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String str_time = simpleDateFormat.format(date);

        //Path check
//        String internal_path = Report.this.getFilesDir().getAbsolutePath();
//        String external_path = Report.this.getExternalFilesDir(null).getAbsolutePath();
//        Toast.makeText(getApplicationContext(), internal_path,Toast.LENGTH_LONG).show();

        File jsondata_internal = new File(Report.this.getFilesDir(),str_time+".json");
        File jsondata = new File(Report.this.getExternalFilesDir("survey_report"),str_time+".json");

        if (!jsondata.exists()) {
            try {
                jsondata.createNewFile();
                Log.e("","已在外部存储创建json文件");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!jsondata_internal.exists()) {
            try {
                jsondata_internal.createNewFile();
                Log.e("","已在内部存储创建json文件");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        String msg = "{If you are going to buy a new phone, the brand you will choose:'"
                +Activity1.report1+
                "',\nYour phone costs:'"
                +Activity2.report2+
                "',\nThe kind of phone you're using:'"
                +Activity3.report3+
                "',\nThe functions your phone has:'"
                +Activity4.report4+
                "',\nThe functions most used:'"
                +Activity5.report5+
                "',\nThe functions you expect to have in the future:'"
                +Activity6.report6+
                "',\nThe condition you'll buy a phone:'"
                +Activity7.report7+
                "',\nIf you are going to buy a new phone, the brand you will choose:'"
                +Activity8.report8+
                "',\nThe most important characteristic for you:'"
                +Activity9.report9+
                "',\nYour age:'"
                +Activity10.report10+
                "',\nYour gender:'"
                +Activity11.report11+
                "',\nThe money you earn per month:'"
                +Activity12.report12+
                "'\n}";
        try {
            FileOutputStream fout = new FileOutputStream(jsondata);
            fout.write(msg.getBytes());
            fout.flush();
            fout.close();

            FileOutputStream fout_internal = new FileOutputStream(jsondata_internal);
            fout_internal.write(msg.getBytes());
            fout_internal.flush();
            fout_internal.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        for(Activity a:MainActivity.allactivities){
            a.finish();
        }
    }
}