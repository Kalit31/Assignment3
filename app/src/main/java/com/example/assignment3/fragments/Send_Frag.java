package com.example.assignment3.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.assignment3.R;


public class Send_Frag extends Fragment {

    EditText email_id;
    EditText content;
    FloatingActionButton send;

    public Send_Frag() {

    }
    public static Send_Frag newInstance() {
        Send_Frag fragment = new Send_Frag();
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_send_, container, false);
        send=v.findViewById(R.id.floatingActionButton);
        email_id=v.findViewById(R.id.recieve_id);
        content=v.findViewById(R.id.email);
        // Getting context
        Context context=getContext();

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String x = "mailto:" + Uri.encode(email_id.getText().toString())+
                        "?subject="+Uri.encode("Subject")
                        + "&body="+Uri.encode(content.getText().toString());
                Uri send_data = Uri.parse(x);
                Intent send =new Intent(Intent.ACTION_SENDTO);
                send.setData(send_data);
                startActivity(send);

            }
        });

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

}
