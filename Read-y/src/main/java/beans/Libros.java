package beans;

public class Libros {
    
    private int id_libro;
    private String nombre_libro;
    private String autor;
    private String isbn;
    private int no_paginas;
    private int ano_libro;
    private String formato;
    private String categoria;
    private String sinopsis;

    public Libros(int id_libro, String nombre_libro, String autor, String isbn, int no_paginas, int ano_libro, String formato, String categoria, String sinopsis) {
        this.id_libro = id_libro;
        this.nombre_libro = nombre_libro;
        this.autor = autor;
        this.isbn = isbn;
        this.no_paginas = no_paginas;
        this.ano_libro = ano_libro;
        this.formato = formato;
        this.categoria = categoria;
        this.sinopsis = sinopsis;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNo_paginas() {
        return no_paginas;
    }

    public void setNo_paginas(int no_paginas) {
        this.no_paginas = no_paginas;
    }

    public int getAno_libro() {
        return ano_libro;
    }

    public void setAno_libro(int ano_libro) {
        this.ano_libro = ano_libro;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "Libros{" + "id_libro=" + id_libro + ", nombre_libro=" + nombre_libro + ", autor=" + autor + ", isbn=" + isbn + ", no_paginas=" + no_paginas + ", ano_libro=" + ano_libro + ", formato=" + formato + ", categoria=" + categoria + ", sinopsis=" + sinopsis + '}';
    }
    
     
    
}
