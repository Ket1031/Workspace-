package aula04;

public class Aula04 {
    public static void main(String[] args) {

/*
        //GET E SET

        // Metodo getter funciona para retornar o valor
        // Metodo setter funcion para enviar/ modificar o conteudo
        // Metodo construtor funciona para deixar tudo pre definido

        Caneta c1 = new Caneta();

        c1.setModelo("BIC");
        //c1.modelo = "BIC"; acesso direto nao finciona em codigo privado
        c1.setPonta(0.5f);
        //assim que se chama o metodo set (adicionando/modificando)

        c1.status();

        //System.out.println("tenho uma caneta " + c1.modelo); acesso direto proibido
        //solucao co get:

        System.out.println("tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

*/
        //CONSTRUTORES

        Caneta c1 = new Caneta("NIC","Amarelo",0.5f);
        c1.status();
        Caneta c2 = new Caneta("KKK","Roxa",0.05f);
        c2.status();

    }
}
