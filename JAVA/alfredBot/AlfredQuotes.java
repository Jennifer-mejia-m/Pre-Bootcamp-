package alfredBot;

import java.time.LocalTime;
import java.util.Date;
import javax.print.attribute.DateTimeSyntax;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        
        return "Hola, "+ name +". Encantado de verte";
    }
    
    public String dateAnnouncement() {
        Date fecha = new Date();
        return "Actualmente es "+ fecha.toString();
    }
    
    public String respondBeforeAlexis(String conversation) {
        
        if (conversation.indexOf("Alexis") > -1) {
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso.";
                }
        if (conversation.indexOf("Alfred") > -1) {
            return "A su servicio. Como desee, naturalmente.";
        }
        return "Bien. Y con eso, me retiraré.";
    }

    public String despedida(String name) {  
        LocalTime fecha = LocalTime.now();  
        
        return "Gracias por su visita, "+ name +" " + fecha;
    }
    
	
}

