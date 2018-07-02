package com.examples.codemonk.gpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button btn_grade, btn_a, btn_aminus, btn_bplus, btn_b, btn_bminus, btn_cplus, btn_c, btn_cminus;
    Button btn_dplus, btn_d, btn_e, btn_f, btn_cls, btn_back;
    EditText grade_results;

    static int num_courses = 0;
    static float total_points = 0;

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
        grade_results = findViewById(R.id.showresults);


        final HashMap<String, Float> grade_scale = new HashMap<>();
        grade_scale.put("A", (float) 4.0);
        grade_scale.put("A-", (float) 3.67);
        grade_scale.put("B+", (float) 3.33);
        grade_scale.put("B", (float) 3.0);
        grade_scale.put("B-", (float) 2.67);
        grade_scale.put("C+", (float) 2.33);
        grade_scale.put("C", (float) 2.0);
        grade_scale.put("C-", (float) 1.67);
        grade_scale.put("D+", (float) 1.33);
        grade_scale.put("D", (float) 1.0);
        grade_scale.put("E", (float) 1.0);
        grade_scale.put("F", (float) 0.0);

        grade_results.setText("");


        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_a.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_aminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_aminus.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_bplus.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_b.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_bminus.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_cplus.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_c.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_cminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_cminus.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_dplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_dplus.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_dplus.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_e.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_courses ++;
                total_points = total_points + grade_scale.get(btn_a.getText());
                grade_results.setText(total_points + "");
            }
        });

        btn_grade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total_points = total_points / num_courses;
                grade_results.setText(total_points + "");
            }
        });

        btn_cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                grade_results.setText("");
                total_points = 0;
                num_courses = 0;
            }
        });
    }

}