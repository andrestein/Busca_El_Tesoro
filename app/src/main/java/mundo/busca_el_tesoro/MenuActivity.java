package mundo.busca_el_tesoro;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MenuActivity extends AppCompatActivity {

    //Atributos
    private ArrayList<Button>botones;
    private EditText txtNombrePuntajeJ1;
    private EditText txtNombrePuntajeJ2;
    public static TextView txtPuntajeJ1;
    public static TextView txtPuntajeJ2;
    public static  int numPregunta[];
    public static int turno;
    private Tesoro tesoro;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;
    private Button btn17;
    private Button btn18;
    private Button btn19;
    private Button btn20;
    private Button btn21;
    private Button btn22;
    private Button btn23;
    private Button btn24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initcomponents();
        pista();
        botones(botones);
    }

    //Este metodo envia un mesaje indicando una pista de donde esta el tesoro
    public void pista(){
        if(tesoro.getNumero()%2 == 0){
            Toast.makeText(getApplicationContext(), "El tesoro se encuentra en un numero par", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"El tesoro se encuentra en un numero impar",Toast.LENGTH_LONG).show();
        }
    }

    //Este metodo pinta los botones de color del jugador y inicia un activity si se encontro el tesoro de lo contrario otro activity para las preguntas
    public void botones(ArrayList<Button>botones){
        for (final Button boton:botones
             ) {
            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String temp = ""+tesoro.getNumero();
                    if (turno%2 == 0){
                        boton.setTextColor(Color.BLUE);
                    }else{
                        boton.setTextColor(Color.RED);
                    }
                    if(boton.getText().toString().equals(temp)){
                        Intent intento = new Intent(getApplicationContext(),TesoroActivity.class);
                        startActivity(intento);
                    }else{
                        Intent intento = new Intent(getApplicationContext(),PreguntaActivity.class);
                        startActivity(intento);
                    }
                    turno++;
                }
            });

        }
    }

    //Inicia los atributos
    private void initcomponents(){
        botones = new ArrayList<>();
        botones.add(btn0=(Button)findViewById(R.id.btn0));
        botones.add(btn1=(Button)findViewById(R.id.btn1));
        botones.add(btn2=(Button)findViewById(R.id.btn2));
        botones.add(btn3=(Button)findViewById(R.id.btn3));
        botones.add(btn4=(Button)findViewById(R.id.btn4));
        botones.add(btn5=(Button)findViewById(R.id.btn5));
        botones.add(btn6=(Button)findViewById(R.id.btn6));
        botones.add(btn7=(Button)findViewById(R.id.btn7));
        botones.add(btn8=(Button)findViewById(R.id.btn8));
        botones.add(btn9=(Button)findViewById(R.id.btn9));
        botones.add(btn10=(Button)findViewById(R.id.btn10));
        botones.add(btn11=(Button)findViewById(R.id.btn11));
        botones.add(btn12=(Button)findViewById(R.id.btn12));
        botones.add(btn13=(Button)findViewById(R.id.btn13));
        botones.add(btn14=(Button)findViewById(R.id.btn14));
        botones.add(btn15=(Button)findViewById(R.id.btn15));
        botones.add(btn16=(Button)findViewById(R.id.btn16));
        botones.add(btn17=(Button)findViewById(R.id.btn17));
        botones.add(btn18=(Button)findViewById(R.id.btn18));
        botones.add(btn19=(Button)findViewById(R.id.btn19));
        botones.add(btn20=(Button)findViewById(R.id.btn20));
        botones.add(btn21=(Button)findViewById(R.id.btn21));
        botones.add(btn22=(Button)findViewById(R.id.btn22));
        botones.add(btn23=(Button)findViewById(R.id.btn23));
        botones.add(btn24=(Button)findViewById(R.id.btn24));

        txtNombrePuntajeJ1=(EditText)findViewById(R.id.txtNombrePuntajeJ1);
        txtNombrePuntajeJ2=(EditText)findViewById(R.id.txtNombrePuntajeJ2);

        txtPuntajeJ1=(EditText)findViewById(R.id.txtPuntajeP1);
        txtPuntajeJ2=(EditText)findViewById(R.id.txtPuntajeP2);

        numPregunta = new int [23];

        for (Button boton:botones
             ) {
            Random r = new Random();
            int i = r.nextInt(101);
            boton.setText(""+i);
        }

        txtNombrePuntajeJ1.setText(MainActivity.p1.getNombre());
        txtNombrePuntajeJ2.setText(MainActivity.p2.getNombre());

        for(int i = 0; i<botones.size();i++){
            for (int j = 0;j<botones.size();j++){
                if(botones.get(i).getText().equals(botones.get(j).getText())){
                    Random r = new Random();
                    int m = r.nextInt(101);
                    botones.get(i).setText(""+(m+1));
                }
            }
        }

        turno =1;
        Random r= new Random();
        int b = r.nextInt(25);
        tesoro = new Tesoro(Integer.parseInt(botones.get(b).getText().toString()));
    }
}
