public class Libros {
     private String titulos;
    private String autor;
    private String id;

    public Libros(String titulos, String autor, String id) {
        this.titulos = titulos;
        this.autor = autor;
        this.id = id;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
