public class Eletrodomestico {
    String marca;
    int volts;
    String nome;
    String descricao;

    //Para fazer um retorno do cadastro//
    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "marca='" + marca + '\'' +
                ", volts=" + volts +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    //FUNÇÃO ou MÉTODO//
    void Ligar(){
        System.out.println(nome + ": Ligando");
    }
    void Desligar(){
        System.out.println(nome + ": Desligando");
    }
}
