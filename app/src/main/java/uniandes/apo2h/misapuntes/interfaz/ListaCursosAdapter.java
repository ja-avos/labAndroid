package uniandes.apo2h.misapuntes.interfaz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import uniandes.apo2h.misapuntes.R;
import uniandes.apo2h.misapuntes.mundo.Curso;

/**
 * Clase adaptadora de la lista de cursos.
 * @author Christian Aparicio
 *
 */

public class ListaCursosAdapter extends ArrayAdapter<Curso>
{

    private List<Curso> cursos;


    public ListaCursosAdapter(@NonNull Context context, @NonNull List<Curso> objects) {
        super(context, R.layout.adapter_lista_curso, objects);
        cursos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.adapter_lista_curso, parent, false);
        Curso curso = getItem(position);
        TextView nombreCurso = (TextView) rowView.findViewById(R.id.textNombreCurso);
        nombreCurso.setText(curso.darNombre());
        TextView nombreProfesor = (TextView) rowView.findViewById(R.id.textNombreProfesor);
        nombreProfesor.setText(curso.darNombreProfesor());
        TextView correoProfesor = (TextView) rowView.findViewById(R.id.textCorreoProfesor);
        correoProfesor.setText(curso.darCorreoProfesor());
        return rowView;
    }
}
