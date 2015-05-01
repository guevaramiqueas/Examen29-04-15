package com.example.miqueas.examen29_04_15;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button comida1;
    Button comida2;
    Button comida3;
    Button comida4;
    Button comida5;
    Button comida6;

    ListView lista;
    String[] restaurant = {
            "AJI DE GALLINA $3.50",
            "ARROZ CON POLLO $3.50",
            "ENSALADA RUSA $3.50",
            "PAPA LA HUANCAINA $5.00",
            "PESCADO FRITO $5.00",
            "POLLO BROASTER $5.00" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.Lista);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurant);

        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0:
                        Intent ii = new Intent(getApplicationContext(), comida1.class);
                        startActivity(ii);
                        break;
                    case 1:
                        Intent iii = new Intent(getApplicationContext(), comida2.class);
                        startActivity(iii);

                        break;
                    case 2:
                        Intent iiii = new Intent(getApplicationContext(), comida3.class);
                        startActivity(iiii);

                        break;
                    case 3:
                        Intent iiiii = new Intent(getApplicationContext(), comida4.class);
                        startActivity(iiiii);

                        break;
                    case 4:
                        Intent iiiiii = new Intent(getApplicationContext(), comida5.class);
                        startActivity(iiiiii);

                        break;
                    case 5:
                        Intent iiiiiii = new Intent(getApplicationContext(), comida6.class);
                        startActivity(iiiiiii);

                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                }
            }
        });


        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.inicio);
        spec.setIndicator("inicio");
        Toast cl = Toast.makeText(getApplicationContext(), "bienvenido a inicio", Toast.LENGTH_SHORT);
        cl.show();
        tabs.addTab(spec);


        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.plato);
        spec.setIndicator("plato");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab3");
        spec.setContent(R.id.platos);
        spec.setIndicator("platos");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);


    comida1= (Button) findViewById(R.id.comida1);


        comida1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantallaIntrucciones=new Intent(getApplicationContext(),comida1.class);
                startActivity(pantallaIntrucciones);
            }
        });
        comida2= (Button) findViewById(R.id.comida2);


        comida2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantallaIntrucciones=new Intent(getApplicationContext(),comida2.class);
                startActivity(pantallaIntrucciones);
            }
        });
        comida3= (Button) findViewById(R.id.comida3);


        comida3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantallaIntrucciones=new Intent(getApplicationContext(),comida3.class);
                startActivity(pantallaIntrucciones);
            }
        });
        comida4= (Button) findViewById(R.id.comida4);


        comida4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantallaIntrucciones=new Intent(getApplicationContext(),comida4.class);
                startActivity(pantallaIntrucciones);
            }
        });
        comida5= (Button) findViewById(R.id.comida5);


        comida5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantallaIntrucciones=new Intent(getApplicationContext(),comida5.class);
                startActivity(pantallaIntrucciones);
            }
        });
        comida6= (Button) findViewById(R.id.comida6);


        comida6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantallaIntrucciones=new Intent(getApplicationContext(),comida6.class);
                startActivity(pantallaIntrucciones);
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.action_settings:  return true;
            case R.id.action_setting: return true;

            case R.id.inicio:
                Intent main = new Intent(this, MainActivity.class);
                startActivity(main);
                return true;
            case R.id.opcion1:
                Intent opc1 = new Intent(this, opcion1.class);
                startActivity(opc1);
                return true;
            case R.id.opcion2:
                Intent opc2 = new Intent(this, opcion2.class);
                startActivity(opc2);
                return true;
            case R.id.opcion3:
                Intent   opc3 = new Intent(this, opcion3.class);
                startActivity(opc3);
                return true;
            case R.id.opcion4:
                Intent opc4 = new Intent(this, opcion4.class);
                startActivity(opc4);
                return true;
            case R.id.opcion1_1:
                Intent opc1_1 = new Intent(this, opcion1_1.class);
                startActivity(opc1_1);
                return true;
            case R.id.opcion2_2:
                Intent opc2_2 = new Intent(this, opcion2_2.class);
                startActivity(opc2_2);
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }
    public void img1(View v){

        setContentView(R.layout.activity_comida1);
    }
}
