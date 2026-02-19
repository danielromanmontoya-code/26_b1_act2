package com.example;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    
    public Libro() {
        this.titulo="libro desconocido";
        this.autor="autor desconocido";
        this.paginas=0;
    }


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas=0;
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas, String titulo, String autor) {
        this.paginas = paginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    
    public String mostrarDetalles() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }

}
