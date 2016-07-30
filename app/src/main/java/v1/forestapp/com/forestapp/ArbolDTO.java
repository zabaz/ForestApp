package v1.forestapp.com.forestapp;

/**
 * Created by Jesualdo Martinez on 22/07/2016.
 */
public class ArbolDTO {

    private int imagen;
    private String titulo;
    private String subtitulo;

    public ArbolDTO(int imagen, String titulo, String subtitulo) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subtitulo;
    }

    public void setSubTitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }
}

