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
import android.widget.TextView;

/**
 * Created by Nabil on 21-Feb-18.
 */
public class GridAdapter extends BaseAdapter {
    Context context;
    private final String[] values;
    private final int[] images;
    View view;


    public GridAdapter(Context context, String[] values ,int[] images) {
        this.images = images;
        this.values = values;
        this.context = context;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return values[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        view=inflater.inflate(R.layout.singleitem,parent,false);
       // layoutinflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ImageView img=(ImageView)view.findViewById(R.id.imageview);
            TextView tvv=(TextView)view.findViewById(R.id.tvv1);
            img.setImageResource(images[position]);
            tvv.setText(values[position]);

        return view;
    }
}