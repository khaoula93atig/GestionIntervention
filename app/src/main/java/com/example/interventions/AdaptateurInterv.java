package com.example.interventions;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class AdaptateurInterv extends ArrayAdapter<intervention> {
    public AdaptateurInterv(@NonNull Context context, ArrayList<intervention>Inerv) {
        super(context,0, Inerv);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View lsvElementView = convertView;
        if (lsvElementView == null){
            lsvElementView = LayoutInflater.from(getContext()).inflate(R.layout.eintervention,parent,false);
        }
        intervention intervCourant = getItem(position);

        TextView txtTitreInterv = (TextView) lsvElementView.findViewById(R.id.txtTitreIntrv);
        txtTitreInterv.setText(intervCourant.getTitreInterv());

        TextView txtClient = (TextView) lsvElementView.findViewById(R.id.txtClient);
        txtClient.setText(intervCourant.getClient());

        TextView txtAdress = (TextView) lsvElementView.findViewById(R.id.txtAdressClient);
        txtAdress.setText(intervCourant.getAdressClient());

        TextView txtHeure = (TextView) lsvElementView.findViewById(R.id.txtHeureIntrv);
        txtHeure.setText(intervCourant.getHeureInterv());

        CheckBox chekTerminer= (CheckBox) lsvElementView.findViewById(R.id.checkBox);
        chekTerminer.setChecked(intervCourant.getTermine());



        return lsvElementView;
    }


}
