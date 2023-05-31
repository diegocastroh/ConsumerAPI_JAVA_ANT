/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import consumerapi.apiconsumer;
import org.json.JSONObject;

/**
 *
 * @author lol_2
 */
public class main {

    public static void main(String[] args) {
        apiconsumer API = new apiconsumer();
        //Obtiene el resultado en un String
        String result = API.consumer();
        //Convertimos el String a un JSONObject
        JSONObject json = new JSONObject(result);
    }
}
