package v1.forestapp.com.forestapp;


import android.app.FragmentManager;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AcercaFragment extends Fragment {


    public AcercaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        FragmentManager fm = getFragmentManager();
        DialogFragmentAcerca dialogFragment = new DialogFragmentAcerca ();
        dialogFragment.show(fm, "Sample Fragment");

        return inflater.inflate(R.layout.fragment_acerca, container, false);
    }

}
