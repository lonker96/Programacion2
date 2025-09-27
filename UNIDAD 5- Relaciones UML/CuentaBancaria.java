/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class CuentaBancaria {
    private String cbu;
    private String saldo;
    private ClaveSeguridad clave;  //Composicion
    private Titular2 titular;        //Asociacion Bidireccional
    
    
    public CuentaBancaria(String cbu, String saldo, String codigo,String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo,ultimaModificacion);
        
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    public Titular2 getTitular() {
        return titular;
    }

    public void setTitular(Titular2 titular) {
        this.titular = titular;
        if(titular != null && titular.getCuenta() != this){
            titular.setCuenta(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + 
                "}, Clave={" + clave.getCodigo() +','+clave.getUltimaModificacion()+ 
                "}, titular={" + titular.getNombre()+','+titular.getDni() + "}}";
    }
    
    
}
