package mundo.busca_el_tesoro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Atributos
    public static Jugador p1 = new Jugador();
    public static Jugador p2 = new Jugador();
    private EditText txtNombreJ1;
    private EditText txtNombreJ2;
    private Button btnJugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initComponents();
        jugar();


    }

    //Inicia los atributos
    private void initComponents(){
        txtNombreJ1=(EditText)findViewById(R.id.txtNombreJ1);
        txtNombreJ2=(EditText)findViewById(R.id.txtNombreJ2);
        btnJugar=(Button)findViewById(R.id.btnJugar);
    }

    //Inicia el MenuActivity donde comienza el juego
    public void jugar(){
        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNombres();
                Intent intento = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intento);
            }
        });
    }
    //Añade los nombres a los objetos p1 y p2
    public void addNombres(){
        String temp1="jugador 1";
        String temp2="jugador 2";
        if(!txtNombreJ1.getText().toString().equals("") && !txtNombreJ2.getText().toString().equals("")){
            p1.setNombre(txtNombreJ1.getText().toString());
            p2.setNombre(txtNombreJ2.getText().toString());
        }if(txtNombreJ1.getText().toString().equals("") && !txtNombreJ2.getText().toString().equals("")){
            p1.setNombre(temp1);
            p2.setNombre(txtNombreJ2.getText().toString());
        }if(!txtNombreJ1.getText().toString().equals("") && txtNombreJ2.getText().toString().equals("")){
            p1.setNombre(txtNombreJ1.getText().toString());
            p2.setNombre(temp2);
        }if (txtNombreJ1.getText().toString().equals("") && txtNombreJ2.getText().toString().equals("")){
            p1.setNombre(temp1);
            p2.setNombre(temp2);
        }
    }
}
