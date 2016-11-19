package mx.violeta_tovar.tarea2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    Button boton2;

    String cadena1;
    String cadena2;
    String cadena3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        boton2 = (Button)findViewById(R.id.button2);

        Bundle parametros =getIntent().getExtras();

        String nombre_rec=parametros.getString(getResources().getString(R.string.nombre_env));

        int año_rec=parametros.getInt(getResources().getString(R.string.año_env));
        cadena1= Integer.toString(año_rec);

        int mes_rec=parametros.getInt(getResources().getString(R.string.mes_env));
        cadena2= Integer.toString(mes_rec);

        int dia_rec=parametros.getInt(getResources().getString(R.string.dia_env));
        cadena3= Integer.toString(dia_rec);



        String telefono_rec=parametros.getString(getResources().getString(R.string.telefono_env));
        String email_rec=parametros.getString(getResources().getString(R.string.email_env));
        String descripcion_rec=parametros.getString(getResources().getString(R.string.descripcion_env));

        TextView tvNombre =(TextView)findViewById(R.id.textView3);
        TextView tvFecha =(TextView)findViewById(R.id.textView5);
        TextView tvTelefono =(TextView)findViewById(R.id.textView7);
        TextView tvEmail =(TextView)findViewById(R.id.textView9);
        TextView tvDescripcion =(TextView)findViewById(R.id.textView11);

        tvNombre.setText(nombre_rec);
        tvFecha.setText(new StringBuilder().append(cadena3).append("/")
                .append(cadena2).append("/").append(cadena1));
       tvTelefono.setText(telefono_rec);
        tvEmail.setText(email_rec);
       tvDescripcion.setText(descripcion_rec);


        boton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                onBackPressed();


            }
        });

    }

     }
