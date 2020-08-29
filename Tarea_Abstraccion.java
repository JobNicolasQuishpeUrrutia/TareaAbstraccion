package tarea_abstraccion;
abstract class Sensor
{
    private int codigo;
    private String tipo;
    private int precision;
    private double tiempoRespuesta;
    private int medida;
    
    public Sensor(int codigo,String tipo ,int precision,double tiempoRespuesta, int medida){
        this.codigo=codigo;
        this.tipo=tipo;
        this.precision=precision;
        this.tiempoRespuesta=tiempoRespuesta;
        this.medida=medida;
    } 
    public double MedirDatos(){
        System.out.println("Medida obtenida del sensor");
        return 0.0;
    }
    public void EnviarResultadoMedicion(){
        System.out.println("Enviando el resultado con codigo "
                + this.codigo + " del sensor de " + this.tipo);
    }
    public String toString(){
        return codigo+" "+tipo+" " + precision+ " "+tiempoRespuesta+" "+medida;
    }       
    public int getCodigo(){
        return codigo;
    }        
    public String getTipo(){
        return tipo;
    }        
    public void setTipo(String nueva){
        tipo=nueva;
    }
    public int getPrecision(){
        return precision;
    }
    public double getTiempoRespuesta(){
        return tiempoRespuesta;
    }
    public int getMedida(){
        return medida;
    }
} 

class DatoMedido extends Sensor{
    private double datoMedido ;
    public DatoMedido(int codigo,String tipo ,int precision,double tiempoRespuesta, int medida, double datoMedido){
        super(codigo,tipo,precision,tiempoRespuesta,medida);
        setDatoMedido(datoMedido);
    }        
    public void EnviarResultadoMedicion(){
        System.out.println("Dentro del Metodo EnviarResultadoMedicion de la clase DatoMedido");
        System.out.println("Enviando datos con codigo --"+getCodigo()+"-- desde el sensor de "+getTipo()+ " con medida: "
                +getDatoMedido()+" y precisión del "+getPrecision()+"%\n en un tiempo de "+getTiempoRespuesta()+ "[ms]");
        System.out.println("\n Determinando la medida del sensor");
    }
    public double getDatoMedido(){
        return datoMedido;
    }        
    public void setDatoMedido(double nuevo){
        if(nuevo>= 0.0)
            datoMedido=nuevo;
    }        
    public double EntregarResultado(){
        System.out.println("Recepcion del sensor con codigo: " +getCodigo());
        return datoMedido;
    }   
}

class DatoEstablecido extends Sensor
{
    private double datoEstablecido;
    public DatoEstablecido (int codigo, String tipo, int precision,double tiempoRespuesta,
            int medida,double datoEstablecido)
    {
        super(codigo,tipo,precision,tiempoRespuesta,medida);
        setDatoEstablecido(datoEstablecido);
    }        
    public void EnviarResultadoMedicion()
    {
        System.out.println("Dentro del Metodo EnviarResultadoMedicion de la clase DatoEstablecido");
        System.out.println("El dato establecido para el sensor de " +getTipo()+" es: "
                +getDatoEstablecido()+"\n");
       
    }
        public double getDatoEstablecido()
        {
            return datoEstablecido;
        }        
        public void setDatoEstablecido(double nuevo)
        {
        if(nuevo>= 0.0)
            datoEstablecido=nuevo;
    }        
    public double MostrarDatoEstablecido()
    {
        System.out.println("Recepcion del sensor con codigo " +getCodigo());
        return datoEstablecido;
    }    
}
public class Tarea_Abstraccion {
    public static void main(String[] args) {
    
        
        System.out.println("                              Universidad de las Fuerzas Armadas ESPE ");
        System.out.println("                                           Sede Latacunga");
        System.out.println("Asignatura: Programación [7450]");
        System.out.println("Docente: Ing. Guerra Cruz Luis Alberto");
        System.out.println("Integrantes: Junior Cangui --- Nicolás Quishpe");
        System.out.println("Carrera: Ingeniería Automotriz");
        System.out.println("Tema: ABSTRACCIÓN \n");
            
        Sensor ObjetoSensor=new DatoMedido(04,"Potencia",90,5,7,150);
        Sensor ObjetoSensor1=new DatoEstablecido(04,"Potencia",90,5,7,148);
        DatoMedido ObjetoDatoMedido=new DatoMedido(10,"Voltaje",98,20,8,12);
        DatoEstablecido ObjetoDatoEstablecido=new DatoEstablecido(10,"Voltaje",98,20,8,13);
        System.out.println("_________________________________________________________________________________________________");
        System.out.println("Llamada a EnviarResultadoMedicion usando la "
                + "referencia de la clase Sensor *");
        System.out.println("_________________________________________________________________________________________________");
        ObjetoSensor.EnviarResultadoMedicion();
        ObjetoSensor1.EnviarResultadoMedicion();
        System.out.println("_________________________________________________________________________________________________");
        System.out.println("Llamada a EnviarResultadoMedicion usando la "
                + "referencia de la clase Sensor *");
        System.out.println("_________________________________________________________________________________________________");
        ObjetoDatoMedido.EnviarResultadoMedicion();
        ObjetoDatoEstablecido.EnviarResultadoMedicion();
    }
}