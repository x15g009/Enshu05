package jp.ac.chiba_fjb.x15g009.enshu5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    LinearLayout output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (LinearLayout) findViewById(R.id.output);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            output.removeAllViews();
            LinearLayout layout;
            layout = (LinearLayout)getLayoutInflater().inflate(R.layout.layout1, null);
            output.addView(layout);
        }else if(v.getId() == R.id.button2){
            output.removeAllViews();
            LinearLayout layout;
            layout = (LinearLayout)getLayoutInflater().inflate(R.layout.layout2, null);
            output.addView(layout);
        }else if(v.getId() == R.id.button3){
            output.removeAllViews();
            LinearLayout layout;
            layout = (LinearLayout)getLayoutInflater().inflate(R.layout.layout3, null);
            output.addView(layout);
        }else if(v.getId() == R.id.button4){
            output.removeAllViews();
            LinearLayout layout;
            layout = (LinearLayout)getLayoutInflater().inflate(R.layout.layout4, null);
            output.addView(layout);
        }

    }
}
