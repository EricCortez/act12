package evidencia.evi1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	

int x=0;

	Crear archi=new Crear();
	archi.crear();
	
        Scanner entrada = new Scanner(System.in);
        System.out.println("usuario:");
        String u = entrada.nextLine();


        System.out.println("contraseña:");
        String c = entrada.nextLine();
        if (u.equals("admin")){

            if(c.equals("1234")){

           
              do {

            	  
                  System.out.println("manejo de archivos de texto  \n   "+"1 añadir doctor\n "+"2 añadir paciente \n "+"3 lista \n "+ ""+"4 hacer cita\n "+"5 salir\n ");
                  x = entrada.nextInt();
                  switch (x) {
                      case 1:

                          System.out.println("=============================================Añadir Doctor=====================================================");
                          System.out.println("ingresa id");
                          String numero = entrada.next();
                          System.out.println("ingresa nombre");
                          String nom = entrada.next();
                          System.out.println("ingresa especialidad");
                          String es = entrada.next();

                          Properties pro = new Properties();
                          try {

//./Base/Doctor.txt
                              pro.load(new FileInputStream("./evi1/Base/Doctor.txt"));
                              
                              pro.get("user");
                              
                              pro.list(System.out);
                              
                              pro.setProperty(numero, nom + " " + es);
                             
                              pro.store(new FileOutputStream("./evi1/Base/Doctor.txt"), null);

                          } catch (IOException e) {
                          }

                          break;
                      case 2:
                          System.out.println("=============================================Añadir Paciente=====================================================");
                          System.out.println("ingresa numero ");
                          String numero1 = entrada.next();
                          System.out.println("ingresa nombre");
                          String nom1 = entrada.next();
                          //System.out.println("i");
                          //String es=entrada.next();

                          Properties pro1 = new Properties();
                          try {


                              pro1.load(new FileInputStream("./evi1/Base/Paciente.txt"));
                             
                              pro1.list(System.out);
                              pro1.setProperty(numero1, nom1);
                              pro1.store(new FileOutputStream("./evi1/Base/Paciente.txt"), null);

                          } catch (IOException e) {
                          }

                          break;
                      case 3:
                    	  
                    	  Properties pro4 = new Properties();
                    	  Properties pro5 = new Properties();
                    	  
					try {
						pro4.load(new FileInputStream("./evi1/Base/Paciente.txt"));
					
					      pro4.list(System.out);
					      
					  	pro5.load(new FileInputStream("./evi1/Base/Doctor.txt"));
						
					      pro5.list(System.out);
					      
					      
					
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                          
                                       	  

                          break;
                      case 4:

                          System.out.println("=============================================Agendar Cita=====================================================");


                          System.out.println("ingresa id del doctor ");
                          String numero2 = entrada.next();
                          System.out.println("ingresa id usuario");
                          String nom2 = entrada.next();
                          System.out.println("fecha de la cita ");
                          String data=entrada.next();
                          
                          try {

                          
                          
                          
                          Properties pro2 = new Properties();
                          Properties pro3=new Properties();
                          Properties size=new Properties();
                          
//                          PrintWriter writer = new PrintWriter(System.out);
                          

                          size.load(new FileInputStream("./evi1/Base/Cita.txt"));
                          
                         int contador= size.size()+1;
                          
                          String contadorletra=String.valueOf(contador);
                          System.out.println("Lista de doc");
                          
                          pro2.list(System.out);
                          
                          
                          System.out.println("Lista de pacientes");
                          pro3.list(System.out);

                          
                          
                      	

  
                        	 // String doc=   (String) pro2.get(numero2);
                        	  String pac= (String) pro3.get(nom2);
                        	  
                        	  String valor="doctor "+numero2+" paciente "+pac+" Fecha "+data;
                              pro2.load(new FileInputStream("./evi1/Base/Paciente.txt"));
                              // pro.get("user");
                             
                              
                            //  pro2.list(System.out);
                              pro2.setProperty(contadorletra,valor );
                              pro2.store(new FileOutputStream("./evi1/Base/Cita.txt"), null);
                              
                              

                          } catch (IOException e) {
                          
                          }
                    	  
                          break;
                      case 5:
System.out.println("gracias");
                          break;
                      default:
                          throw new IllegalStateException("Unexpected value: " + x);
                  }
              }while (x!=5);

            }//if
        }// if
        else{System.out.println(" ingresa un usuario y contraseña validos");
        }





	}//main

}//class
