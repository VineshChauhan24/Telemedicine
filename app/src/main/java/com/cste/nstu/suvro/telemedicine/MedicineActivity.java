package com.cste06.nstu.suvro.telemedicine;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MedicineActivity extends ListActivity implements AdapterView.OnItemClickListener {

    Medicine medicines;
    List<Medicine> list;
    ArrayAdapter<String> myAdapter;
    private SqlLiteManger sqlLiteManger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicine_layout);

        sqlLiteManger=new SqlLiteManger(this);
        sqlLiteManger.open();
        medicines = new Medicine();

        // find all generic
        list = sqlLiteManger.getAllMedicines();
        List<String> listTitle = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            listTitle.add(i, list.get(i).getMed_name());

        }


        myAdapter = new ArrayAdapter<String>(this, R.layout.row_layout, R.id.listText, listTitle);
        getListView().setOnItemClickListener(this);
        setListAdapter(myAdapter);

      //  Toast.makeText(this, "Working", Toast.LENGTH_LONG).show();



        sqlLiteManger.close();
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

       //  start MedicineActivity with extras the generic id
        Intent intent = new Intent(this, ExtendedMedicineActivity.class);
        intent.putExtra("medicine", list.get(position).getMed_id());
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       // super.onActivityResult(requestCode, resultCode, data);


    }
}

