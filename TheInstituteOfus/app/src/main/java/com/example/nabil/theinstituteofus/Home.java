package com.example.nabil.theinstituteofus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.yalantis.contextmenu.lib.ContextMenuDialogFragment;
import com.yalantis.contextmenu.lib.MenuObject;
import com.yalantis.contextmenu.lib.MenuParams;
import com.yalantis.contextmenu.lib.interfaces.OnMenuItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity  {
   private ContextMenuDialogFragment mMenuDialogFragment;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        fragmentManager=getSupportFragmentManager();
        initmenu();
        mMenuDialogFragment.setItemClickListener(new OnMenuItemClickListener() {
            @Override
            public void onMenuItemClick(View clickedView, int position) {
                if(position == 1){
                    Intent i = new Intent(Home.this,roundinstitut.class);
                    startActivity(i);
                }
               else if(position == 2){
                    Intent i = new Intent(Home.this, round.class);
                    startActivity(i);
                }
                else if(position == 3){
                    Intent i = new Intent(Home.this, folderexams.class);
                    startActivity(i);
                }
              else  if(position == 4){
                    Intent i = new Intent(Home.this, handsalist.class);
                    startActivity(i);
                }
                else if(position == 5){

                    Intent i = new Intent(Home.this, departments.class);
                    startActivity(i);
                }
                else if(position == 6){
                    Intent i = new Intent(Home.this, booksdir.class);
                    startActivity(i);
                }
                else if(position == 7){
                    Intent i = new Intent(Home.this, callus.class);
                    startActivity(i);
                }
                else if(position == 8){
                    Intent i = new Intent(Home.this, byus.class);
                    startActivity(i);
                }

            }
        });
    }
    private void initmenu(){
        MenuParams menuParams = new MenuParams();
        menuParams.setActionBarSize((int) getResources().getDimension(R.dimen.tool_bar_height));
        menuParams.setMenuObjects(getMenuObjects());
        menuParams.setClosableOutside(true);
        // set other settings to meet your needs
        mMenuDialogFragment = ContextMenuDialogFragment.newInstance(menuParams);
    }
    private List<MenuObject> getMenuObjects(){
        List<MenuObject> menuObjects=new ArrayList<>();
        MenuObject close = new MenuObject();
        close.setResource(R.drawable.bg);

        MenuObject send = new MenuObject("حول المعهد");
        send.setResource(R.drawable.zd);
        MenuObject sendd = new MenuObject("الطلبة المستجدين");
        sendd.setResource(R.drawable.index);
        MenuObject sends = new MenuObject("بنك الأمتحانات");
        sends.setResource(R.drawable.gkgk);
        MenuObject sendv = new MenuObject("أعضاء هيئة التدريس");
        sendv.setResource(R.drawable.bh);
        MenuObject sendvc = new MenuObject("أقسام المعهد");
        sendvc.setResource(R.drawable.xx);
        MenuObject sendvcz = new MenuObject("كتب دراسية");
        sendvcz.setResource(R.drawable.booksicon);
        MenuObject sendc = new MenuObject("أتصل بنا");
        sendc.setResource(R.drawable.dfd);
        MenuObject sdsd = new MenuObject("By ");
        sdsd.setResource(R.drawable.sdsd);


        menuObjects.add(close);
        menuObjects.add(send);
        menuObjects.add(sendd);
        menuObjects.add(sends);
        menuObjects.add(sendv);
        menuObjects.add(sendvc);
        menuObjects.add(sendvcz);
        menuObjects.add(sendc);
        menuObjects.add(sdsd);

        return menuObjects;
    }
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mune, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cmn:
                    mMenuDialogFragment.show(fragmentManager, "ContextMenuDialogFragment");

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
