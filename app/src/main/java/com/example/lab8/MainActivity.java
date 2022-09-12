package com.example.lab8;

import android.os.Bundle;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFragment(v);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFragment(v);
            }
        });
    }

    // method for displaying the appropriate
    // fragment according to the clicked button
    public void selectFragment(View view) {


        // creating object for Fragment
        Fragment fr=null;

        // displaying first fragment
        // if button1 is clicked
        if(view == findViewById(R.id.button1)) {
            fr = new FragmentOne();
        }

        // displaying second fragment
        // if button2 is clicked
        else if(view == findViewById(R.id.button2)) {
            fr = new FragmentTwo();
        }
        else if(view == findViewById(R.id.button3)) {
            fr = new FragmentOne();
        }
        else if(view == findViewById(R.id.button4)) {
            fr = new FragmentOne();
        }
        else if(view == findViewById(R.id.button5)) {
            fr = new FragmentOne();
        }

        FragmentManager fm = getFragmentManager();

        // fragment transaction to add or replace
        // fragments while activity is running
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_section, fr);

        // making a commit after the transaction
        // to assure that the change is effective
        fragmentTransaction.commit();
    }
}
