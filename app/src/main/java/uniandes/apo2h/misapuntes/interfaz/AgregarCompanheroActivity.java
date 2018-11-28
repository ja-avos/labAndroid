package uniandes.apo2h.misapuntes.interfaz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import uniandes.apo2h.misapuntes.R;
import uniandes.apo2h.misapuntes.mundo.Companhero;
import uniandes.apo2h.misapuntes.utils.AdministradorBaseDatos;

public class AgregarCompanheroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_companhero);
        setTitle("Agregar Compañero");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void agregarCompanhero(View v)
    {
        //TODO Realizar lo necesario para agregar un compañero a la base de datos. Recuerde asociar el botón a este método (en diseño revise la propiedad onClick)

    }

}
