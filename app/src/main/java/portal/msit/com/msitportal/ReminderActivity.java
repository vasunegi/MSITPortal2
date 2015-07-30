package portal.msit.com.msitportal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ReminderActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        final Button next = (Button) findViewById(R.id.next);
        final EditText date = (EditText) findViewById(R.id.date);
        final EditText title = (EditText) findViewById(R.id.title);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stickyIntent = new Intent(getApplicationContext(), Sticky_ReminderActivity.class);
                stickyIntent.putExtra("date", date.getText().toString());
                stickyIntent.putExtra("title", title.getText().toString());

                startActivity(stickyIntent);
            }

        });
    }



}
