package mundo.busca_el_tesoro;

/**
 * Created by LENOVO on 21/03/2016.
 */
public class Pregunta {

    //Atributos
    private int id;
    private String pregunta;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    private String respuesta;
    private int dif;

    //Constructor
    public Pregunta(int id, String pregunta, String op1, String op2, String op3, String op4, String respuesta,int dif){
        this.id = id;
        this.pregunta=pregunta;
        this.op1=op1;
        this.op2=op2;
        this.op3=op3;
        this.op4=op4;
        this.respuesta=respuesta;
        this.dif = dif;
    }

    //Metodos accesores
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public int getDif() {
        return dif;
    }

    public void setDif(int dif) {
        this.dif = dif;
    }
}
