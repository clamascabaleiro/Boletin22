package boletin22_1;

/**
 *
 * @author clamascabaleiro
 */
public class Correo {
    private String mensaje;
    private boolean leido;

    public Correo() {
    }

    public Correo(String mensaje, boolean leido) {
        this.mensaje = mensaje;
        this.leido = leido;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    
}
