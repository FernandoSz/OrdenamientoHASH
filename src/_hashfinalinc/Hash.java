package _hashfinalinc;

public class Hash {
    public void Agregar(int []x,int dato){
       int Tamaño = x.length;
       int Posicion=0;
        Posicion = (dato%Tamaño)+1;
        if(x[Posicion]==0){
        x[Posicion] = dato;
        System.out.println("Guardado En: "+Posicion);
        }
        else{
            int a = Posicion+1;
            x[a] = dato;
            System.out.println("Ingresado En "+a);
            
            
        }
      
    
    
    }         
 public int MetodoPruebaLineal(int []X,int Llave,int dato){
        int D = Llave;
        int si=0;
        int Tamaño = X.length;
        for(int Vx=0;Vx<Tamaño;Vx++){
            if(X[Vx]==0 && X[D]==Llave){
               X[Vx] = dato;
               return si;
                
            }
            else{
                Vx = D+1;
            }
            while((Vx < Tamaño) &&(X[Vx]==0)&&(X[Vx]!=Llave) &&(Vx!=D)){
                Vx = Vx+1;
                if(Vx ==Tamaño+1)
                {
                    Vx=1;
                    X[Vx]= dato;
                    
                }
            }
            if((X[Vx]==0) || (Vx == D)){
                System.out.println("Informacion Encontrada.");
                si =1;
                return si;
        }
            else{
                System.out.println("Informacion No Encontrada.");
                si=0;
                return si;
            }
               
           
            
            
        }
        
return si;
    }
        
        
    
    public int Buscar(int[] A,int X)
    {
        int m = A.length;
        int dirHash = X%m;
        if (A[dirHash] == X) 
        {
            System.out.println("\n\t\033[34mNumero Encontrado En La Posicion-->: "+ (dirHash));
            
        }
        else 
        {
            int dirReh = (dirHash + 1)%m;
            while ((A[dirReh] != X) && (A[dirReh] != 0) && (dirReh !=dirHash))
            {
                dirReh = (dirReh + 1)%m;
            }
            
            if (A[dirReh] == X) 
            {
                System.out.println("\n\t\033[34mNumero Encontrado En La Posicion-->"+ (dirReh));
                return 1;
                
            }
            else 
            {
                
                System.out.println("\n\t\033[31mEl Numero "+X+" No Se Encuentra.");
                
            }
        }
    
return 0;

    



    


    }
}