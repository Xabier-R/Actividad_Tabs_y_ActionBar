package com.example.actividad_tabs_y_actionbar;

import android.content.ClipData;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView1 = findViewById(R.id.textView1);
        menu = findViewById(R.id.action_otros);



        Resources res = getResources();
        TabHost tabs=findViewById(android.R.id.tabhost);
        tabs.setup();


        TabHost.TabSpec spec=tabs.newTabSpec("tabChats");
        spec.setContent(R.id.Llamadas);
        spec.setIndicator("Chats");
        tabs.addTab(spec);
        spec=tabs.newTabSpec("tabContactos");
        spec.setContent(R.id.Chats);
        spec.setIndicator("Contactos");
        tabs.addTab(spec);
        spec=tabs.newTabSpec("tabLlamadas");
        spec.setContent(R.id.Contactos);
        spec.setIndicator("LLamadas");
        tabs.addTab(spec);
        tabs.setCurrentTab(0);



        tabs.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {

                if(tabId.equals("tabChats"))
                {
                    menu.getItem(2).setIcon(getDrawable(R.drawable.ic_chat));

                }

                if(tabId.equals("tabContactos"))
                {
                    menu.getItem(2).setIcon(getDrawable(R.drawable.ic_contactos));

                }

                if(tabId.equals("tabLlamadas"))
                {
                    menu.getItem(2).setIcon(getDrawable(R.drawable.ic_llamada));

                }

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        this.menu = menu;
        return true;
    }


    //MIRAR PARA QUE SIRVE
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
