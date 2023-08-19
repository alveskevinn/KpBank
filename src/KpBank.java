import java.util.Scanner;

public class KpBank {
    public static void main(String[] args) {

        Scanner operacao = new Scanner(System.in);
        int saldo = 2500;
        boolean sair = false;
        while (!sair){
        exibirMenu(saldo);
        int opcao = operacao.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Seu saldo é: "+ saldo);
                break;
            case 2:
                System.out.println("Qual valor deseja depositar?");
                int valorRecebido = operacao.nextInt();
                saldo = somar(saldo, valorRecebido);
                System.out.println("Saldo atualizado para: " + saldo);
                break;
            case 3:
                System.out.println("Qual valor deseja transferir?");
                valorRecebido = operacao.nextInt();
                saldo = transferencia(saldo, valorRecebido);
                break;
            case 4:
                System.out.println("Saindo da conta");
                sair = true;
            default:
                System.out.println("Está operação não existe, tente novamente");
                break;
        }
        }
    }

    static int somar(int a, int b) {
        int soma = a + b;
        return soma;
    }
    static int transferencia(int saldo, int valorTransferencia) {
        int saldoAtualizado = saldo;
        if (valorTransferencia > saldo) {
            System.out.println("O valor escolhido é maior que o saldo disponível.");
        } else {
             saldo = saldoAtualizado - valorTransferencia;
        }

        return saldo;


    }
    static void exibirMenu(int saldo){
        System.out.println("""
                            ***********************
                            Dados iniciais do cliente:
                                
                            Nome: Giovana Siqueira
                            Tipo conta: Corrente
                            Saldo: R$ """+ saldo + """
                            
                            ***********************
                            
                            Operações
                            
                            1- Consultar saldos
                            2- Receber valor
                            3- Transferir valor
                            4- Sair
                            
                            Digite a opção desejada:                 
                """);
    }
}

