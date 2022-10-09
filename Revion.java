/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revion;
import java.lang.IndexOutOfBoundsException;
/**
 *
 * @author DELL
 */
public class Revion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Departmenrt d =new Departmenrt(1,"informationsy");
     
      SalaryEmployee se =new  SalaryEmployee(2000,500,50,"ahmed","riad",1200,  Gender.male);
      
      d. add_employee(se)  ;
      
        HourEmplloyee so=new  HourEmplloyee(100,6,"mohamed","doby",1500,  Gender.male);
        
        d.add_employee(so);
        
      CommitionEmployee co =new   CommitionEmployee(15000,.25,"ali","imrat",1200,  Gender.male);
      
      d.add_employee(co);
      
        System.out.println(d.get());   
    d.print_base();
    d.print_alldataes();
        
    }
    
    
}
