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

import java.text.SimpleDateFormat;
import java.util.List;

import uniandes.apo2h.misapuntes.R;
import uniandes.apo2h.misapuntes.mundo.Apunte;

/**
 * Created by Asistente on 11/10/2017.
 */

public class ListaApuntesAdapter extends ArrayAdapter<Apunte>
{

    private final SimpleDateFormat dateFormat  = new SimpleDateFormat("dd/MM/yyyy");

    public ListaApuntesAdapter(@NonNull Context context, @NonNull List<Apunte> objects) {
        super(context, R.layout.adapter_lista_apuntes, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater li = LayoutInflater.from(getContext());
            convertView = li.inflate(R.layout.adapter_lista_apuntes, parent, false);
        }
        Apunte apunte = getItem(position);
        TextView txtFecha = (TextView) convertView.findViewById(R.id.txtFechaApunte);
        txtFecha.setText(dateFormat.format(apunte.darFecha().getTime()));
        TextView txtDescripcionApunte = (TextView) convertView.findViewById(R.id.txtDescripcionApunte);
        txtDescripcionApunte.setText(apunte.darResumen());
        return convertView;
    }


}
