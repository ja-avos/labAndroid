package uniandes.apo2h.misapuntes.interfaz;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import uniandes.apo2h.misapuntes.R;
import uniandes.apo2h.misapuntes.mundo.Companhero;
import uniandes.apo2h.misapuntes.mundo.Curso;

/**
 *
 */

public class ListaContactosAdapter extends ArrayAdapter<Companhero>
{

    public ListaContactosAdapter(@NonNull Context context, @NonNull List<Companhero> objects) {
        super(context, R.layout.adapter_lista_contactos, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.adapter_lista_contactos, parent, false);
        //TODO Colocar los valores del compañero en la posición que llega como parámetro en la interfaz (el rowView)

        return rowView;

    }
}
