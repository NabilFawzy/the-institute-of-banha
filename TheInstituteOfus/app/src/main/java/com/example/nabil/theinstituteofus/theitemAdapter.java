package com.example.nabil.theinstituteofus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Nabil on 18-Feb-18.
 */

public class theitemAdapter extends ArrayAdapter<theitem> {

    Context mContext;
    Integer mLayoutID;
    ArrayList<theitem> itemdata;

    public theitemAdapter(Context context, int resource, ArrayList<theitem> productdata) {
        super(context, resource,productdata);
        this.mContext = context;
        this.mLayoutID = resource;
        this.itemdata = productdata;
    }

    @Override
    public int getPosition(theitem item) {
        return super.getPosition(item);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row=convertView;
        PlaceHolder  placeHolder=null;
        if(row==null)
        {
            LayoutInflater inflater=LayoutInflater.from(mContext);
            row=inflater.inflate(mLayoutID,parent,false);
            placeHolder=new PlaceHolder();
            placeHolder.nameView=(TextView)row.findViewById(R.id.tv1);
            placeHolder.imageView=(ImageView)row.findViewById(R.id.img);
            row.setTag(placeHolder);
        }
        else{
            placeHolder=(PlaceHolder) row.getTag();
        }

        theitem item=itemdata.get(position);
        placeHolder.imageView.setOnClickListener(PopupListener);
        Integer rowPostion=position;

        placeHolder.imageView.setTag(rowPostion);
        placeHolder.nameView.setText(item.itemname);

        int res=mContext.getResources().getIdentifier(item.imgname,"drawable",mContext.getPackageName());
        placeHolder.imageView.setImageResource(res);
        return row;
    }

    private static class PlaceHolder{
        ImageView imageView;
        TextView nameView;
    };


    View.OnClickListener PopupListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Integer viewPos=(Integer)view.getTag();
            theitem p=itemdata.get(viewPos);
            Toast.makeText(getContext(),p.itemname,Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public Filter getFilter() {
        return super.getFilter();
    }

}
