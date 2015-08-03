package portal.msit.com.msitportal.StudentDrawer;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import portal.msit.com.msitportal.Drawer.StudentDrawerActivity;
import portal.msit.com.msitportal.R;


public class ProfileActivity extends StudentDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView profile_pic = (ImageView)findViewById(R.id.profile_pic);
        TextView name = (TextView)findViewById(R.id.name_student);
        TextView user = (TextView)findViewById(R.id.user_student);
        TextView phone = (TextView)findViewById(R.id.phone_student);
        TextView deptt = (TextView)findViewById(R.id.deptt_student);
        TextView email = (TextView)findViewById(R.id.email_student);
        TextView enroll = (TextView)findViewById(R.id.enroll);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
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
            Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.account) {
            Toast.makeText(getApplicationContext(), "Account", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.edit_profile) {
            Toast.makeText(getApplicationContext(), "Edit Profile", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
