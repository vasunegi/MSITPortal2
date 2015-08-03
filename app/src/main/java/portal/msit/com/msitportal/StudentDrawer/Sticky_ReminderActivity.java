package portal.msit.com.msitportal.StudentDrawer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import portal.msit.com.msitportal.R;

public class Sticky_ReminderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sticky__reminder);

        final EditText viewcomp = (EditText) findViewById(R.id.viewcomp);
        ImageButton send = (ImageButton) findViewById(R.id.imageButton);
        viewcomp.getText();

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewcomp.setText(viewcomp.getText().toString());
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sticky__reminder, menu);
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
