import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Eletrodomestico fogao_classe = new Eletrodomestico();
        fogao_classe.marca = "Eletrolux";
        fogao_classe.volts = 220;
        fogao_classe.nome = "Fogão";
        fogao_classe.descricao = "6 bocas";

        //INSTANCIAÇÃO//
        Eletrodomestico geladeira_classe = new Eletrodomestico();


        //ATRIBUIÇÃO//
        geladeira_classe.marca = "Brastemp";
        geladeira_classe.volts = 220;
        geladeira_classe.nome = "geladeira";
        geladeira_classe.descricao = "Frost free";

        var novoEletrodomestico1 = CadastrarEletrodomestico();
        var novoEletrodomestico2 = CadastrarEletrodomestico();
        var novoEletrodomestico3 = CadastrarEletrodomestico();

    }
    public static Eletrodomestico CadastrarEletrodomestico()
    {
        Scanner scanner = new Scanner (System.in);
        Eletrodomestico novoEletrodomestico = new Eletrodomestico();

        System.out.println("Por favor, digite a marca do eletrodomestico");
        novoEletrodomestico.marca = scanner.nextLine();

        System.out.println("Nome do produto:");
        novoEletrodomestico.nome = scanner.nextLine();

        System.out.println("Digite a descrição: ");
        novoEletrodomestico.descricao = scanner.nextLine();

        System.out.println("Digite a voltagem: ");
        novoEletrodomestico.volts = scanner.nextInt();

        System.out.println("Cadastro concluido: " + novoEletrodomestico.toString());

        return novoEletrodomestico;

    }
}