
public class HolaImpl extends java.rmi.server.UnicastRemoteObject implements HolaInterfaz{
    public HolaImpl(String cadena) throws java.rmi.RemoteException{
        super();
        try{
            System.out.println("Rebind en objeto remoto: " );
            java.rmi.Naming.rebind(cadena, this);
        }
        catch(Exception e){       
        }
    }
    public String saluda(int numero) throws java.rmi.RemoteException{
         int i,miles,centenas,decenas,unidades;
         String romano=" ";
         miles = numero/1000;
         centenas = numero /100 %10;
         decenas = numero / 10 % 10;
         unidades = numero %10;
         
         //millar
         if(miles == 1){
            romano = romano + "M";
         }
         
         //centenas
         if(centenas == 9){
            romano = romano + "CM";
         } else if(centenas >= 5){
                  romano = romano + "D";
                  for(i = 6; i <= centenas; i++){
                     romano = romano + "C";
                  }
         } else if(centenas == 4){
                  romano = romano + "CD";
         }else {
               for(i = 1;i <= centenas; i++){
                  romano = romano + "C";
               }
         }
         //decenas
         if (decenas == 9) {
             romano = romano + "XC";
         } else if (decenas >= 5) {
                    romano = romano + "L";
                    for (i = 6; i <= decenas; i++) {
                         romano = romano + "X";
                    }
         } else if (decenas == 4) {
                    romano = romano + "XL";
        } else {
                for (i = 1; i <= decenas; i++){ 
                     romano = romano + "X";
                    }
      }
         //unidades
         if(unidades == 9){
            romano = romano + "IX";
         } else if(unidades >= 5){
                  romano = romano + "V";
                  for(i = 6; i <= unidades; i++){
                     romano = romano + "I";
                  }
         }else if(unidades == 4){
                  romano = romano + "IV";
         }else{
               for(i = 1; i <= unidades; i++){
                  romano = romano + "I";
               }
         }
         return romano;
    }
         
}