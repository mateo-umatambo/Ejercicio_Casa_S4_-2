//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Aplicacion app = new Aplicacion("SistemaVentas", "1.0");
    Aplicacion app2 = new Aplicacion("ControlInventario", "2.1");

    app.iniciar();


    System.out.println("App ID: " + app.getId() + " \n" + app.getNombre() + " v" + app.getVersion() + "\nEn ejucución: " + app.isEjecutando());
    System.out.println("App ID: " + app2.getId() + " \n" + app2.getNombre() + " v" + app2.getVersion() + "\nEn ejucución: " + app2.isEjecutando());

    System.out.println("\nTotal de aplicaciones: " + Aplicacion.getTotalAplicaciones());
}
