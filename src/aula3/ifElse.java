package aula3;

import java.util.Scanner;

public class ifElse {
    static void main() {

        Scanner notas = new Scanner(System.in);

        int idade = 18;
        if (idade < 18) {
            IO.println("Foi barrado na porta");
        } else {
            IO.println("Liberado");

        }
        Scanner nota = new Scanner(System.in);
        IO.println("Digite a primeira nota");
        double nota1 = notas.nextDouble();
        IO.println("Digite a segunda nota");
        double nota2 = notas.nextDouble();
        IO.println("Digite a terceira nota");
        double nota3 = notas.nextDouble();
                double somaNotas = (nota1+nota2+nota3)/3;

                if(somaNotas < 4){;
              IO.println("reprovado");
              return;
        }
                if (somaNotas <= 6){
                    IO.println("Recuperação");
                    return;
        }
                if(somaNotas > 6){
                    IO.println(("Aprovado"));
                    return;
                }else{
                    System.out.println("Voce foi aprovado");
                    IO.println("Liberado");
                }
    }

}




