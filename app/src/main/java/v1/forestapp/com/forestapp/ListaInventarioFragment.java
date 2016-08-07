package v1.forestapp.com.forestapp;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaInventarioFragment extends Fragment {

    ListaInventarioFragment adaptador;

    public ListaInventarioFragment() {
        // Required empty public constructor
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.principal, menu);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.action_search));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        super.onCreateOptionsMenu(menu,inflater);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View vista = inflater.inflate(R.layout.fragment_lista_inventario, container, false);

        ListView lista;
        final String [] menuItems = {
                "Achote o Achoite",
                "Cañaguate",
                "Mango Hilaza",
                "Mango de Manzana",
                "Almendro",
                "Caracolí",
                "Caña dulce",
                "Ceiba",
                "Guarumo",
                "Algarrubillo",
                "Manzanillo",
                "Mataraton",
                "Palma Estera",
                "Puy",
                "Totumo"
        };

        lista = (ListView) vista.findViewById(R.id.listViewInventario2);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,menuItems);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long l) {
                Toast.makeText(getActivity(), menuItems[position], Toast.LENGTH_SHORT).show();
            }
        });
                return vista;
    }
}




