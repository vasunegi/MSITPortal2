package portal.msit.com.msitportal.LoginModules;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import portal.msit.com.msitportal.Drawer.GuestDrawerActivity;
import portal.msit.com.msitportal.R;
import portal.msit.com.msitportal.StudentDrawer.FavoriteActivity;


public class Register_Student extends GuestDrawerActivity {
    Boolean validate = true;
    EditText name,username,number,email,enroll,pass,repass;
    TextView deptt,deptt_display;
    Button register,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__student);

        EditText name = (EditText)findViewById(R.id.name_student);
        EditText username = (EditText)findViewById(R.id.user_student);
        EditText number = (EditText)findViewById(R.id.phone_student);
        TextView deptt =(TextView)findViewById(R.id.deptt_student);
        TextView deptt_display =(TextView)findViewById(R.id.depttdisplay_student);
        EditText email = (EditText)findViewById(R.id.email_student);
        EditText enroll = (EditText)findViewById(R.id.enroll);
        EditText pass = (EditText)findViewById(R.id.pass_student);
        EditText repass = (EditText)findViewById(R.id.re_pass_student);
        Button register = (Button)findViewById(R.id.register_student);
        Button login = (Button)findViewById(R.id.login_student);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate()) {
                    SharedPreferences.Editor edit = getSharedPreferences("msitportal", MODE_PRIVATE).edit();
                    edit.putBoolean("login_status", true);
                    edit.apply();
                    startActivity(new Intent(getApplicationContext(), FavoriteActivity.class));
                    finish();
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),Login_Student.class));
                finish();
            }
        });
    }

    private Boolean validate() {
        validate = true;
        if (name.getText().toString().isEmpty()) {
            validate = false;
            name.setHintTextColor(Color.RED);
            name.setBackgroundColor(Color.red(80));
            Toast.makeText(getApplicationContext(),
                    ("Fields are missing"), Toast.LENGTH_SHORT).show();
        }
        if (username.getText().toString().isEmpty()) {
            validate = false;
            username.setHintTextColor(Color.RED);
            username.setBackgroundColor(Color.red(80));
            Toast.makeText(getApplicationContext(),
                    ("Fields are missing"), Toast.LENGTH_SHORT).show();
        }
        if (number.getText().toString().isEmpty()) {
            validate = false;
            number.setHintTextColor(Color.RED);
            number.setBackgroundColor(Color.red(80));
            Toast.makeText(getApplicationContext(),
                    ("Fields are missing"), Toast.LENGTH_SHORT).show();
        }
        if (email.getText().toString().isEmpty()) {
            validate = false;
            email.setHintTextColor(Color.RED);
            email.setBackgroundColor(Color.red(80));
            Toast.makeText(getApplicationContext(),
                    ("Fields are missing"), Toast.LENGTH_SHORT).show();
        }
        if (enroll.getText().toString().isEmpty()) {
            validate = false;
            enroll.setHintTextColor(Color.RED);
            enroll.setBackgroundColor(Color.red(80));
            Toast.makeText(getApplicationContext(),
                    ("Fields are missing"), Toast.LENGTH_SHORT).show();
        }
        if (pass.getText().toString().isEmpty()) {
            validate = false;
            pass.setHintTextColor(Color.RED);
            pass.setBackgroundColor(Color.red(80));
            Toast.makeText(getApplicationContext(),
                    ("Fields are missing"), Toast.LENGTH_SHORT).show();
        }
        if (repass.getText().toString().isEmpty()) {
            validate = false;
            repass.setHintTextColor(Color.RED);
            repass.setBackgroundColor(Color.red(80));
            Toast.makeText(getApplicationContext(),
                    ("Fields are missing"), Toast.LENGTH_SHORT).show();
        }

        return validate;
    }
}
