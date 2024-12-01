package alura.desafio.com.example.demo.modelo;




    public class ListadadosAutores implements Comparable <ListadadosAutores>  {

        public String dadoautores;

        public ListadadosAutores(String dadoautores) {
            this.dadoautores = dadoautores;
        }

        @Override
        public int compareTo(ListadadosAutores outroListadados) {
            return this.dadoautores.compareTo(outroListadados.dadoautores);

        }

    }

