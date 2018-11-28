package uniandes.apo2h.misapuntes.interfaz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import uniandes.apo2h.misapuntes.R;
import uniandes.apo2h.misapuntes.mundo.MisApuntes;

public class ListaCursosActivity extends AppCompatActivity implements View.OnClickListener, ListView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
        setTitle("Mis Apuntes");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton agregarCurso = (FloatingActionButton) findViewById(R.id.menuAgregarCurso);
        agregarCurso.setOnClickListener(this);

        FloatingActionButton agregarContactos = (FloatingActionButton) findViewById(R.id.menuVerContactos);
        agregarContactos.setOnClickListener(this);

        ListView listView = (ListView) findViewById(R.id.listCursos);
        listView.setOnItemClickListener(this);
        listView.setAdapter(new ListaCursosAdapter(this, MisApuntes.getInstance().darCursos()));
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.menuAgregarCurso:
            {
                Intent intent = new Intent(this,AgregarCursoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.menuVerContactos:
            {
                Intent intent = new Intent(this,ListaContactosActivity.class);
                startActivity(intent);
                break;
            }
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Intent intent = new Intent(this,ListaApuntesActivity.class);
        intent.putExtra(ListaApuntesActivity.IDX_CURSO, position);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
