/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecodificadorADN;

import ADN.ADN;
import java.util.Scanner;

/**
 *
 * @author baquiax
 */
public class Decodificador {

    public Decodificador() {

    }

    /**
     * Recibe datos desde consola
     */
    public void recibirDatos() {
        Scanner lector = new Scanner(System.in);
        String secuenciaADN;
        System.out.println("Ingrese los ADN's a comparar:");
        System.out.println("Ingrese el primer ADN:");
        secuenciaADN = lector.next();
        ADN primerADN = new ADN(secuenciaADN);
        System.out.println("Ingrese el segundo ADN:");
        secuenciaADN = lector.next();
        ADN segundoADN = new ADN(secuenciaADN);

        try {
            String secuenciaComun = decodificarADNComun(primerADN, segundoADN);
            System.out.println("La secuencia en comun:");
            System.out.println(secuenciaComun);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Obtiene las secuencia de ADN en comun entre dos ADN's
     *
     * @param primerADN
     * @param segundoADN
     * @return
     * @throws Exception
     */
    public String decodificarADNComun(ADN primerADN, ADN segundoADN) throws Exception {
        if (primerADN.getSecuenciaDeADN().equalsIgnoreCase(segundoADN.getSecuenciaDeADN())) {
            return primerADN.getSecuenciaDeADN();
        } else {

            String aux;
            int indice = 0;
            int numeroLetras = primerADN.getSecuenciaDeADN().length() - 1;
            do {
                
                aux = quitarCaracteres(primerADN.getSecuenciaDeADN(), numeroLetras, indice);
                
                if (0 <= segundoADN.getSecuenciaDeADN().indexOf(aux)) {
                    return aux;
                }
                
                if (primerADN.getSecuenciaDeADN().length() <= (indice + numeroLetras)) {
                    indice = 0;
                    numeroLetras = numeroLetras - 1;
                } else {
                    indice++;
                }
                
            } while (2 <= numeroLetras);
        }
        throw new Exception("No hay concidencias");
    }

    /**
     * Toma un numero de letras de una palabra, en base a un numero de letras y
     * un indice
     *
     * @param palabra
     * @param noLetras
     * @param indice
     * @return
     */
    private String quitarCaracteres(String palabra, int noLetras, int indice) {
        String aux = "";
        for (int i = 0; i < noLetras; i++) {
            aux = aux + palabra.charAt(indice + i);
        }
        return aux;
    }
}
