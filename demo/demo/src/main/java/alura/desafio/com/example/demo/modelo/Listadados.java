package alura.desafio.com.example.demo.modelo;


   public class Listadados implements Comparable <Listadados>  {

        public String dadolivro;

        public Listadados(String dadolivro) {
            this.dadolivro = dadolivro;
        }

        @Override
        public int compareTo(Listadados outroListadados) {
            return this.dadolivro.compareTo(outroListadados.dadolivro);

        }

    }


