package com.example.nabil.theinstituteofus;

/**
 * Created by Nabil on 21-Feb-18.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Nabil on 21-Feb-18.
 */
public class GridAdapterer extends BaseAdapter {
    Context context;
    private final int[] images;
    View view;


    public GridAdapterer(Context context, int[] images) {
        this.images = images;
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        //view=inflater.inflate(R.layout.singleletter,parent,false);
       // layoutinflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ImageView img=(ImageView)view.findViewById(R.id.imageview);
            img.setImageResource(images[position]);

        return view;
    }
}