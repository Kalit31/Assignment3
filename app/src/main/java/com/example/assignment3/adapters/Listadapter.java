package com.example.assignment3.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assignment3.R;
import com.example.assignment3.models.Item;

import java.util.List;

public class Listadapter extends ArrayAdapter<Item>
{

    List<Item> items;
    Activity context;

    public Listadapter(List<Item> items, Activity context) {
        super(context, R.layout.list_layout,items);
        this.items = items;
        this.context = context;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View row = inflater.inflate(R.layout.list_layout, parent, false);
        final TextView name = row.findViewById(R.id.name);
        TextView no = row.findViewById(R.id.contact);
        ImageView image = row.findViewById(R.id.image_view);
        name.setText(items.get(position).getName());
        no.setText(items.get(position).getPh_no());
        image.setImageResource(items.get(position).getResc_id());

        return row;
    }

}

