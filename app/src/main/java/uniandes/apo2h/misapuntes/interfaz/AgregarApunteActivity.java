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
import uniandes.apo2h.misapuntes.mundo.Apunte;
import uniandes.apo2h.misapuntes.mundo.Curso;
import uniandes.apo2h.misapuntes.mundo.MisApuntes;

public class AgregarApunteActivity extends AppCompatActivity {

    private MisApuntes mundo = MisApuntes.getInstance();
    private Curso curso;
    private int idxCurso;
    private Apunte apunte;
    private boolean edicion = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_apunte);
        setTitle("Agregar Apunte");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        idxCurso = getIntent().getIntExtra(ListaApuntesActivity.IDX_CURSO, 0);
        curso = mundo.darCursos().get(idxCurso);
        int idxApunte = getIntent().getIntExtra(ListaApuntesActivity.IDX_APUNTE, -1);
        edicion = idxApunte!=-1;
        Button btnApunte = (Button) findViewById(R.id.btnApunte);
        if(edicion){
            apunte = curso.darApuntes().get(idxApunte);
            EditText txtDescripcionApunte = (EditText) findViewById(R.id.txtApunte);
            txtDescripcionApunte.setText(apunte.darTextoApunte());
            btnApunte.setText("Editar Apunte");
        } else {
            btnApunte.setText("Agregar Apunte");
        }
    }

    public void agregarApunte(View view){
        EditText txtDescripcionApunte = (EditText) findViewById(R.id.txtApunte);
        if(edicion){

            apunte.modificarTextoApunte(txtDescripcionApunte.getText().toString());
        } else {
            curso.agregarApunte(txtDescripcionApunte.getText().toString());
        }
        Intent intent = new Intent(this, ListaApuntesActivity.class);
        intent.putExtra(ListaApuntesActivity.IDX_CURSO, idxCurso);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, ListaApuntesActivity.class);
        intent.putExtra(ListaApuntesActivity.IDX_CURSO, idxCurso);
        startActivity(intent);
        finish();
    }
}
