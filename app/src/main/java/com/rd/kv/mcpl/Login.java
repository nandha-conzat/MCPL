package com.rd.kv.mcpl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by COBURG DESIGN on 27-01-2016.
 */
public class Login extends AppCompatActivity{
    EditText user,pass;
    Button login;
    String user1,pass1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.et_user);
        pass = (EditText) findViewById(R.id.et_pass);
        login = (Button)  findViewById(R.id.btn_submit);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user1 = user.getText().toString().trim();
                pass1 = pass.getText().toString().trim();
                if(user1.contentEquals("test") & pass1.contentEquals("test") )
                {
                    Intent i = new Intent(getApplicationContext(),
                            MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
