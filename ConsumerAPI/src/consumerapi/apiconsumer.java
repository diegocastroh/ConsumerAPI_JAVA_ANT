/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consumerapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author lol_2
 */
public class apiconsumer {

            // Obtener las credenciales de autenticación
    private String apiKEY = "1|OEJehA4tzkWQ4C8LtnJ3a2OZLNh6YRhxyvCqu0LD";
    private String URL = "http://127.0.0.1:8000/reportes";
    
    public String consumer() {
        try {
            // Crear la conexión HTTP
            URL url = new URL(URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Establecer los encabezados de autenticación
            con.setRequestProperty("Authorization", "Bearer " + apiKEY);

            // Realizar la solicitud HTTP
            int responseCode = con.getResponseCode();

            // Procesar la respuesta HTTP
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            //Retorna una respuesta en JSON:

            // Convertir la respuesta a un objeto JSON
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
