package com.example.iwan_ni.simplegridview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by iwan_ni on 27/08/2017.
 */

public class ItemGridAdapter extends BaseAdapter {

    String[] items;
    Context context;

    public ItemGridAdapter(Context context, String[] items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewl = view;
        ViewHolder holder = null;

        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewl = inflater.inflate(R.layout.item_grid, null);
            holder.imgItem = (ImageView)viewl.findViewById(R.id.item_img_grid);
            viewl.setTag(holder);
        } else {
            holder = (ViewHolder)viewl.getTag();
        }

        Log.d("Item ke " + i, items[i]);
        Picasso.with(context)
                .load(items[i])
                .placeholder(ContextCompat.getDrawable(context, R.drawable.placeholder))
                .into(holder.imgItem);

        return viewl;
    }

    static class ViewHolder{
        ImageView imgItem;
    }
}
