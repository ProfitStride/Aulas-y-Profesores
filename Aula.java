package AlumnosProfesores;

import java.util.concurrent.ConcurrentNavigableMap;

public class Aula {
    
    private int id;
    private Profesor profesor;
    private Alumno[] alumno;
    private String materia;

    private final int MAX_ALUMNO = 20;

    public Aula(){
        id = 1;

        profesor = new Profesor();

        alumno = new Alumno[MAX_ALUMNO];
        creaAlumno();
        materia = Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0, 2)];

    }

    private void creaAlumno(){
        for (int i = 0; i < alumno.length; i++) {
            
            alumno[i] = new Alumno();


        }
    }
    private boolean asistenciaAlumnos(){
        int cuentaAsistencia = 0;
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i].isAsistencia()) {
                cuentaAsistencia++;
            }
        } 
            return cuentaAsistencia>=((int)(MAX_ALUMNO/2));
    }

    public boolean darClase(){
        if(profesor.isAsistencia()){
            System.out.println("El profesor no esta, no se puede dar clase");
            return false;
        }else if(profesor.getMateria().equals(materia)){
            System.out.println("La materia del profesor y del aula no es la misma");
            return false;
        } else if(!asistenciaAlumnos()){
            System.out.println("La asistencia no es suficiente, no se puede dar clase");
            return false;
        }
            System.out.println("Se puede dar clase");
            return true;
        }

        public void notas(){

            int chicosApro=0;
            int chicasApro=0;

            for (int i = 0; i < alumno.length; i++) {
                if (alumno[i].getNota()>=5) {
                    if (alumno[i].getSexo()=='H') {
                        chicosApro++;
                    }else{
                        chicasApro++;
                    }
                    System.out.println(alumno[i].toString());
                }
            }

            System.out.println("Hay "+chicosApro+"chicos y "+chicasApro+" chicas aprobados/aprobadas");

        }
    } 
