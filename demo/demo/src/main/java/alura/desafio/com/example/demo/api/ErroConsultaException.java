package alura.desafio.com.example.demo.api;



public class ErroConsultaException extends RuntimeException{


    public ErroConsultaException(String mensagem) {
        super(mensagem);
    }

}