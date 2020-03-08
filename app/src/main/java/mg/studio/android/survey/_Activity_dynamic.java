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
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//Load JSON files, build the layout and output results
public class _Activity_dynamic extends AppCompatActivity {
    String str_json;
    static int question_index = 0;
    RelativeLayout rootlayout;
    TextView text_title,text_question;
    Button btn;
    RadioGroup rg;
    JSONArray arr_questions, arr_options;
    JSONObject obj,obj_survey, obj_single_question, obj_single_option;
    String str_type, str_question,str_single;
    String str_json_output = "{'questions':[{";
    File jsondata_internal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._question_dynamic);
        MainActivity.allactivities.add(this);
        jsondata_internal = new File(_Activity_dynamic.this.getFilesDir(),"results.json");
        init();
    }

    @SuppressLint("ResourceType")
    //Load the JSON file and generate the layout
    void init(){

        rootlayout = new RelativeLayout(this);
        rootlayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT));
        rootlayout.setId(0);

        try{
            //Load the JSON file
            str_json=getJson("test.json",this);
            obj = new JSONObject(str_json);
            obj_survey = obj.getJSONObject("survey");
            arr_questions = obj_survey.getJSONArray("questions");
            obj_single_question = arr_questions.getJSONObject(question_index);
            str_type = obj_single_question.getString("type");
            str_question = obj_single_question.getString("question");
            arr_options = obj_single_question.getJSONArray("options");

            //Set title
            if(question_index< arr_questions.length()){
                text_title = new TextView(this);
                RelativeLayout.LayoutParams text_title_Params = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                text_title_Params.setMargins(dip2px(30), 0, dip2px(30), 0);//left top right bottom
                text_title.setLayoutParams(text_title_Params);
                text_title.setText("Question "+String.valueOf(question_index+1));
                text_title.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
                text_title.setTextColor(Color.BLACK);
                text_title.setId(1);

                //set Questions
                text_question = new TextView(this);
                RelativeLayout.LayoutParams text_question_Params = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                text_question_Params.addRule(RelativeLayout.BELOW, text_title.getId());
                text_question_Params.setMargins(dip2px(30), dip2px(30), dip2px(30), 0);
                text_question.setLayoutParams(text_question_Params);
                text_question.setText(str_question);
                text_question.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                text_question.setId(2);

                //Set Options
                if(str_type.equals("single")){
                    rg = new RadioGroup(this);
                    RelativeLayout.LayoutParams rg_Params = new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
                    rg_Params.addRule(RelativeLayout.BELOW, text_question.getId());
                    rg.setId(3);

                    for(int j = 0; j< arr_options.length(); j++){
                        obj_single_option = arr_options.getJSONObject(j);
                        str_single = obj_single_option.getString(String.valueOf(j+1));
                        RadioButton btn = new RadioButton(this);
                        RelativeLayout.LayoutParams btn_Params = new RelativeLayout.LayoutParams(
                                RelativeLayout.LayoutParams.WRAP_CONTENT,
                                RelativeLayout.LayoutParams.WRAP_CONTENT);
                        btn_Params.setMargins(dip2px(50), 0, dip2px(50), 0);
                        btn.setText(str_single);
                        btn.setId(j+4);
                        rg.addView(btn,btn_Params);
                    }
                    rootlayout.addView(rg, rg_Params);
                }

                //set Button
                btn = new Button(this);
                RelativeLayout.LayoutParams btn_Params = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
                btn_Params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                btn_Params.setMargins(dip2px(30), 0, dip2px(30), dip2px(10));
                btn.setLayoutParams(btn_Params);
                if(question_index<arr_questions.length()-1)
                    btn.setText("NEXT");
                else
                    btn.setText("SAVE AND FINISH");
                btn.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                btn.setBackgroundColor(0xFF008577);
                btn.setId(99);
                btn.setOnClickListener(listener);

                rootlayout.addView(text_title, text_title_Params);
                rootlayout.addView(text_question, text_question_Params);
                rootlayout.addView(btn, btn_Params);
                setContentView(rootlayout);
            }
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }


    //Load the data from JSON file and transfer it to String
    public static String getJson(String fileName, Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            AssetManager assetManager = context.getAssets();
            BufferedReader bf = new BufferedReader(new InputStreamReader(assetManager.open(fileName)));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    //Transfer dp to px
    public int dip2px(float dpValue) {
        final float scale = this.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    //Save results, clean the layout and rebuild it
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //Save result into String
            RadioButton temp = findViewById(rg.getCheckedRadioButtonId());
            String str_answer = (temp.getText().toString());
            str_json_output = str_json_output +
                    "'question':'" +
                    str_question +
                    "','answer':'" +
                    str_answer;

            //Have not reached the last question
            if(question_index<arr_questions.length()-1){
                str_json_output = str_json_output + "'},{";
                rootlayout.removeAllViews();
                question_index++;
                init();
            }
            else{
                //Output the results to JSON file
                str_json_output = str_json_output + "'}]}\n";
                FileOutputStream fout_internal = null;
                try {
                    fout_internal = new FileOutputStream(jsondata_internal,true);
                    fout_internal.write(str_json_output.getBytes());
                    fout_internal.flush();
                    fout_internal.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                for(Activity a:MainActivity.allactivities){
                    a.finish();
                }
            }
        }
    };
}
