
enum EstadoOperacion {
    LLENANDO, VACIANDO, DETENIDO
}


public class tanque {


    private String idTanque;
    private double capacidadMax;
    private double nivelActual;
    private EstadoOperacion estadoOperacion;


    public tanque(String idTanque, double capacidadMax) {
        this.idTanque = idTanque;
        this.capacidadMax = capacidadMax;
        this.nivelActual = 0.0;
        this.estadoOperacion = EstadoOperacion.DETENIDO;
    }


    public void llenar(double litros) {
        if (litros > 0) {
            this.nivelActual += litros;
            this.estadoOperacion = EstadoOperacion.LLENANDO;
            if (this.nivelActual > this.capacidadMax) {
                this.nivelActual = this.capacidadMax;
            }
        }
    }

    public double getNivel() {
        return this.nivelActual;
    }

    public EstadoOperacion getEstado() {
        return this.estadoOperacion;
    }
}

