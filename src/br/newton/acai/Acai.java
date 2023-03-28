package br.newton.acai;

public class Acai {
    public Integer tamanho;

    public double valor;

    public boolean acrescimo;

    public double calcular (double valor, boolean acrescimo) {
        if (acrescimo){
            valor+=2;
            return valor;
        }
        return valor;

    }

}
