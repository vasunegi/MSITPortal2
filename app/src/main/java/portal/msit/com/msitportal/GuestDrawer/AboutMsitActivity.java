package portal.msit.com.msitportal.GuestDrawer;

import android.content.SharedPreferences;
import android.os.Bundle;

import portal.msit.com.msitportal.Drawer.GuestDrawerActivity;
import portal.msit.com.msitportal.R;

public class AboutMsitActivity extends GuestDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_msit);

        SharedPreferences prefs = getSharedPreferences("msitportal", MODE_PRIVATE);
        SharedPreferences.Editor edit = prefs.edit();
        edit.putString("activity_type", "navDrawer");
        edit.apply();
    }



}
