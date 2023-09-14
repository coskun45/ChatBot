package com.example.ChatBot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    // hier  nur post methode für Gespräch zu implementieren.
    int counter=0;

    @PostMapping("/chat")
    public String gespraech(@RequestBody String input) {
        if (counter == 0) {
            counter++;
            return "Hallo, ich bin Frau Sonnenschein, Deine Versicherungsberaterin. Möchtest Du zur Hausrat- oder KFZ-Versicherung beraten werden?";

        }

        //schritt 1
        if (counter == 1) {
            counter++;
            if (input.toLowerCase().contains("kfz")) {
                return "Das Auto in Deutschland versichern zu lassen, ist Pflicht. Die Basis der KFZ-Versicherung bildet die Haftpflichtversicherung. " +
                        "Durch sie werden Schäden abgedeckt, die bei anderen Verkehrsteilnehmern entstehen. Schließt Du dazu noch ergänzend eine Teil- oder Voll-Kasko ab," +
                        " wird der Schaden an Deinem Auto mit abgedeckt. Verstehst Du das soweit?";
            }
        }

        //schritt 2
        if (counter == 2) {
            counter++;
            if(input.toLowerCase().contains("ja")){
            return "Sehr gut! Dann lass uns doch gleich beginnen. Zunächst brauche ich ein paar Informationen zu Deinem Auto. Ist das Auto bereits auf dich zugelassen?";
             }
        }


        //schritt 3
        if (counter == 3) {
            counter++;
            if (input.toLowerCase().contains("auf mich zugelassen")) {
                return "Damit ich weiß, welches Auto Du fährst, trage bitte die Herstellernummer HSN des Autos ein.";
            }
        }

        return "Ich habe sie nicht verstanden, bitte formulieren sie Ihre Antwort um";
    }
}
