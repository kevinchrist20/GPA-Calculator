package com.examples.codemonk.gpacalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button btn_grade, btn_a, btn_aminus, btn_bplus, btn_b, btn_bminus, btn_cplus, btn_c, btn_cminus;
    Button btn_dplus, btn_d, btn_e, btn_f, btn_cls, btn_back;
    EditText grade_cal;
    TextView grade_results;

    static int num_courses = 0;
    static float total_points = 0;
    static float results = 0;
    static float grade;
    final static String log = "My message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_a = findViewById(R.id.a);
        btn_aminus = findViewById(R.id.a_minus);
        btn_bplus = findViewById(R.id.b_plus);
        btn_b = findViewById(R.id.b);
        btn_bminus = findViewById(R.id.b_minus);
        btn_cplus = findViewById(R.id.c_plus);
        btn_c = findViewById(R.id.c);
        btn_cminus = findViewById(R.id.c_minus);
        btn_d = findViewById(R.id.d);
        btn_dplus = findViewById(R.id.d_plus);
        btn_e = findViewById(R.id.e);
        btn_f = findViewById(R.id.fail);
        btn_grade = findViewById(R.id.calculate);
        btn_cls = findViewById(R.id.clear);
        btn_back = findViewById(R.id.backspace);
        grade_cal = findViewById(R.id.showcal);
        grade_results = findViewById(R.id.results);


        final HashMap<String, Float> grade_scale = new HashMap<>();
        grade_scale.put("A", (float) 4.00);
        grade_scale.put("A-", (float) 3.67);
        grade_scale.put("B+", (float) 3.33);
        grade_scale.put("B", (float) 3.00);
        grade_scale.put("B-", (float) 2.67);
        grade_scale.put("C+", (float) 2.33);
        grade_scale.put("C", (float) 2.00);
        grade_scale.put("C-", (float) 1.67);
        grade_scale.put("D+", (float) 1.33);
        grade_scale.put("D", (float) 1.00);
        grade_scale.put("E", (float) 1.00);
        grade_scale.put("F", (float) 0.00);

        grade_cal.setText("");


        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_a.getText());

                if(grade_cal.getText().length() == 0) {
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.format("%.2f", grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.format("%.2f", grade));
                }
            }
        });

        btn_aminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_aminus.getText());

                if(grade_cal.getText().length() == 0) {
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.valueOf(grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.valueOf(grade));
                }
            }
        });

        btn_bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_bplus.getText());

                if (grade_cal.getText().length() == 0) {
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.valueOf(grade));
                }else {
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.valueOf(grade));
                }
            }
        });

        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_b.getText());

                if (grade_cal.getText().length() == 0) {
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.format("%.2f", grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.format("%.2f", grade));
                }
            }
        });

        btn_bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_bminus.getText());

                if (grade_cal.getText().length() == 0){
                    num_courses ++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.valueOf(grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.valueOf(grade));
                }

            }
        });

        btn_cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_cplus.getText());

                if (grade_cal.getText().length() == 0){
                    num_courses ++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.valueOf(grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.valueOf(grade));
                }
            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_c.getText());

                if (grade_cal.getText().length() == 0){
                    num_courses ++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.format("%.2f", grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.format("%.2f", grade));
                }
            }
        });

        btn_cminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_cminus.getText());

                if (grade_cal.getText().length() == 0){
                    num_courses ++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.valueOf(grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.valueOf(grade));
                }
            }
        });

        btn_dplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_dplus.getText());

                if (grade_cal.getText().length() == 0){
                    num_courses ++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.valueOf(grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.valueOf(grade));
                }
            }
        });

        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_d.getText());

                if (grade_cal.getText().length() == 0){
                    num_courses ++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.format("%.2f", grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.format("%.2f", grade));
                }
            }
        });

        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_e.getText());

                if (grade_cal.getText().length() == 0){
                    num_courses ++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.format("%.2f", grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.format("%.2f", grade));
                }            }
        });

        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade = grade_scale.get(btn_f.getText());

                if (grade_cal.getText().length() == 0){
                    num_courses ++;
                    total_points = total_points + grade;
                    grade_cal.setText(String.format("%.2f", grade));
                }else{
                    num_courses++;
                    total_points = total_points + grade;
                    grade_cal.append( "+" + String.format("%.2f", grade));
                }
            }
        });

        // Some errors with the grade results del
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) throws IndexOutOfBoundsException {

                if (grade_results.getText().length() > 0)
                    grade_results.setText(null);


                else if(grade_cal.getText().length() == 4){
                    CharSequence num = grade_cal.getText().toString();
                    grade_cal.setText(num.subSequence(0, num.length() - 4));
                    total_points -= grade;
                    num_courses --;
                    //Get grade and subtract from total_points and reduce num of courses.

                }

                else if(grade_cal.getText().length() > 0){
                    CharSequence num = grade_cal.getText().toString();
                    grade_cal.setText(num.subSequence(0, num.length() - 5));
                    total_points -= grade;
                    num_courses --;
                }
            }
        });



        btn_grade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (grade_cal.getText().length() > 0) {
                    results = total_points / num_courses;
                    grade_results.setText( "= " + String.valueOf(results));
                }
            }
        });

        btn_cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                grade_cal.setText(null);
                grade_results.setText(null);
                total_points = 0;
                num_courses = 0;
            }
        });
    }

}
