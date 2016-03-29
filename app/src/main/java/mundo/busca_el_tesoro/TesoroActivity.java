package mundo.busca_el_tesoro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;

public class TesoroActivity extends AppCompatActivity {

    //Atributos
    private TextView lbNombre;
    private TextView lbNombre2;
    private EditText txtPuntaje1;
    private EditText txtPuntaje2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tesoro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initComponents();
        addNombresPuntajes();
    }

    // añade los nombres y los puntajes de cada jugador
    public void addNombresPuntajes(){
        lbNombre.setText(MainActivity.p1.getNombre());
        lbNombre2.setText(MainActivity.p2.getNombre());
        txtPuntaje1.setText(MenuActivity.txtPuntajeJ1.getText());
        txtPuntaje2.setText(MenuActivity.txtPuntajeJ2.getText());
    }

    //Inicia los atributos
    private void initComponents(){
        lbNombre=(TextView)findViewById(R.id.lbNombre1);
        lbNombre2=(TextView)findViewById(R.id.lbNombre2);
        txtPuntaje1 =(EditText)findViewById(R.id.txtPuntaje);
        txtPuntaje2=(EditText)findViewById(R.id.txtPuntaje2);
    }

}
