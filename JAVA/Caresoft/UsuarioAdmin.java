package Caresoft;

import java.util.ArrayList;
import java.util.Date;

public class UsuarioAdmin extends Usuario implements UsuarioCompatibleConHIPAA, AdminCompatibleConHIPAA {
    
    // Dentro de la clase:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    // PARA HACER: Implementar un constructor que tome un ID y un rol

    public UsuarioAdmin(Integer id, String role) {
        super(id);
        this.role = role;
    }

    // PARA HACER: ¡Implementar UsuarioCompatibleConHIPAA!

    @Override
    public boolean assignPin(int pin) {
        if (pin > 99999) {
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
        this.authIncident();
        return false;
    }

    // PARA HACER: ¡Implementar AdminCompatibleConHIPAA

    @Override
    public ArrayList<String>reportSecurityIncidents() {
        return securityIncidents;
    }
    
    public void newIncident(String notes) {
        String report = String.format(
            "Fecha y hora de envío: %s \n, Reportado por ID: %s\n Notas: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Fecha y hora de envío: %s \n, ID: %s\n Notas: %s \n", 
            new Date(), this.id, "FALLÓ EL INTENTO DE AUTORIZACIÓN PARA ESTE USUARIO"
        );
        securityIncidents.add(report);
    }

    // PARA HACER: Setters y Getters

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getSecurityIncidents() {
        return securityIncidents;
    }

    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
        this.securityIncidents = securityIncidents;
    }
    
    
   

    
}
