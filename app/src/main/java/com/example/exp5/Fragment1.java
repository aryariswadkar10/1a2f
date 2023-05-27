package com.example.exp5;

import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Fragment1 extends Fragment {
    EditText txt1,txt2;
    Button b1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanced)
    {
        View view =  inflater.inflate(R.layout.activity_fragment1,container,false);
        txt1=view.findViewById(R.id.txt1);
        txt2=view.findViewById(R.id.txt2);
        b1=view.findViewById(R.id.button);

        b1.setOnClickListener(view1 -> {
            String F_name = txt1.getText().toString();
            String L_name  = txt2.getText().toString();

            Bundle bundle = new Bundle();
            bundle.putString("first",F_name);
            bundle.putString("last",L_name);

            Fragment2 fragInfo = new Fragment2();
            fragInfo.setArguments(bundle);
            FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.MainLayout,fragInfo);
            fragmentTransaction.commit();

            b1.setOnClickListener(view2 -> {

            });
        });
        return view;
    }
}
