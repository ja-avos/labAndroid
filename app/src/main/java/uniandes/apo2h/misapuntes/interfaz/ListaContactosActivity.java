package uniandes.apo2h.misapuntes.interfaz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import uniandes.apo2h.misapuntes.R;
import uniandes.apo2h.misapuntes.utils.AdministradorBaseDatos;

public class ListaContactosActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contactos);
        setTitle("Compañeros de clase");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TODO Agregar a la lista el adaptador ListaContactosAdapter

        FloatingActionButton menuAgregarContacto = (FloatingActionButton) findViewById(R.id.menuAgregarContacto);
        menuAgregarContacto.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
         //TODO Iniciar una nueva actividad para agregar al compañero.
    }
}
