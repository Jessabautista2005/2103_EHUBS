
package optical;
import java.sql.*;
import Control_Connector.DBConnect;


public class Patient {
    
    private String PatientName, Email, ContactNumber;
    private int PatientID;
    
        // Add a constructor for patientID and contactNumber
    public Patient(int PatientID, String PatientName, String ContactNumber, String Email) {
        this.PatientID = PatientID;
        this.PatientName = PatientName;
        this.ContactNumber = ContactNumber;
        this.Email = Email;
    }
    // Setters
    public void setName(String PatientName){
        this.PatientName = PatientName;
    } 
    public void setEmail(String Email){
        this.Email = Email;
    }
    public void setID(int PatientID){
        this.PatientID = PatientID;
    }
    public void setContactNumber(String ContactNumber){
        this.ContactNumber = ContactNumber;        
    }
    
    // Getters   
    public String getName(){
        return PatientName;
    }
    public String getEmail(){
        return Email;
    }
    public int getID(){
        return PatientID;
    }
    public String getNumber(){
        return ContactNumber;
    }
    
    // Methods
    public void bookAppointmet(){
        
        
    }
    public void deletelAppointment(){
        
    }
    
    public void buyProduct(){
        
    }
    
    
}