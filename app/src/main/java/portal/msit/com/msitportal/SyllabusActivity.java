package portal.msit.com.msitportal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;


public class SyllabusActivity extends GuestDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        TextView cse= (TextView) findViewById(R.id.cse);
        TextView ece= (TextView) findViewById(R.id.ece);
        TextView it= (TextView) findViewById(R.id.it);
        TextView eee= (TextView) findViewById(R.id.eee);
        cse.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent cseIntent= new Intent(getApplicationContext(), SemesterActivity.class);
                startActivity(cseIntent);
                return false;


            }
        });
        ece.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent eceIntent= new Intent(getApplicationContext(), SemesterActivity.class);
                startActivity(eceIntent);
                return false;

            }
        });
        it.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent itIntent = new Intent(getApplicationContext(), SemesterActivity.class);
                startActivity(itIntent);
                return false;

            }
        });
        eee.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent eeeIntent = new Intent(getApplicationContext(), SemesterActivity.class);
                startActivity(eeeIntent);
                return false;

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_syllabus, menu);
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
