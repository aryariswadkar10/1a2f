package com.example.exp5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanced)
    {
        View view = inflater.inflate(R.layout.activity_fragment2,container,false);
        Bundle bundle = getArguments();

        if(bundle!=null)
        {
            String first = bundle.getString("first");
            String last = bundle.getString("last");

            TextView first1 = view.findViewById(R.id.txt1);
            TextView last1 = view.findViewById(R.id.txt2);

            first1.setText(first);
            last1.setText(last);
        }
        return view;
    }
}

