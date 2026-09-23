public class Main {
    public static void main(String[] args) {

        Tanque tanquePrueba = new Tanque("TK-01", 1000.0);
        tanquePrueba.llenar(650.0);

        SensorNivel sensor = new SensorNivel("SN-01", tanquePrueba);
        sensor.realizarLectura();

        System.out.println("Lectura actual: " + sensor.getValorMedido() + " Litros");
        System.out.println("¿Lectura válida? " + sensor.esLecturaValida());

        Tanque miTanque = new Tanque("T01", 1000.0);

        System.out.println("Estado: " + miTanque.getEstado());
        System.out.println("Nivel: " + miTanque.getNivel() + " litros");
        miTanque.llenar(500);

        System.out.println("Estado actual: " + miTanque.getEstado());
        System.out.println("Nivel actual: " + miTanque.getNivel() + " litros");
    }
}