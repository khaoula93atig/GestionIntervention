package com.example.interventions;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
ListView _lstInterventions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _lstInterventions = (ListView) findViewById(R.id.LsvInterventions);
        db = openOrCreateDatabase("bdIntervention",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS Interventions (titre varchar primary key, client varchar, adress varchar , heure varchar , termine boolean );");
        db.execSQL("insert into Interventions (titre, client,adress , heure , termine ) values (?,?,?,?,?)", new String[] {"titre interv 1","client 1","adress client 1","08:00-12:00","false"});
        db.execSQL("insert into Interventions (titre, client,adress , heure , termine ) values (?,?,?,?,?)", new String[] {"titre interv 2","client 2","adress client 2","12:00-18:00","false"});

        Cursor cur =db.rawQuery("select titre, client, adress , heure , termine from Interventions",null);

        final ArrayList<intervention> interventions=new ArrayList<>();
        if (cur.getCount()!=0){
            while (cur.moveToNext()){
                interventions.add(new intervention(cur.getString(0),cur.getString(1),cur.getString(2),cur.getString(3),Boolean.valueOf(cur.getString(4))));
            }
        }

        //interventions.add(new intervention("titre interv 1","client 1","aderss client 1","08:00-12:00",false));
        //interventions.add(new intervention("titre interv 2","client 2","aderss client 2","12:00-17:00",true));
        AdaptateurInterv adptinterv = new AdaptateurInterv(this,interventions);
        _lstInterventions.setAdapter(adptinterv);

    }

}