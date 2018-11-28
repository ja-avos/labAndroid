package uniandes.apo2h.misapuntes.interfaz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import uniandes.apo2h.misapuntes.R;
import uniandes.apo2h.misapuntes.mundo.Curso;
import uniandes.apo2h.misapuntes.mundo.MisApuntes;

public class ListaApuntesActivity extends AppCompatActivity implements View.OnClickListener, ListView.OnItemClickListener
{

    public static final String IDX_CURSO = "idx_curso";
    public static final String IDX_APUNTE = "idx_apunte";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_apuntes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int idxCurso = getIntent().getIntExtra(IDX_CURSO,0);
        Curso curso = MisApuntes.getInstance().darCursos().get(idxCurso);
        setTitle("Apuntes - " + curso.darNombre());
        ListView lista = (ListView) findViewById(R.id.listApuntes);
        lista.setAdapter(new ListaApuntesAdapter(this,curso.darApuntes()));
        lista.setOnItemClickListener(this);

        FloatingActionButton agregarApunte = (FloatingActionButton) findViewById(R.id.menuAgregarApunte);
        agregarApunte.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent intent = new Intent(this, AgregarApunteActivity.class);
        int idxCurso = getIntent().getIntExtra(IDX_CURSO, 0);
        intent.putExtra(IDX_CURSO, idxCurso);
        startActivity(intent);
        finish();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Intent intent = new Intent(this, AgregarApunteActivity.class);
        int idxCurso = getIntent().getIntExtra(IDX_CURSO, 0);
        intent.putExtra(IDX_CURSO, idxCurso);
        intent.putExtra(ListaApuntesActivity.IDX_APUNTE, position);
        startActivity(intent);
        finish();
    }
}
