/**
 * Desafio DIO - Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.
 * @author Diego Di Paula
 */
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        // Exemplo de uso do iPhone
        IPhone iPhone = new IPhone();
        System.out.println("********ReprodutorMusical********");

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("What A Wonderful World - Ray Charles");

        System.out.println("********AparelhoTelefonico********");
        iPhone.ligar("123456789");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("********NavegadorInternet********");
        iPhone.exibirPagina("https://www.google.com");
        iPhone.adicionarNovaAba("https://www.dio.me");
        iPhone.atualizarPagina();


    }
}