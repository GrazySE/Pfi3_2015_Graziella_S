import android.support.v4.app.Fragment;
import com.example.graziellarondonchebly.myapplication.MainActivity;
import com.example.graziellarondonchebly.myapplication.R;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link Fragment} subclass.
 */
public class Resa extends Fragment implements View.OnClickListener {


    public Resa() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View v = inflater.inflate(R.layout.fragment_main, container, false);
        View myButtonView = v.findViewById(R.id.reseButton);
        myButtonView.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        MainActivity a = (MainActivity) getActivity();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Redesign rd = new Redesign();
        ft.replace(R.id.container, rd);
        ft.commit();
    }

    public class Redesign extends Fragment implements View.OnClickListener {


        public Redesign() {
            // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment

            View v2 = inflater.inflate(R.layout.fragment_main, container, false);
            View myButtonView2 = v2.findViewById(R.id.reseButton);
            myButtonView2.setOnClickListener(this);
            return v2;
        }


        @Override
        public void onClick(View v2) {
            MainActivity a2 = (MainActivity) getActivity();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft2 = fm.beginTransaction();
            Start bf2 = new Start();
            ft2.replace(R.id.container, bf2);
            ft2.commit();
        }





        public class Start extends Fragment implements View.OnClickListener {


            public Start() {
                // Required empty public constructor
            }


            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState) {
                // Inflate the layout for this fragment

                View v = inflater.inflate(R.layout.fragment_main, container, false);
                View myButtonView = v.findViewById(R.id.reseButton);
                myButtonView.setOnClickListener(this);
                return v;
            }


            @Override
            public void onClick(View v) {
                MainActivity a = (MainActivity) getActivity();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Redesign rd = new Redesign();
                ft.replace(R.id.container,rd);
                ft.commit();
            }
        }






    }
}
