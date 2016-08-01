package v1.forestapp.com.forestapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;

/**
 * Created by Admin_Sena on 28/07/2016.
 */
public class DialogFragmentAcerca extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Acerca de");
        builder.setMessage("Ingrese alguna información aquí..");

        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                try {
                    InicioFragment Frag = new InicioFragment();
                    getActivity().getFragmentManager().beginTransaction().replace(R.id.content_frame,Frag).commit();
                }catch (Exception ex){
                }
            }
        });

        return builder.create();
    }
}
