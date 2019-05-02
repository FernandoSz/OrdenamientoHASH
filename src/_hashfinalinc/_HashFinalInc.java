package _hashfinalinc;
import java.util.*;
public class _HashFinalInc {

    public static void main(String[] args) {
      Scanner Fer = new Scanner(System.in);
      String tamaño;
      int Tamaño=0;
      String buscar;
      int Buscar;
      String dato;
      int Dato;
      String menu;
      int Menu = 0;
      int Arreglo [] =null;
      Hash RF = new Hash();
      int Maximo;
      while(Menu!=5){
          System.out.println("\n\t\033[31mMenu:");
          System.out.println("1.-Crear Arreglo.");
          System.out.println("2.-Agregar Dato.");
          System.out.println("3.-Buscar Dato.");
          System.out.println("4.-Imprimir Arreglo.");
          System.out.println("\033[31m5.-Salir");
          menu = Fer.nextLine();
          if(menu.matches("[1-t]")){
              Menu = Integer.parseInt(menu);
              switch(Menu){
                  case 1:{
                      System.out.println("\n\t\033[34mIngrese El Tamaño Para El Arreglo");
                      tamaño = Fer.nextLine();
                      if(tamaño.matches("[0-9]*")){
                          Tamaño = Integer.parseInt(tamaño);
                          Arreglo = new int [Tamaño];
                          Maximo = Arreglo.length;
                      }
                      else{
                          System.out.println("\033[31mError De Datos.");
                      }
                      break;
                  }
                  case 2:{
                      
                      System.out.println("Ingrese El Dato a Guardar:");
                      dato = Fer.nextLine();
                      if(dato.matches("[0-9]*")){
                          Dato = Integer.parseInt(dato);
                         RF.Agregar(Arreglo, Dato);
                        
                          
                          
                      }
                      else{
                          System.out.println("\033[31mError De Datos");
                      }
                      break;
                  }
                  case 3:{
                      if(Arreglo!=null){
                      System.out.println("\n\t\033[34mIngresa El Dato A Buscar Dentro Del Arreglo.");
                      buscar = Fer.nextLine();
                      if(buscar.matches("[0-9]*")){
                          Buscar = Integer.parseInt(buscar);
                          RF.Buscar(Arreglo, Buscar);
                      }
                      else{
                          System.out.println("\033[31mError De Datos.");
                      }
                      break;
                  }
                      else{
                          System.out.println("\n\t\033[31mArreglo Vacio!");
                      }
                      break;
                  }
                  
                  case 4:{
                      if(Arreglo!=null){
                      System.out.println("\n  Posicion:    Dato:");

                      for(int d = 0; d < Tamaño; d++){
                          System.out.println("\n   " +d+"             "+Arreglo[d]);
                          
                      }
                      break;
                  }
                      else{
                          System.out.println("\n\t\033[31mArregl Vacio!");
                      }
              }
          
          
          
              }
          }
          else{
              System.out.println("\n\t\033[31mDatos Incorrectos");
          }
      }
      
    }
    
}
