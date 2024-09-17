package Pessoas;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Pessoas people1 = new Pessoas();
        Scanner kb = new Scanner(System.in);

        System.out.println("Digite abaixo o nome da pessoa: ");
        String name = kb.nextLine();
        people1.setNome(name);

        System.out.println("Digite abaixo a idade da pessoa: ");
        int age = kb.nextInt();
        people1.setIdade(age);
        kb.nextLine();

        System.out.println("Digite abaixo o peso da pessoa: ");
        double weight = kb.nextDouble();
        people1.setPeso(weight);
        kb.nextLine();

        System.out.println("Digite abaixo a altura da pessoa: (Metros)");
        double widith = kb.nextDouble();
        people1.setAlt(widith);
        kb.nextLine();

        people1.imcCalc();

        System.out.println("O nome da pessoa e: " + people1.getNome());
        System.out.println("A idade da pessoa e: " + people1.getIdade());
        System.out.println("O peso da pessoa e: " + people1.getPeso());
        System.out.println("A altura da pessoa e: " + people1.getAlt());
        System.out.printf("O imc da pessoa e: %.2f \n" , people1.getImc());
        System.out.println("A classificacao do imc da pessoa e: " + people1.getImcClass());

        System.out.println("A pessoa engordou? (sim/nao)");
        String status = kb.nextLine();

        if (status.equalsIgnoreCase("sim")) {
            do {
                System.out.println("Digite abaixo quantos quilos a pessoa engordou");
                double quilos = kb.nextDouble();
                people1.setQuilos(quilos);
                people1.engordar();
                kb.nextLine();
                people1.imcCalc();
                people1.imcClass();

                System.out.println("O nome da pessoa e: " + people1.getNome());
                System.out.println("A idade da pessoa e: " + people1.getIdade());
                System.out.println("O peso da pessoa e: " + people1.getPeso());
                System.out.println("A altura da pessoa e: " + people1.getAlt());
                System.out.printf("O imc da pessoa e: %.2f \n" , people1.getImc());
                System.out.println("A classificacao do imc da pessoa e: " + people1.getImcClass());

                System.out.println("A pessoa engordou mais? (sim/nao)");
                status = kb.nextLine();

            } while (status.equalsIgnoreCase("sim"));
        }

        System.out.println("A pessoa emagreceu? (sim/nao)");
        String status2 = kb.nextLine();

        if (status2.equalsIgnoreCase("sim")){
            do {
                System.out.println("Digite abaixo quantos quilos a pessoa emagreceu");
                double quilos = kb.nextDouble();
                people1.setQuilos(quilos);
                people1.emagrecer();
                kb.nextLine();
                people1.imcCalc();
                people1.imcClass();

                System.out.println("O nome da pessoa e: " + people1.getNome());
                System.out.println("A idade da pessoa e: " + people1.getIdade());
                System.out.println("O peso da pessoa e: " + people1.getPeso());
                System.out.println("A altura da pessoa e: " + people1.getAlt());
                System.out.printf("O imc da pessoa e: %.2f \n" , people1.getImc());
                System.out.println("A classificacao do imc da pessoa e: " + people1.getImcClass());

                System.out.println("A pessoa emagreceu mais? (sim/nao)");
                status2 = kb.nextLine();

            } while (status2.equalsIgnoreCase("sim"));
        }

        System.out.println("A pessoa envelheceu? (sim/nao)");
        String status3 = kb.nextLine();

        if (status3.equalsIgnoreCase("sim")){
            do {
                people1.envelhecer();
                people1.imcCalc();
                people1.imcClass();

                System.out.println("O nome da pessoa e: " + people1.getNome());
                System.out.println("A idade da pessoa e: " + people1.getIdade());
                System.out.println("O peso da pessoa e: " + people1.getPeso());
                System.out.println("A altura da pessoa e: " + people1.getAlt());
                System.out.printf("O imc da pessoa e: %.2f \n" , people1.getImc());
                System.out.println("A classificacao do imc da pessoa e: " + people1.getImcClass());

                System.out.println("A pessoa envelheceu mais? (sim/nao)");
                status3 = kb.nextLine();

            } while (status3.equalsIgnoreCase("sim"));
        }

        kb.close();
    }
}
