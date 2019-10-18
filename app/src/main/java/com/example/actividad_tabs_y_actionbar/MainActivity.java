package com.example.actividad_tabs_y_actionbar;


import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.widget.ListView;
import android.widget.TabHost;


public class MainActivity extends AppCompatActivity {

    private Menu menu;
    private ListView listaLLamadas,listaChats,listaContactos;

    private Contactos[] contactos = new Contactos[]{new Contactos("Juan", "Disponible", 63254598, "juan"),
            new Contactos("Pepe", "Ocupado", 698452120, "pepe"), new Contactos("Antonio", "Comiendo", 62541578, "antonio")};

    private Llamadas[] llamadas = new Llamadas[]{new Llamadas(contactos[0], "14:25", "ic_call_received"),
            new Llamadas(contactos[1], "08:41", "ic_call_received"), new Llamadas(contactos[2], "18:11", "ic_call_made")};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        listaChats = findViewById(R.id.listViewCha);

        menu = findViewById(R.id.action_otros);



        Resources res = getResources();
        TabHost tabs=findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("tabChats");



        spec.setContent(R.id.Chats);
        spec.setIndicator("Chats");
        tabs.addTab(spec);



        spec=tabs.newTabSpec("tabContactos");
        listaContactos = findViewById(R.id.listViewCon);
        AdaptadorContactos adaptadorContactos = new AdaptadorContactos(this,contactos);

        listaContactos.setAdapter(adaptadorContactos);

        spec.setContent(R.id.listViewCon);
        spec.setIndicator("Contactos");
        tabs.addTab(spec);



        spec=tabs.newTabSpec("tabLlamadas");

        listaLLamadas = findViewById(R.id.listViewLl);
        AdaptadorLlamadas adaptadorLlamadas = new AdaptadorLlamadas(this,llamadas);

        listaLLamadas.setAdapter(adaptadorLlamadas);


        spec.setContent(R.id.listViewLl);
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

}
