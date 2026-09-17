public class SensorNivel {

    // Atributos privados
    private String id;
    private double valorMedido;
    private Tanque tanqueAsociado;

    // Constructor
    public SensorNivel(String id, Tanque tanqueAsociado) {
        this.id = id;
        this.tanqueAsociado = tanqueAsociado;
        this.valorMedido = 0.0;
    }

}