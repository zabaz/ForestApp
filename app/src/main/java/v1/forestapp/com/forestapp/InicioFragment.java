package v1.forestapp.com.forestapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;


public class InicioFragment extends Fragment {

    Animation fade_in,fade_out;
    ViewFlipper viewFlipper;
    Context cnt;
    public InicioFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inicio,container, false);

        Button button = (Button) view.findViewById(R.id.btn_new);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something

                try {
                    NoticiasFragment Frag = new NoticiasFragment();
                    getActivity().getFragmentManager().beginTransaction().replace(R.id.content_frame,Frag).commit();
                }catch (Exception ex){
                    Snackbar.make(container,"Error : " + ex.getMessage() ,Snackbar.LENGTH_LONG).show();
                }
            }
        });
        Button button1 = (Button) view.findViewById(R.id.btn_inventario);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something

                try {
                    ListaInventarioFragment Frag = new ListaInventarioFragment();
                    getActivity().getFragmentManager().beginTransaction().replace(R.id.content_frame,Frag).commit();
                }catch (Exception ex){
                    Snackbar.make(container,"Error : " + ex.getMessage() ,Snackbar.LENGTH_LONG).show();
                }
            }
        });

        Button button2 = (Button) view.findViewById(R.id.btn_qr);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something

                try {
                    QRFragment Frag = new QRFragment();
                    getActivity().getFragmentManager().beginTransaction().replace(R.id.content_frame,Frag).commit();
                }catch (Exception ex){
                    Snackbar.make(container,"Error : " + ex.getMessage() ,Snackbar.LENGTH_LONG).show();
                }
            }
        });

        cnt = getActivity().getApplicationContext();

        viewFlipper = (ViewFlipper)view.findViewById(R.id.bckgrndViewFlipper1);

        fade_in = AnimationUtils.loadAnimation(cnt,android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(cnt,android.R.anim.fade_out);

        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();


        return view;


    }


}