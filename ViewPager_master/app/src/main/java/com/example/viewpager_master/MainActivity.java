package com.example.viewpager_master;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText no,password;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

        no = (EditText) findViewById(R.id.no);
        password = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);

        Click();
    }

    public void Click(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (no.getText().toString().equals("root") && password.getText().toString().equals("123456")){
                    Toast.makeText(getApplicationContext(), "登录成功",
                            Toast.LENGTH_SHORT).show();
//                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
//                    startActivity(i);
                }else {
                    Toast.makeText(getApplicationContext(), "失败",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
