package com.example.graziellarondonchebly.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements View.OnClickListener {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        View myButtonView = v.findViewById(R.id.reseButton);
        myButtonView.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View v){
        getActivity();
        //  toast when you open reseplaneraren
        Toast t = Toast.makeText(getActivity(), "Reseplaneraren", Toast.LENGTH_SHORT);
        t.show();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment2 bf= new Fragment2();
        // change layout to fragment2
        ft.replace(R.id.start_layout,bf);
        ft.commit();

        // getFragmentManager().beginTransaction().replace(R.id.start_layout, new ListFragment()).commit();
    }

}