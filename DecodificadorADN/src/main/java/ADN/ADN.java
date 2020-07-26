/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADN;

/**
 *
 * @author baquiax
 */
public class ADN {

    private String secuenciaDeADN;

    /**
     * This is a ADN builder, create ADN type object
     *
     * @param secuenciaDeADN
     */
    public ADN(String secuenciaDeADN) {
        this.secuenciaDeADN = secuenciaDeADN;
    }

    /**
     * @return the secuenciaDeADN
     */
    public String getSecuenciaDeADN() {
        return secuenciaDeADN;
    }

    /**
     * @param secuenciaDeADN the secuenciaDeADN to set
     */
    public void setSecuenciaDeADN(String secuenciaDeADN) {
        this.secuenciaDeADN = secuenciaDeADN;
    }

}
