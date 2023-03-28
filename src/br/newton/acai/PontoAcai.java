package br.newton.acai;

import javax.swing.*;

public class PontoAcai {

    public static void main(String[] args) {


        Acai acai = new Acai();

        String menu = JOptionPane.showInputDialog("Informe o tamanho do Açaí desejado: \n 1 - 300ml \n 2 - 500ml \n 3 - 700");

        if(menu.equals("1")){
            acai.acrescimo = Boolean.parseBoolean(JOptionPane.showInputDialog("Deseja algum acrescimo ?"));
            acai.valor += 8;
            JOptionPane.showInputDialog(null, "O valor do seu pedido ficou: " +acai.calcular(acai.valor, acai.acrescimo), "Resultado", JOptionPane.QUESTION_MESSAGE);
        }

        if(menu.equals("2")){
            acai.acrescimo = Boolean.parseBoolean(JOptionPane.showInputDialog("Deseja algum acrescimo ?"));
            acai.valor += 10;
            JOptionPane.showInputDialog(null, "O valor do seu pedido ficou: " +acai.calcular(acai.valor, acai.acrescimo), "Resultado", JOptionPane.QUESTION_MESSAGE);
        }

        if(menu.equals("3")){
            acai.acrescimo = Boolean.parseBoolean(JOptionPane.showInputDialog("Deseja algum acrescimo ?"));
            acai.valor += 12;
            JOptionPane.showInputDialog(null, "O seu Açai ficou no valor de: " +acai.calcular(acai.valor, acai.acrescimo), "Resultado", JOptionPane.QUESTION_MESSAGE);
        }


    }
}
