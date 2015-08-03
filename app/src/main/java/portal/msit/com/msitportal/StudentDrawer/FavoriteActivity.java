package portal.msit.com.msitportal.StudentDrawer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

import portal.msit.com.msitportal.Drawer.StudentDrawerActivity;
import portal.msit.com.msitportal.GuestDrawer.HomeActivity;
import portal.msit.com.msitportal.LoginModules.UserSessionManager_Student;
import portal.msit.com.msitportal.R;


public class FavoriteActivity extends StudentDrawerActivity {

   // UserSessionManager_Student session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

      //  session = new UserSessionManager_Student(getApplicationContext());

        TextView lblName = (TextView) findViewById(R.id.lblName);
        TextView lblEmail = (TextView) findViewById(R.id.lblEmail);




      /*  if(session.checkLogin())
            finish();

        // get user data from session
        HashMap<String, String> user = session.getUserDetails();*/

        // get name
      //  String name = user.get(UserSessionManager_Student.KEY_NAME);

        // get email
      //  String email = user.get(UserSessionManager_Student.KEY_EMAIL);

        // Show user data on activity
     //   lblName.setText(Html.fromHtml("Name: <b>" + name + "</b>"));
     //   lblEmail.setText(Html.fromHtml("Email: <b>" + email + "</b>"));

    }


    /*@Override
    public void onResume() {
        super.onResume();
        SharedPreferences prefs = getSharedPreferences("msitportal", MODE_PRIVATE);
        SharedPreferences.Editor edit = prefs.edit();
        edit.putString("activity_type", "navDrawer");
        edit.apply();
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_favorite, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_bookmark:
                // Single menu item is selected do something
                // Ex: launching new activity/screen or show alert message
                Toast.makeText(FavoriteActivity.this, "Bookmark is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_save:
                Intent b = new Intent(getApplicationContext(), SaveActivity.class);
                startActivity(b);
                Toast.makeText(FavoriteActivity.this, "Save is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_share:
                Toast.makeText(FavoriteActivity.this, "Share is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_complaints:
                Intent c = new Intent(getApplicationContext(), StartActivity.class);
                startActivity(c);
                Toast.makeText(FavoriteActivity.this, "Complaints is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_logout:
              //  session.logoutUser();
                Toast.makeText(FavoriteActivity.this, "It's Bad to see you go.", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
