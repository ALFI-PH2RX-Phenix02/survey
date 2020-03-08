package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CheckBox c;

    public static List<Activity> allactivities = new ArrayList<>();
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        c=findViewById(R.id.checkbox0);
    }



    public void clicked0(View view){
        if(c.isChecked()){
//            Intent intent = new Intent(this, Activity1.class);
            Intent intent = new Intent(this, _Activity_dynamic.class);
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



