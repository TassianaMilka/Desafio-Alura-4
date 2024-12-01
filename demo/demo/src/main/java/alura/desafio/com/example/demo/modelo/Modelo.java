package alura.desafio.com.example.demo.modelo;



 public class Modelo {

      private Long id;
      private String titulo;
      private String autor;
      private int ano;
      private String sobre;


   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
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

    public void setAutor(String autor) {
       this.autor = autor;
    }

    public int getAno() {
       return ano;
    }


    public void setAno(int ano) {
       this.ano = ano;
    }

    public String getSobre() {
      return sobre;
   }

   public void setSobre(String sobre) {
      this.sobre = sobre;
   }


   @Override public String toString() {
      return "Livro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", ano=" + ano + '}';
   }
}



