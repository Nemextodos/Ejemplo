import java.util.Scanner;
public class HolaCliente{
   public static void main(String [] args){
   Scanner leer = new Scanner(System.in);
   System.out.println("Escriba un numero: ");
   int numero = leer.nextInt();
      try{
         HolaInterfaz objRemoto = (HolaInterfaz) java.rmi.Naming.lookup("rmi://localhost/saluda");
         System.out.println("El servidor me dice otra vez: " + objRemoto.saluda(numero));         
      }
      catch( Exception e){}
   }
}