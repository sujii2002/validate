package com.example.validate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Object String1;
    private Object String2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button v = findViewById(R.id.button);
        EditText user = findViewById(R.id.user);
        EditText pw = findViewById(R.id.id1);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String1 = user.getText();
                String name = String1.toString();
                String2 = user.getText();
                String id1 = String2.toString();

                if(name.matches("[a-zA-z]+") && id1.matches("[0-9]+")&& name.length()!=0 && id1.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Validated Successfully", Toast.LENGTH_LONG).show();
                }
                else if(!name.matches("[a-zA-z]+"))
                {
                    Toast.makeText(getApplicationContext(),"Username should consist of only alphabets", Toast.LENGTH_LONG).show();
                }
                else if(name.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"username should not be empty", Toast.LENGTH_LONG).show();
                }
                else if(id1.length()!=4)
                {
                    Toast.makeText(getApplicationContext(),"id should be a 4 digit number", Toast.LENGTH_LONG).show();
                }

                else if(!id1.matches("[0-9]+"))
                {
                    Toast.makeText(getApplicationContext(),"id should consist of only digits", Toast.LENGTH_LONG).show();
                }


            }
        });

    }
}