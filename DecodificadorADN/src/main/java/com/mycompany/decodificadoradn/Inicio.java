/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decodificadoradn;

import DecodificadorADN.Decodificador;

/**
 *
 * @author baquiax
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Decodificador decodificador = new Decodificador();
        decodificador.recibirDatos();
    }

}
