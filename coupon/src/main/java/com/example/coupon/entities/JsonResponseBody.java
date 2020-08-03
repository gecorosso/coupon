package com.example.coupon.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



/**
 * Class used as the Object tied into the Body of the ResponseEntity.
 * It's important to have this Object because it is composed of server response code and response object.
 * Then, JACKSON LIBRARY automatically convert this JsonResponseBody Object into a JSON response.
 */
//Con questa Inner class dobbiamo considerare che dobbiamo 
//costruire una risposta la quale è costituita da un codice e da una 
//Stringa che sarebbe un oggetto .... quindi la seguente classe:

@AllArgsConstructor
public class JsonResponseBody{
    @Getter @Setter
    private int server;
    @Getter @Setter
    private Object response;
}
