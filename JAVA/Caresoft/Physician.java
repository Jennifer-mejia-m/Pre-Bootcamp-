package Caresoft;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends Usuario implements UsuarioCompatibleConHIPAA {
    
    // Dentro de la clase:    
    private ArrayList<String> patientNotes;
	
    // PARA HACER: Constructor que tome un ID
    
    public Physician(Integer id) {
        super(id);
    }

// PARA HACER: ¡Implementar UsuarioCompatibleConHIPAA!

    @Override
    public boolean assignPin(int pin) {
        if (pin > 999 && pin < 10000) {
            this.setPin(pin);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean accessAuthorized(Integer confirmedAuthId) {
        if (this.getId() == confirmedAuthId) {
            return true;
        }
        return false;
    }
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Fecha y hora de envío: %s \n", date);
        report += String.format("Reportado por ID: %s\n", this.id);
        report += String.format("Nombre del paciente: %s\n", patientName);
        report += String.format("Notas: %s \n", notes);
        this.patientNotes.add(report);
    }


     // PARA HACER: Setters y Getters

    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

}
