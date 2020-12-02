package evidencia.evi1;

import java.io.File;

public class Crear {

	
	
	
    public Crear ()//objeto para enviar los datos a esta clase
    {
    }

    public void crear()//metodo para crear archivos
    {
    	try
        {

            File resources = new File(".\\Base");
            if (!resources.exists()){
                resources.mkdir();
                System.out.println("se creo bd");
                
                
            } else {
                System.out.println("Error al crear directorio");
            }
            

        	File Agendita = new File ("./Doctor.txt");//// creamos la agenda
        	File paciente = new File ("./Paciente.txt");
        	File cita = new File ("./Cita.txt");
        	
            // Si el archivo no existe es creado
                if (!Agendita.exists()) {
                    Agendita.createNewFile();
                    System.out.println("Doctor creado");
                }else{ System.out.println("ya existe");}

                if (!paciente.exists()) {
                    paciente.createNewFile();
                    System.out.println("paciente creado");
                }else{ System.out.println("ya existe");}


                if (!cita.exists()) {
                    cita.createNewFile();
                    System.out.println("Citas creado");
                }else{ System.out.println("ya existe");}

            
        } catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }}
	
	

