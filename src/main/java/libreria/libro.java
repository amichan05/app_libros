
package libreria;

public abstract class libro {
     private String titulo;
     private int año;
     private String nomAutor;

    public libro() {}

    public libro(String titulo, int año, String nomAutor) {
        this.titulo = titulo;
        this.año = año;
        this.nomAutor = nomAutor;
    }      
    
    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        
        this.año = año;
    }
    
    public abstract String esClasificado();
    public abstract Boolean esRenovable();    
    public abstract Boolean esReproducible();

    @Override
    public String toString() {
        return "libro{" + "titulo=" + titulo + ", a\u00f1o=" + año + ", nomAutor=" + nomAutor + '}';
    }
    
}
