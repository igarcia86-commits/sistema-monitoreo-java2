public class Main {
    public static void main(String[] args) {

        Tanque tanquePrueba = new Tanque("TK-01", 1000.0);
        tanquePrueba.llenar(650.0);

        SensorNivel sensor = new SensorNivel("SN-01", tanquePrueba);

        sensor.realizarLectura();

        System.out.println("--- PRUEBA DEL SENSOR ---");
        System.out.println("Lectura actual: " + sensor.getValorMedido() + " Litros");
        System.out.println("¿Lectura válida? " + sensor.esLecturaValida());
    }
}