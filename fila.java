package alugafacil;
import java.util.Scanner; 
public class AlugaFacil {

    public static class Fila{
        public int[] valores;
        public int primeiro;
        public int ultimo;
        public int total;
        
     public Fila(){
              valores = new int[10];
              primeiro = 0;
              ultimo = 0;
              total =0;
            }
     
     public void inserir(int elemento){
         valores[ultimo] = elemento;
         ultimo = (ultimo +1) % valores.length;
         total ++;
     }
     
     public int retirar(){
         int elemento = valores[primeiro];
         primeiro = (primeiro +1) %valores.length;
         total--;
         return elemento;
         
     }
     
     public boolean isEmpty(){
         return total==0;
     }
    }

    public static void main(String[] args) {
                     
           Fila fila = new Fila();
           fila.inserir(2);
           fila.inserir(5);
           fila.retirar(); 
           
           while(!fila.isEmpty()){
               int x = fila.retirar();
               System.out.println(x);
           }
           
    }

}

