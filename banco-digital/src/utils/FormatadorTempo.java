package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorTempo {
    
    public FormatadorTempo(){}

    public String formatarData() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formatter);
    }

}
