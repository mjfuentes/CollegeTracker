package rockapps.progresofacultad.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import rockapps.progresofacultad.Model.EstadoMateria;
import rockapps.progresofacultad.Model.Materia;
import rockapps.progresofacultad.R;

public class ListaMateriasAdapter extends BaseAdapter {

    private List<Materia> materias;
    private Context context;

    public ListaMateriasAdapter(List<Materia> materias, Context context){
        this.materias = materias;
        this.context = context;
    }


    @Override
    public int getCount() {
        return materias.size();
    }

    @Override
    public Materia getItem(int i) {
        return materias.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Materia materia = this.getItem(i);
        RelativeLayout listItem = (RelativeLayout) inflater.inflate(R.layout.materia,null);
        ((TextView) listItem.findViewById(R.id.nombre)).setText(this.getItem(i).getNombre());
        ((TextView) listItem.findViewById(R.id.codigo)).setText(materia.getCodigo());
        if (materia.getEstado() == EstadoMateria.APROBADA) {
            ((TextView) listItem.findViewById(R.id.nota)).setText(materia.getNota());
        }
        return listItem;
    }
}
