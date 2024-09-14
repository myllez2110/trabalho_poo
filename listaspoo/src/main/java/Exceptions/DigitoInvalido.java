package Exceptions;

import java.util.InputMismatchException;
//EXEMPLOS DE COMO CRIAR MENSAGEM DE ERRO PERSONALIZADAS
public class DigitoInvalido extends InputMismatchException {
    public DigitoInvalido(String mensagem){
        super(mensagem);
    }
    public void imprimeErro(Exception e){
        printStackTrace();
    }
}


