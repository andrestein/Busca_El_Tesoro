package mundo.busca_el_tesoro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class PreguntaActivity extends AppCompatActivity {

    //Atributos
    private TextView lbPregunta;
    private RadioButton rBtnOpcion1;
    private RadioButton rBtnOpcion2;
    private RadioButton rBtnOpcion3;
    private RadioButton rBtnOpcion4;
    private Button btnValidar;
    private ArrayList<Pregunta>preguntas;
    private Pregunta pregunta0;
    private Pregunta pregunta1;
    private Pregunta pregunta2;
    private Pregunta pregunta3;
    private Pregunta pregunta4;
    private Pregunta pregunta5;
    private Pregunta pregunta6;
    private Pregunta pregunta7;
    private Pregunta pregunta8;
    private Pregunta pregunta9;
    private Pregunta pregunta10;
    private Pregunta pregunta11;
    private Pregunta pregunta12;
    private Pregunta pregunta13;
    private Pregunta pregunta14;
    private Pregunta pregunta15;
    private Pregunta pregunta16;
    private Pregunta pregunta17;
    private Pregunta pregunta18;
    private Pregunta pregunta19;
    private Pregunta pregunta20;
    private Pregunta pregunta21;
    private Pregunta pregunta22;
    private Pregunta pregunta23;
    private Pregunta preguntaActual;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initComponents();
        mostrarPregunta();
        validar();
    }

    //Este metodo valida la opcion elegida en los radio buttons si es la correcta
    public void validar(){
        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rBtnOpcion1.isChecked()) {
                    if (rBtnOpcion1.getText().equals(preguntaActual.getRespuesta())) {
                        Toast.makeText(getApplicationContext(), "Se respondio con exito", Toast.LENGTH_SHORT).show();
                        if (MenuActivity.turno % 2 == 0) {
                            MainActivity.p1.setPuntaje(MainActivity.p1.getPuntaje() + preguntaActual.getDif());
                            MenuActivity.txtPuntajeJ1.setText("" + MainActivity.p1.getPuntaje());
                        } else {
                            MainActivity.p2.setPuntaje(MainActivity.p2.getPuntaje() + preguntaActual.getDif());
                            MenuActivity.txtPuntajeJ2.setText("" + MainActivity.p2.getPuntaje());
                        }
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Suerte a la proxima", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
                if (rBtnOpcion2.isChecked()) {
                    if (rBtnOpcion2.getText().equals(preguntaActual.getRespuesta())) {
                        Toast.makeText(getApplicationContext(), "Se respondio con exito", Toast.LENGTH_SHORT).show();
                        if (MenuActivity.turno % 2 == 0) {
                            MainActivity.p1.setPuntaje(MainActivity.p1.getPuntaje() + preguntaActual.getDif());
                            MenuActivity.txtPuntajeJ1.setText("" + MainActivity.p1.getPuntaje());
                        } else {
                            MainActivity.p2.setPuntaje(MainActivity.p2.getPuntaje() + preguntaActual.getDif());
                            MenuActivity.txtPuntajeJ2.setText("" + MainActivity.p2.getPuntaje());
                        }
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Suerte a la proxima", Toast.LENGTH_SHORT).show();
                        finish();
                    }

                }
                if (rBtnOpcion3.isChecked()) {
                    if (rBtnOpcion3.getText().equals(preguntaActual.getRespuesta())) {
                        Toast.makeText(getApplicationContext(), "Se respondio con exito", Toast.LENGTH_SHORT).show();
                        if (MenuActivity.turno % 2 == 0) {
                            MainActivity.p1.setPuntaje(MainActivity.p1.getPuntaje() + preguntaActual.getDif());
                            MenuActivity.txtPuntajeJ1.setText("" + MainActivity.p1.getPuntaje());
                        } else {
                            MainActivity.p2.setPuntaje(MainActivity.p2.getPuntaje() + preguntaActual.getDif());
                            MenuActivity.txtPuntajeJ2.setText("" + MainActivity.p2.getPuntaje());
                        }
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Suerte a la proxima", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
                if (rBtnOpcion4.isChecked()) {
                    if (rBtnOpcion4.getText().equals(preguntaActual.getRespuesta())) {
                        Toast.makeText(getApplicationContext(), "Se respondio con exito", Toast.LENGTH_SHORT).show();
                        if (MenuActivity.turno % 2 == 0) {
                            MainActivity.p1.setPuntaje(MainActivity.p1.getPuntaje() + preguntaActual.getDif());
                            MenuActivity.txtPuntajeJ1.setText("" + MainActivity.p1.getPuntaje());
                        } else {
                            MainActivity.p2.setPuntaje(MainActivity.p2.getPuntaje() + preguntaActual.getDif());
                            MenuActivity.txtPuntajeJ2.setText("" + MainActivity.p2.getPuntaje());
                        }
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Suerte a la proxima", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
            }
        });
    }

    public int numeroAleatorio(int b){
        for(int i=0; i<MenuActivity.numPregunta.length;i++){
            if(MenuActivity.numPregunta[i] == b){
                Random r = new Random();
                b=r.nextInt(23);
                numeroAleatorio(b);
            }else{
                MenuActivity.numPregunta[i]=b;
            }
        }
        return b;
    }

    // Muestra la pregunta elegida aleatoriamente
    public void mostrarPregunta(){
        Random r = new Random();
        int b=r.nextInt(23);
        numeroAleatorio(b);
        for (Pregunta pregunta:preguntas
             ) {
            if(pregunta.getId() == b){
                lbPregunta.setText(pregunta.getPregunta());
                rBtnOpcion1.setText(pregunta.getOp1());
                rBtnOpcion2.setText(pregunta.getOp2());
                rBtnOpcion3.setText(pregunta.getOp3());
                rBtnOpcion4.setText(pregunta.getOp4());
                preguntaActual = pregunta;
            }
        }

    }
    //Inicia todos los atributos
    private void initComponents(){
        preguntas = new ArrayList<>();
        preguntas.add(pregunta0 = new Pregunta(0,"¿ Cuando se instalo el primer semaforo ?",""+1868,""+1990,""+1997,""+1870,""+1868,5));
        preguntas.add(pregunta1 = new Pregunta(1,"¿ En que pais de Europa se trabaja menos ?","España","Italia","Russia","Paises Bajos","Paises Bajos",4));
        preguntas.add(pregunta2 = new Pregunta(2,"¿ Quien 'sabia que no sabia nada' ?","Aristoteles","Sócrates","Ortega","Gasset","Socrates",3));
        preguntas.add(pregunta3 = new Pregunta(3,"¿ Con que se fabricaba el pergamino ?","Con piel de animales","Con tiras de madera","Con hojas de arbusto","Con hierva","Con piel de animales",4));
        preguntas.add(pregunta4 = new Pregunta(4,"¿ Que pais no tiene el euro como moneda ?","Portugal","Francia","Suiza","Paises Bajos","Suiza",2));
        preguntas.add(pregunta5 = new Pregunta(5,"¿ En cuantos estados pueden aparecer los elementos ?","En dos","En tres","Almenos en cuatro","En una","Almenos en cuatro",1));
        preguntas.add(pregunta6 = new Pregunta(6,"¿ Qu  e era el Concorde ?","Un tren bala","Un helicoptero","Un transbordador espacial","Un avion supersonico","Un avion supersonico",4));
        preguntas.add(pregunta7 = new Pregunta(7,"¿ Que enfermedad se considera erradicada ?","Peste","Viruela","Colera","Hepatitis","Viruela",5));
        preguntas.add(pregunta8 = new Pregunta(8,"¿ Cual es el primero de la lista de numeros primos ?","El 1","El 2","El 3","El 4","El 2",1));
        preguntas.add(pregunta9 = new Pregunta(9,"¿ Cual es la moneda oficial Panama?","El dolar panameño","El dolar estadounidense","El balboa","El peso","El balboa",2));
        preguntas.add(pregunta10 = new Pregunta(10,"¿ A que Ciudad-Estado pertenecia la localidad de Leonardo Da Vinci ?","Venecia","Florencia","Milan","Roma","Florencia",4));
        preguntas.add(pregunta11 = new Pregunta(11,"¿ Cuál de las siguientes afirmaciones sobre los virus es incorrecta ?","Estan vivos","Se multiplican","No tienen metabolismo","No mueren","Estan vivos",3));
        preguntas.add(pregunta12 = new Pregunta(12,"¿ En que no cree un budista ?","En la reencarnacion","En el nirvana","En un dios","En la muerte","En un dios",1));
        preguntas.add(pregunta13 = new Pregunta(13,"¿ Que le sucede a la energia ?","Se consume","Se transforma","Se destruye","Explota","Se transforma",1));
        preguntas.add(pregunta14 = new Pregunta(14,"¿ Como muere don Quijote ?","Se cae del caballo cuando acomete al molino que confunde con un gigante","En un enfrentamiento con bandoleros","En la cama","en la guerra","En la cama",5));
        preguntas.add(pregunta15 = new Pregunta(15,"¿ La china es un regimen ?","Comunista","Maoísta","Capitalista","Socialista","Comunista",5));
        preguntas.add(pregunta16 = new Pregunta(16,"¿ Cual de los siguientes no es un modo verbal ?","El indicativo","El subjuntivo","El imperfecto","Ninguna de las anteriores","El Imperfecto",3));
        preguntas.add(pregunta17 = new Pregunta(17,"¿ De cuantos vertices se trata el teorema de Pitagoras ?","De cuatro","De tres","De cinco","De dos","De tres",1));
        preguntas.add(pregunta18 = new Pregunta(18,"¿ A que edificio trepó King Kong ?","La casa blanca","El empire state","La torre eiffel","La alpujarra","El empire state",3));
        preguntas.add(pregunta19 = new Pregunta(19,"¿ Que empresario cuenta la historia de la pelicula La red social ?","Bill Gates","Mark Zuckerberg","Steve Jobs","Donal Trump","Mark Zuckerberg",5));
        preguntas.add(pregunta20 = new Pregunta(20,"¿ Que miembros de los Beatles siguen vivos ?","Todos","Ringo Starr y Paul McCartney","Paul McCartney y George Harrison","Todos menos John Lennon","Paul McCartney y George Harrison",3));
        preguntas.add(pregunta21 = new Pregunta(21,"¿ De que material es la informacion genetica del ADN ?","Péptidos","Nucleotidos","Proteinas","Vitaminas","Nucleotidos",4));
        preguntas.add(pregunta22 = new Pregunta(22,"¿ Cual es el combustible utilizado en la mayoria de centrales nucleares ?","Uranio","Plutonio","Helio","Hierro","Uranio",5));
        preguntas.add(pregunta23 = new Pregunta(23,"¿ Que se coloca entre dos numeros de una direccion de IP ?","Puntos","Doble barra","Guiones","Slash","Puntos",4));

        lbPregunta = (TextView)findViewById(R.id.lbPregunta);
        rBtnOpcion1 = (RadioButton)findViewById(R.id.rBtnOpcion1);
        rBtnOpcion2 = (RadioButton)findViewById(R.id.rBtnOpcion2);
        rBtnOpcion3 = (RadioButton)findViewById(R.id.rBtnOpcion3);
        rBtnOpcion4 = (RadioButton)findViewById(R.id.rBtnOpcion4);
        btnValidar = (Button)findViewById(R.id.btnValidar);
    }

}
