import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo\n ===== Digite o valor que deseja depositar na criacao de conta =====");
        double saldo = scanner.nextDouble();

        // Calculo cheque especial

        double chequeEspecial;
        
        if(saldo <= 500.0 ){
            chequeEspecial = 50.0;
        } else {
            chequeEspecial = saldo * 0.5;
        }

      
        double chequeUsado = 0;
        double usandoCheque = 0;

        int menu;

        do { 
             System.out.println("\n=== MENU ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                 System.out.printf("Saldo atual: R$ %.2f\n ", saldo);
                 break;

                case 2:
                 System.out.printf("Cheque especial disponivel: R$ %.2f\n ", chequeEspecial);
                 break;

                case 3:
                System.out.printf("Digite o valor do deposito\n ");
                double deposito = scanner.nextDouble();
                deposito = saldo += deposito;
                System.out.printf("Deposito realizado. Novo valor saldo disponivel: R$ %.2f\n", saldo);
                break;

                case 4:
                System.out.printf("Digite o valor do saque ");
                double saque = scanner.nextDouble();
                double totalDisponivel = saldo + (chequeEspecial - chequeUsado);

                if (saque <= saldo){
                    saldo -= saque;
                    System.out.printf("Deposito realizado. Novo valor saldo disponivel: R$ %.2f\n", saldo);

                }else if (saque <= totalDisponivel){
                    usandoCheque = saldo - saque;
                    saque = 0;
                    chequeUsado += usandoCheque;

                    double taxa = usandoCheque * 0.2;
                                        System.out.printf("Você usou R$ %.2f do cheque especial. Taxa de R$ %.2f aplicada.\n", usandoCheque, taxa);
                    saldo -= taxa;

                
                } else {
                    System.out.println("Saldo insuficiente");
                }
                break;

                case 5:
                System.out.println("Digite o valor do boleto: R$ ");
                double boleto = scanner.nextDouble();
                totalDisponivel = saldo + (chequeEspecial - chequeUsado);
                

                if (boleto <= saldo){
                    saldo -= boleto;
                    System.out.printf("Boleto pago. Novo saldo: R$ %.2f\n", saldo);
                    System.out.println("Voce usou R$ 0,00 do cheque especial. Taxa de 0,00 aplicada\n");

                }else if (boleto <= totalDisponivel){
                    usandoCheque = boleto - saldo;
                    saldo = 0;
                    chequeUsado += usandoCheque;

                    double taxa = usandoCheque * 0.2;
                    System.out.printf("Voce usou R$ %.2f do cheque especial. Taxa de %.2f aplicada", usandoCheque, taxa);
                    saldo -= taxa;

                }else {
                    System.out.println("Saldo insuficiente pra pagar o boleto.");
                }
                break;

                case 6:
                if (chequeUsado > 0){
                    System.out.printf("Voce esta usando R$ %.2f do cheque especial.\n", chequeUsado);

                }else {
                    System.out.println("Voce nao esta usando o cheque especial.");

                } 
                break;

                case 0:
                System.out.println("Encerrando o programa.");
                break;

                default:
                System.out.println("Opcao invalida. Tente novamente");

            }

        } while (menu !=0);


    scanner.close();


    }

}
