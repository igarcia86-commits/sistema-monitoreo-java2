class Main {
    public static void main(String[] args) {

        //prueba de la clase "tanque"
        tanque miTanque = new tanque("T01", 1000.0);

        System.out.println("Estado: " + miTanque.getEstado());
        System.out.println("Nivel: " + miTanque.getNivel() + " litros");
        miTanque.llenar(500);

        System.out.println("\ndespues dede llenar:");
        System.out.println("Estado actual: " + miTanque.getEstado());
        System.out.println("Nivel actual: " + miTanque.getNivel() + " litros");
    }
}