package com.cste.nstu.suvro.telemedicine;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);


        /**
         * Creating all buttons instances
         * */
        // Dashboard doctor button
        Button btn_newsfeed = (Button) findViewById(R.id.btn_doc);

        // Dashboard user button
        Button btn_friends = (Button) findViewById(R.id.btn_usr);

        // Dashboard Medicine button
        Button btn_messages = (Button) findViewById(R.id.btn_med);

        // Dashboard Generic button
        Button btn_places = (Button) findViewById(R.id.btn_gen);

        // Dashboard Search button
        Button btn_events = (Button) findViewById(R.id.btn_ser);



        /**
         * Handling all button click events
         * */

        // Listening to Doctor button click
        btn_newsfeed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), DoctorActivity.class);
                startActivity(i);
            }
        });

        // Listening Friends button click
        btn_friends.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), UserActivity.class);
                startActivity(i);
            }
        });

        // Listening Messages button click
        btn_messages.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), MedicineActivity.class);
                startActivity(i);
            }
        });

        // Listening to Places button click
        btn_places.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), GenericActivity.class);
                startActivity(i);
            }
        });

        // Listening to Events button click
        btn_events.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(i);
            }
        });



//        GridView gridView = (GridView) findViewById(R.id.grid_view);
//
//        // Instance of ImageAdapter Class
//        gridView.setAdapter(new ImageAdapter(this));
//
//        /**
//         * On Click event for Single Gridview Item
//         * */
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View v,
//                                    int position, long id) {
//
//                // Sending image id to FullScreenActivity
//                Intent i = new Intent(getApplicationContext(), FullScreenActivity.class);
//                // passing array index
//                i.putExtra("id", position);
//                startActivity(i);
//            }
//        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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