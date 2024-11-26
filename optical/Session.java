/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optical;

/**
 *
 * @author ayodr
 */
import optical.Patient;
public class Session {
    // Create a static Patient object to store the logged-in patient's data
    private static Patient loggedInPatient;

    // Getter for the logged-in patient
    public static Patient getLoggedInPatient() {
        return loggedInPatient;
    }

    // Setter for the logged-in patient
    public static void setLoggedInPatient(Patient patient) {
        loggedInPatient = patient;
    }

    // Method to clear session data
    public static void clearSession() {
        loggedInPatient = null; // Clears the session
    }
}
