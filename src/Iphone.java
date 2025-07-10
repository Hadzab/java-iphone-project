import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    Scanner scanner = new Scanner(System.in);


    @Override
    public void ligar(String numero) {
        System.out.println("Digite o número ao qual deseja ligar:");
        numero = scanner.nextLine();
        System.out.printf("Ligando para %s", numero);
    }

    @Override
    public void atender() {
        String resposta = "";

        while (true) {
            System.out.println("**Número desconhecido**\nDeseja atender a ligação? (s/n)");
            resposta = scanner.nextLine();

            if ("s".equalsIgnoreCase(resposta) || "n".equalsIgnoreCase(resposta)) {
                break;
            } else {
                System.out.println("Não entendi a sua resposta, por favor seja mais claro");
            }
    }

        if ("s".equalsIgnoreCase(resposta)) {
            System.out.println("Atendendo a chamada... Responda");
        } else {
            System.out.println("Chamada recusada com sucesso!");
        }
    }


    @Override
    public void enviarSMS(String mensagem) {
        System.out.println("Digite o número ao qual deseja mandar a mensagem");
        String numeroMensagem = scanner.nextLine();
        System.out.println("Certo, digite a sua mensagem abaixo:");
        mensagem = scanner.nextLine();
        System.out.printf("Mensagem: %s\nEnviando para %s\n", mensagem, numeroMensagem);
    }

    @Override
    public void abrirPagina() {
        System.out.println("Digite a url desejada:");
        String url = scanner.nextLine();
        System.out.printf("Direcionando para %s", url);
    }

    @Override
    public void atualizar() {
        System.out.println("Página atualizando...");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova página...");
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Digite o nome da música:");
        String nomeMusica = scanner.nextLine();
        System.out.printf("%s selecionada", nomeMusica);
    }
}