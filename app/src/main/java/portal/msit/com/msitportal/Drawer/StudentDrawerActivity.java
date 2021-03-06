package portal.msit.com.msitportal.Drawer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import portal.msit.com.msitportal.R;
import portal.msit.com.msitportal.StudentDrawer.AttendanceActivity;
import portal.msit.com.msitportal.StudentDrawer.Events_StudentActivity;
import portal.msit.com.msitportal.StudentDrawer.FavoriteActivity;
import portal.msit.com.msitportal.StudentDrawer.Favorite_Activity.ListViewDraggingAnimation;
import portal.msit.com.msitportal.StudentDrawer.Notices_StudentActivity;
import portal.msit.com.msitportal.StudentDrawer.ProfileActivity;
import portal.msit.com.msitportal.StudentDrawer.Reminder.NewReminderActivity;
import portal.msit.com.msitportal.StudentDrawer.Syllabus_StudentActivity;
import portal.msit.com.msitportal.Test2Activity;


public class StudentDrawerActivity extends AppCompatActivity {

    // Navigation Drawer Titles and their corresponding Icons.
    String TITLES[] = {"Home", "My Area", "My Attendance", "Syllabus", "Notice Board", "Events", "Reminder", "Blank","blank"};
    int ICONS[] = {R.drawable.ic_home, R.drawable.ic_calendar, R.drawable.ic_message, R.drawable.ic_friends, R.drawable.ic_calendar, R.drawable.ic_message, R.drawable.ic_friends, R.drawable.ic_calendar, R.drawable.ic_message};

    // Header details - They can also be set programatically from within any activity that extends DrawerActivity.
    String NAME = "Harish Phulara";
    String EMAIL = "hphulara996@gmail.com";
    int PROFILE = R.drawable.profile_pic;

    private Toolbar toolbar;                              // Declaring the Toolbar Object

    RecyclerView mRecyclerView;                           // Declaring RecyclerView
    RecyclerView.Adapter mAdapter;                        // Declaring Adapter For Recycler View
    RecyclerView.LayoutManager mLayoutManager;            // Declaring Layout Manager as a linear layout manager
    DrawerLayout drawer;                                  // Declaring DrawerLayout

    ActionBarDrawerToggle mDrawerToggle;                  // Declaring Action Bar drawer Toggle

    Boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(final int layoutResID) {
        DrawerLayout fullLayout = (DrawerLayout) getLayoutInflater()
                .inflate(R.layout.activity_student_drawer, null);  // Inflating the drawer layout.

        LinearLayout actContent = (LinearLayout) fullLayout.findViewById(R.id.content);

        // Assigning the toolbar object ot the view and setting the Action bar to our toolbar

        toolbar = (Toolbar) fullLayout.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) fullLayout.findViewById(R.id.RecyclerView); // Assigning the RecyclerView Object to the xml View

        mRecyclerView.setHasFixedSize(true);                            // Letting the system know that the list objects are of fixed size

        mAdapter = new ToolbarAdapter(TITLES, ICONS, NAME, EMAIL, PROFILE, this);       // Creating the Adapter of MyAdapter class(which we are going to see in a bit)
        // And passing the titles, icons, header view name, header view email, and header view profile picture

        mRecyclerView.setAdapter(mAdapter);                              // Setting the adapter to RecyclerView

        final GestureDetector mGestureDetector = new GestureDetector(StudentDrawerActivity.this, new GestureDetector.SimpleOnGestureListener() {

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });

        mRecyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());

                if (child != null && mGestureDetector.onTouchEvent(motionEvent)) {
                    drawer.closeDrawers();

                    switch (recyclerView.getChildPosition(child)) {
                        case 0:
                            // This will handle clicks on the Header of the Navigation Drawer.
                            Intent intent0 = new Intent(getApplicationContext(), FavoriteActivity.class);
                            startActivity(intent0);
                            finish();
                            break;
                        case 1:
                            // This will handle clicks on the Header of the Navigation Drawer.
                            Intent intent1 = new Intent(getApplicationContext(), FavoriteActivity.class);
                            startActivity(intent1);
                            finish();
                            break;
                        case 2:
                            // These cases will handle clicks on the Navigation Drawer.
                            Intent intent2 = new Intent(getApplicationContext(), ProfileActivity.class);
                            startActivity(intent2);
                            finish();
                            break;
                        case 3:
                            Intent intent3 = new Intent(getApplicationContext(), AttendanceActivity.class);
                            startActivity(intent3);
                            finish();
                            break;
                        case 4:
                            Intent intent4 = new Intent(getApplicationContext(), Syllabus_StudentActivity.class);
                            startActivity(intent4);
                            finish();
                            break;
                        case 5:
                            Intent intent5 = new Intent(getApplicationContext(), Notices_StudentActivity.class);
                            startActivity(intent5);
                            finish();
                            break;
                        case 6:
                            Intent intent6 = new Intent(getApplicationContext(), Events_StudentActivity.class);
                            startActivity(intent6);
                            finish();
                            break;
                        case 7:
                            Intent intent7 = new Intent(getApplicationContext(), NewReminderActivity.class);
                            startActivity(intent7);
                            finish();
                            break;
                        case 8:
                            Intent intent8 = new Intent(getApplicationContext(), ListViewDraggingAnimation.class);
                            startActivity(intent8);
                            finish();
                            break;
                        case 9:
                            Intent intent9 = new Intent(getApplicationContext(), Events_StudentActivity.class);
                            startActivity(intent9);
                            finish();
                            break;

                    }
             //       Toast.makeText(StudentDrawerActivity.this, "The Item Clicked is: " + recyclerView.getChildPosition(child), Toast.LENGTH_SHORT).show();

                    return true;
                }
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean b) {
            }
        });


        mLayoutManager = new LinearLayoutManager(this);                 // Creating a layout Manager

        mRecyclerView.setLayoutManager(mLayoutManager);                 // Setting the layout Manager

        drawer = (DrawerLayout) fullLayout.findViewById(R.id.drawer_layout);        // drawer object Assigned to the view
        mDrawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.open_drawer, R.string.close_drawer) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                // code here will execute once the drawer is opened( As I dont want anything happened whe drawer is
                // open I am not going to put anything here)
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                // Code here will execute once drawer is closed
            }
        }; // drawer Toggle Object Made
        drawer.setDrawerListener(mDrawerToggle); // drawer Listener set to the drawer toggle
        mDrawerToggle.syncState();               // Finally we set the drawer toggle sync State

        getLayoutInflater().inflate(layoutResID, actContent, true);
        super.setContentView(fullLayout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student_drawer, menu);
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

    @Override
    public void onBackPressed() {

        // On Back Button, close drawer if it's open, otherwise perform normal back button press.
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            // Handling press back button twice to close
            if (doubleBackToExitPressedOnce) {
                super.onBackPressed();
                return;
            }
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2000);  // After 2 seconds, the back button flag will be reset. If the user clicks back twice in under 2 secs, the app will perform it's back action.
        }
    }
}
