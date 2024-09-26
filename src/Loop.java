public class Loop //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Loop {
    public Loop() {
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliaçao = 0.0;
        double nota = 0.0;

        for(int i = 0; i < 3; ++i) {
            System.out.println("Diga sua avaliaçao para o filme");
            nota = leitura.nextDouble();
            mediaAvaliaçao += nota;
        }

        System.out.println("Media de avaliaçoes " + mediaAvaliaçao / 3.0);
    }
}

