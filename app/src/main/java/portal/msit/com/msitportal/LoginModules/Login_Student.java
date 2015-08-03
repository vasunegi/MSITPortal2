package portal.msit.com.msitportal.LoginModules;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import portal.msit.com.msitportal.StudentDrawer.FavoriteActivity;
import portal.msit.com.msitportal.Drawer.GuestDrawerActivity;
import portal.msit.com.msitportal.R;


public class Login_Student extends GuestDrawerActivity {

    Button login, register;
    EditText user, pass;
    //   Boolean val = true;

  //  UserSessionManager_Student session;
    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*if (getSharedPreferences("msitportal", MODE_PRIVATE).getBoolean("login_status", false)) {
            startActivity(new Intent(getApplicationContext(), FavoriteActivity.class));
            finish();
        }*/

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__student);

    //    session = new UserSessionManager_Student(getApplicationContext());

        login = (Button) findViewById(R.id.login_student);
        user = (EditText) findViewById(R.id.user_student);
        pass = (EditText) findViewById(R.id.pass_student);

     /*   Toast.makeText(getApplicationContext(),
                "User Login Status: " + session.isUserLoggedIn(),
                Toast.LENGTH_LONG).show();*/

        register = (Button) findViewById(R.id.register_student);
        tx1 = (TextView) findViewById(R.id.attempts_value_student);
        tx1.setVisibility(View.GONE);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*val = true;
                if (user.getText().toString().isEmpty()) {
                    val = false;
                    user.setHintTextColor(Color.RED);
                }
                if (pass.getText().toString().isEmpty()) {
                    val = false;
                    pass.setHintTextColor(Color.RED);
                }
                if (val) {
                    *//*SharedPreferences.Editor edit = getSharedPreferences("msitportal", MODE_PRIVATE).edit();
                    edit.putBoolean("login_status", true);
                    edit.apply();
                    *//*
                    Intent intent = new Intent(getApplicationContext(), ListViewDraggingAnimation.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        login.setEnabled(false);
                    }
                }
*/
               /* String username = user.getText().toString();
                String password = pass.getText().toString();
*/
                /*if (username.trim().length() > 0 && password.trim().length() > 0) {
*/
                    if (user.getText().toString().equals("admin") && pass.getText().toString().equals("admin")) {
                        Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                        Intent login_student = new Intent(getApplicationContext(), FavoriteActivity.class);
                        /*login_student.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                        // Add new Flag to start new Activity
                        login_student.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);*/
                        startActivity(login_student);

                        finish();
                    }

                   /* else{

                        // username / password doesn't match&
                        Toast.makeText(getApplicationContext(),
                                "Username/Password is incorrect",
                                Toast.LENGTH_LONG).show();

                    }
                }*/

                else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        login.setEnabled(false);
                    }
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register_student = new Intent(getApplicationContext(), Register_Student.class);
                startActivity(register_student);
                finish();
            }
        });
    }


}
