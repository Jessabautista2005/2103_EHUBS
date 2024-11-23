
package optical;
import java.sql.*;
import Control_Connector.DBConnect;


public class Patient {
    
    private String PatientName, Email;
    private int PatientID, ContactNumber;
    
    // Setters
    void setName(String PatientName){
        this.PatientName = PatientName;
    } 
    void setEmail(String Email){
        this.Email = Email;
    }
    void setID(int PatientID){
        this.PatientID = PatientID;
    }
    void setNumber(int ContactNumber){
        this.ContactNumber = ContactNumber;        
    }
    
    // Getters   
    String getName(){
        return PatientName;
    }
    String getEmail(){
        return Email;
    }
    int setID(){
        return PatientID;
    }
    int setNumber(){
        return ContactNumber;
    }
    
    // Methods
    void bookAppointmet(){
        
        
    }
    void deletelAppointment(){
        
    }
    void buyProduct(){
        
    }
    
    
}