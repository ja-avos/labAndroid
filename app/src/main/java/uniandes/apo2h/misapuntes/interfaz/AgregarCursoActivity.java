package uniandes.apo2h.misapuntes.interfaz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import uniandes.apo2h.misapuntes.R;
import uniandes.apo2h.misapuntes.mundo.MisApuntes;

public class AgregarCursoActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_curso);
        setTitle("Agregar Curso");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button boton = (Button) findViewById(R.id.btnAgregarCurso);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        EditText nombreCursoEditText = (EditText) findViewById(R.id.txtNombreCurso);
        EditText nombreProfesorEditText = (EditText) findViewById(R.id.txtNombreProfesor);
        EditText correoProfesorEditText = (EditText) findViewById(R.id.txtCorreoProfesor);

        String nombreCurso = nombreCursoEditText.getText().toString();
        String nombreProfesor = nombreProfesorEditText.getText().toString();
        String correoProfesor = correoProfesorEditText.getText().toString();

        if(nombreCurso != null && !nombreCurso.equals("") && nombreProfesor != null && !nombreProfesor.equals("") && correoProfesor != null && !correoProfesor.equals(""))
        {
            MisApuntes.getInstance().agregarCurso(nombreCurso,nombreProfesor,correoProfesor);
            Intent intent = new Intent(this,ListaCursosActivity.class);
            startActivity(intent);
            finish();
        }
        else
        {
            Snackbar.make(v, "Los campos no pueden estar vacíos.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
