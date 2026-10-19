public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    private static int totalAplicaciones = 0;

    // Constructor requerido
    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;
    }

    // Métodos requeridos
    public void iniciar() {
        this.ejecutando = true;
    }

    public void cerrar() {
        this.ejecutando = false;
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }
}
