package pe.edu.upc.androidapp1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class Activity2 extends Activity {
    TextView tvDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        //Las Referencia de los elementos que queremos interactuar
        tvDatos = (TextView) this.findViewById(R.id.tvAct2Dato);

        Bundle Bundle = getIntent().getExtras();
        String DatosConseguidos = Bundle.getString("info").toString();
        tvDatos.setText(DatosConseguidos);
    }
}
