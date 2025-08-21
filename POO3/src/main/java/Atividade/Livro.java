package Atividade;

public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int numerodepaginas;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumerodepaginas() {
        return numerodepaginas;
    }

    public void setNumerodepaginas(int numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Livro(String titulo, String autor, int numerodepaginas, double preco, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.numerodepaginas = numerodepaginas;
        this.preco = preco;
        this.ISBN = ISBN;
    }
}
