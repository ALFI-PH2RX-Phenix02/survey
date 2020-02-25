package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CheckBox c;
    public static List<Activity> allactivities = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        c=findViewById(R.id.checkbox0);
    }

    public void clicked0(View view){
        if(c.isChecked()){
            Intent intent = new Intent(this, Activity1.class);
            startActivity(intent);
            allactivities.add(this);
        }
        else{
            //Toast ts = Toast.makeText(getBaseContext(),"please accept the requests",Toast.LENGTH_LONG);
            //ts.show();
            Toast.makeText(getApplicationContext(),"Please accept the requests",Toast.LENGTH_LONG).show();
        }
    }
}