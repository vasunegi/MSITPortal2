package portal.msit.com.msitportal.GuestDrawer;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import portal.msit.com.msitportal.Drawer.GuestDrawerActivity;
import portal.msit.com.msitportal.ExpandableListAdapter2;
import portal.msit.com.msitportal.R;


public class FAQActivity extends GuestDrawerActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter2(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Why do i need MSIT-PORTAL app.?");
        listDataHeader.add("Who can use this Application.? ");
       /* listDataHeader.add("Coming Soon..");*/

        // Adding child data
        List<String> ques1 = new ArrayList<String>();
        ques1.add("MSIT-Portal would like you to provide the power of  MSIT application with addon functionality. \n" +
                        "\n" +
                        "You will be mesmerized by the minimalistic layout of this app with functionalities you would have never seen. \n"
        );

        List<String> ques2 = new ArrayList<String>();
        ques2.add("Anyone can use this website");
        ques2.add("Whether you are a :\n" + "1.Parent \n" + "2.Student\n" + "3.Teacher\n" + "4.Visitor\n");



        listDataChild.put(listDataHeader.get(0), ques1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), ques2);



    }
}
