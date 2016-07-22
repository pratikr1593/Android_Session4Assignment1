package com.example.pratikratnaparkhi.session4assign1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button ascend, descend;
    private ListView cal_list;
    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ascend=(Button)findViewById(R.id.asc);
        descend=(Button)findViewById(R.id.desc);
        cal_list=(ListView)findViewById(R.id.listview1);
        final String[] months=new String[]{"January", "February","March","April","May","June","July","August","September","October","November","December"};

        final ArrayAdapter<String> adaptor=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,months);
        cal_list.setAdapter(adaptor);

        ascend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arrays.sort(months);
                adaptor.notifyDataSetChanged();
            }
        });

        descend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Arrays.sort(months);
                Arrays.sort(months, Collections.reverseOrder());
                adaptor.notifyDataSetChanged();
            }
        });
    }
}