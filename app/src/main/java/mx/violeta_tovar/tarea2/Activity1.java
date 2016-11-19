package mx.violeta_tovar.tarea2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;



public class Activity1 extends AppCompatActivity {

    EditText guardado_nombre;
    EditText guardado_telefono;
    EditText guardado_email;
    EditText guardado_descripcion;


    Button boton;
    DatePicker guardado_fecha;

     int year;
     int month;
     int day;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        guardado_nombre = (EditText) findViewById(R.id.nombre_text);
        guardado_telefono = (EditText) findViewById(R.id.telefono_caja);
        guardado_email = (EditText) findViewById(R.id.email_caja);
        guardado_descripcion = (EditText) findViewById(R.id.descripcion_caja);

        boton = (Button) findViewById(R.id.button);
       guardado_fecha = (DatePicker) findViewById(R.id.datePicker);


            boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String guardado_nombre_s = guardado_nombre.getText().toString();
                String guardado_telefono_s = guardado_telefono.getText().toString();
                String guardado_email_s = guardado_email.getText().toString();
                String guardado_descripcion_s = guardado_descripcion.getText().toString();


                        month=guardado_fecha.getMonth()+1;
                        year=guardado_fecha.getYear();
                        day=guardado_fecha.getDayOfMonth();

                Intent intent = new Intent(Activity1.this, Activity2.class);

                intent.putExtra(getResources().getString(R.string.nombre_env), guardado_nombre_s);
                intent.putExtra(getResources().getString(R.string.dia_env), day);
                intent.putExtra(getResources().getString(R.string.año_env), year);
                intent.putExtra(getResources().getString(R.string.mes_env), month);
                intent.putExtra(getResources().getString(R.string.telefono_env), guardado_telefono_s);
                intent.putExtra(getResources().getString(R.string.email_env), guardado_email_s);
                intent.putExtra(getResources().getString(R.string.descripcion_env), guardado_descripcion_s);

               startActivity(intent);


            }


        });


    }

            }





















