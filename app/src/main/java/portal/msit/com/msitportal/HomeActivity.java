package portal.msit.com.msitportal;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ViewFlipper;


public class HomeActivity extends GuestDrawerActivity {

    int mFlipping =0; // Initially flipping is off
    Button mButton ; // Reference to button available in the layout to start and stop the flipper

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ViewFlipper flipper = (ViewFlipper) findViewById(R.id.flipper1);

        flipper.startFlipping();

       /* *//** Click event handler for button *//*
        OnClickListener listener = new OnClickListener() {

            @Override
            public void onClick(View v) {
                ViewFlipper flipper = (ViewFlipper) findViewById(R.id.flipper1);

                if(mFlipping==0){
                    *//** Start Flipping *//*
                    flipper.startFlipping();
                    mFlipping=1;
                    mButton.setText(R.string.str_btn_stop);
                }
                else{
                    *//** Stop Flipping *//*
                    flipper.stopFlipping();
                    mFlipping=0;
                    mButton.setText(R.string.str_btn_start);
                }
            }
        };
*/
  /*      *//** Getting a reference to the button available in the resource *//*
        mButton = (Button) findViewById(R.id.btn);

        *//** Setting click event listner for the button *//*
        mButton.setOnClickListener(listener);
*/
    }/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_visitor, menu);
        return true;
    }*/
}