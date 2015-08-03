package portal.msit.com.msitportal.GuestDrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.io.File;

import portal.msit.com.msitportal.R;


public class SemesterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
        TextView first =(TextView) findViewById(R.id.first);
        TextView second =(TextView) findViewById(R.id.second);
        TextView third = (TextView)findViewById(R.id.third);
        TextView fourth = (TextView)findViewById(R.id.fourth);
        TextView fifth =(TextView) findViewById(R.id.fifth);
        TextView sixth = (TextView)findViewById(R.id.sixth);

        first.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                File pdf = new File("abc.pdf");
                i.setDataAndType(Uri.fromFile(pdf), "application/pdf");
                startActivity(i);

            return false;
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_semester, menu);
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
