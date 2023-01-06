
package oopatmproject;
public class OOPAtmProject {
    public static void main(String[] args) {
        
        
       Atm atm=new Atm();
       Account account=new Account("Ayse","1234",5000);
       atm.work(account);
        System.out.println("exiting the program");
       
        
    }
    
}
