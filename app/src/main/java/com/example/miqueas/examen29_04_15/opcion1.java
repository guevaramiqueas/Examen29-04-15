package com.example.miqueas.examen29_04_15;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class opcion1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion1);
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
}
