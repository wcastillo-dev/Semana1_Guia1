package pe.edu.upc.androidapp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Activity1 extends Activity implements View.OnClickListener{
    EditText txtUsuario,txtPassword;
    TextView txtMensaje;
    Button btnIngresar, btnRecuperar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        //Las referencias de los elementos que queremos interactuar
        txtUsuario = (EditText) this.findViewById(R.id.etAct1Nombre);
        txtPassword = (EditText) this.findViewById(R.id.etAct1Password);
        btnIngresar = (Button) this.findViewById(R.id.btnAct1Ingresar);
        btnRecuperar = (Button) this.findViewById(R.id.btnAct1RecuraUsu);
        txtMensaje = (TextView) this.findViewById(R.id.tvAct1Mensaje);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this, Activity2.class);
                if (txtUsuario.getText().toString().equals("")){
                    txtMensaje.setText("No ingreso el Nombre de Usuario");
                }else if(txtPassword.getText().toString().equals("")){
                    txtMensaje.setText("No ingreso el Password");
                }else {
                    txtMensaje.setText(":D");
                    Toast.makeText(Activity1.this, "Datos Correctos Gracias", Toast.LENGTH_SHORT).show();
                    //Enviando Datos del EditTextView
                    intent.putExtra("info", txtUsuario.getText().toString());
                    startActivity(intent);
                }
            }
        });
        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this, Activity3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
    }
}