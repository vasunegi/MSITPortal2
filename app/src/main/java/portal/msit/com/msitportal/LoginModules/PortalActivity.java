package portal.msit.com.msitportal.LoginModules;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import portal.msit.com.msitportal.Drawer.GuestDrawerActivity;
import portal.msit.com.msitportal.R;


public class PortalActivity extends GuestDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);
        ImageView hod = (ImageView) findViewById(R.id.hod);
        ImageView staff = (ImageView) findViewById(R.id.staff);
        ImageView student = (ImageView) findViewById(R.id.student);
        ImageView parent = (ImageView) findViewById(R.id.parent);

        hod.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(PortalActivity.this);
                alertDialog.setTitle("HOD");
                alertDialog.setMessage("Do You Want to Login Or Register?");
                alertDialog.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent login_hod = new Intent(getApplicationContext(), Login_HOD.class);
                        startActivity(login_hod);
                    }

                });

                alertDialog.setNegativeButton("Register", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent register_hod = new Intent(getApplicationContext(), Register_HOD.class);
                        startActivity(register_hod);
                    }
                });
                alertDialog.show();
                return false;


            }
        });
        staff.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(PortalActivity.this);
                alertDialog.setTitle("Staff");
                alertDialog.setMessage("Do You Want to Login Or Register?");
                alertDialog.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent login_staff = new Intent(getApplicationContext(), Login_Staff.class);
                        startActivity(login_staff);
                    }

                });

                alertDialog.setNegativeButton("Register", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent register_staff = new Intent(getApplicationContext(), Register_Staff.class);
                        startActivity(register_staff);
                    }
                });
                alertDialog.show();

                return false;


            }
        });

        student.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(PortalActivity.this);
                alertDialog.setTitle("Student");
                alertDialog.setMessage("Do You Want to Login Or Register?");
                alertDialog.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent login_student = new Intent(getApplicationContext(), Login_Student.class);
                        startActivity(login_student);
                    }

                });

                alertDialog.setNegativeButton("Register", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent register_student = new Intent(getApplicationContext(), Register_Student.class);
                        startActivity(register_student);
                    }
                });
                alertDialog.show();
                return false;


            }
        });

        parent.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(PortalActivity.this);
                alertDialog.setTitle("Parent");
                alertDialog.setMessage("Do You Want to Login Or Register?");
                alertDialog.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent login_parent = new Intent(getApplicationContext(), Login_Parent.class);
                        startActivity(login_parent);
                    }

                });

                alertDialog.setNegativeButton("Register", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent register_parent = new Intent(getApplicationContext(), Register_Parent.class);
                        startActivity(register_parent);

                    }
                });
                alertDialog.show();
                return false;


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_portal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_director_login:
                // Single menu item is selected do something
                // Ex: launching new activity/screen or show alert message
                Intent c = new Intent(getApplicationContext(), Login_Director.class);
                startActivity(c);
                Toast.makeText(PortalActivity.this, "Director Login", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
