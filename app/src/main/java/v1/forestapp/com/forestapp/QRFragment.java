package v1.forestapp.com.forestapp;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class QRFragment extends Fragment implements ZXingScannerView.ResultHandler {

    private ZXingScannerView mScannerView;

    public QRFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el diseño de este fragmento.
        View Vista = inflater.inflate(R.layout.fragment_qr, container, false);

        mScannerView = new ZXingScannerView(Vista.getContext());//Mediante programacion inicia la vista del scanner.

        mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
        mScannerView.startCamera();         // Inicia la camara

        return mScannerView;
    }

    @Override
    public void handleResult(Result rawResult) {
        Log.e("handler", rawResult.getText()); //Imprime los resultados del análisis.
        Log.e("handler", rawResult.getBarcodeFormat().toString()); //Imprime el formato de exploración(qrcode)

        //Muestra el resultado del escáner en el cuadro de diálogo .
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());
        builder.setTitle("");
        builder.setMessage(rawResult.getText());
        AlertDialog alert1 = builder.create();
        alert1.show();
        //Reanuda la camara para scannear nuevamente.
        mScannerView.resumeCameraPreview(this);
    }
}
