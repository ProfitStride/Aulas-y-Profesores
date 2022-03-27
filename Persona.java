package AlumnosProfesores;

public abstract class Persona {
    
    protected String nombre;
    public char sexo;
    private int edad;
    private boolean asistencia;
    //CONSTANTES 
    private final String[] NOMBRES_CHICOS = {"Nacho", "Fernando", "Alvaro", "Carlos", "Alonso"};
    private final String[] NOMBRES_CHICAS = {"Laura", "Ashley", "Sofia", "Apolonia", "Elena"};
    private final int CHICO= 0;
    private final int CHICA = 1;

    public Persona(){
        
        int determinar_sexo= MetodosSueltos.generaNumeroAleatorio(0,1);

        //si es 0 es chico
        if (determinar_sexo ==0) {
            nombre = NOMBRES_CHICOS[MetodosSueltos.generaNumeroAleatorio(0, 4)];
            sexo = 'H';
        }else{
            nombre = NOMBRES_CHICAS[MetodosSueltos.generaNumeroAleatorio(0, 4)];
            sexo = 'M';
        }
        disponibilidad();

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public boolean isAsistencia(){
        return asistencia;
    }

    public void setAsistencia(boolean asistencia){
        this.asistencia = asistencia;
    }

    public abstract void disponibilidad();
}
