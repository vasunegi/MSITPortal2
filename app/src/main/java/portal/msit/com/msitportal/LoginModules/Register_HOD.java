package portal.msit.com.msitportal.LoginModules;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import portal.msit.com.msitportal.Drawer.GuestDrawerActivity;
import portal.msit.com.msitportal.R;


public class Register_HOD extends GuestDrawerActivity {
    Boolean validate = true;
    EditText name,username,number,email,enroll,pass,repass;
    TextView deptt,deptt_display;
    Button register,login;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__hod);

        EditText name = (EditText)findViewById(R.id.name_hod);
        EditText username = (EditText)findViewById(R.id.user_hod);
        EditText number = (EditText)findViewById(R.id.phone_hod);
        TextView deptt =(TextView)findViewById(R.id.deptt_hod);
        TextView deptt_display =(TextView)findViewById(R.id.depttdisplay_hod);
        EditText email = (EditText)findViewById(R.id.email_hod);
        EditText enroll = (EditText)findViewById(R.id.enroll);
        EditText pass = (EditText)findViewById(R.id.pass_hod);
        EditText repass = (EditText)findViewById(R.id.re_pass_hod);
        Button register = (Button)findViewById(R.id.register_hod);
        Button login = (Button)findViewById(R.id.login_hod);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register__hod, menu);
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
