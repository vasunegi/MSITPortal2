package portal.msit.com.msitportal.LoginModules;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import portal.msit.com.msitportal.Drawer.GuestDrawerActivity;
import portal.msit.com.msitportal.R;


public class Register_Staff extends GuestDrawerActivity {
    Boolean validate = true;
    EditText name,username,number,email,enroll,pass,repass;
    TextView deptt,deptt_display;
    Button register,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__staff);

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


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register__staff, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
