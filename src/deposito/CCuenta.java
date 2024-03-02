package deposito;

/**
 * Clase CCuenta que utiliza Main.
 * @author Daniel
 */
public class CCuenta {

    /**
     * Getter de Nombre.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de Nombre.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de Cuenta.
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter de Cuenta.
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter de Saldo.
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter de Saldo.
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter de TipoInterés.
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter de TipoInterés.
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Metodo CCuenta vacio.
     */
    public CCuenta()
    {
    }

    /**
     * El metodo que se usa al crear CCuenta en main.
     * @param nom Nombre del usuario
     * @param cue Numero de cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Metodo estado.
     * @return Retorna el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo ingresar que se usa en Main.
     * @param cantidad Se trata de la cantidad que ingresa como parametro para retirar.
     * @throws Exception En caso de producirse un error dará un mensaje de error.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo retirar, utilizado en Main.
     * @param cantidad Se trata de la cantidad que ingresa como parametro para retirar.
     * @throws Exception Producirá un mensaje de error en caso de intentar retirar una cantidad negativa o superior al saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
