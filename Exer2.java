
import java.util.Scanner;

class Main {

    public static boolean verificaIdade(Assentos pessoa) {

        int idade = Integer.parseInt(pessoa.getIdade());

        if (idade % 7 == 0) {
            return true;
        }
        for (int i = 2; i < idade; i++) {
            if (idade % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void verificaAssento(Assentos[][] matriz) {

        int cont = 1;
        int contP = 5;

        boolean increment = false;

        for (int j = 0; j < 30; j++) {
            for (int i = 5; i >= 0; i--) {

                if (cont == contP) {
                    Assentos pessoa = matriz[i][j];

                    if (verificaIdade(pessoa)) {
                        if (i == 0) {
                            System.out.println(pessoa.getNome() + '/' + (j + 1) + '/' + 'K');
                        }

                        if (i == 1) {
                            System.out.println(pessoa.getNome() + '/' + (j + 1) + '/' + 'J');
                        }

                        if (i == 2) {
                            System.out.println(pessoa.getNome() + '/' + (j + 1) + '/' + 'H');
                        }

                        if (i == 3) {
                            System.out.println(pessoa.getNome() + '/' + (j + 1) + '/' + 'C');
                        }

                        if (i == 4) {
                            System.out.println(pessoa.getNome() + '/' + (j + 1) + '/' + 'B');
                        }

                        if (i == 5) {
                            System.out.println(pessoa.getNome() + '/' + (j + 1) + '/' + 'A');
                        }
                    }
                }
                cont++;
            }

            if (contP == 6 && increment == true) {
                increment = false;
            }
            if (contP == 1 && increment == false) {
                increment = true;
            }
            if (increment) {
                contP++;
            } else {
                contP--;
            }
            cont = 1;
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome = "";
        String idade = "";

        Assentos[][] matriz = new Assentos[6][30];

        //Entrada dos dados na matriz
        for (int i = 0; i < 30; i++) {
            for (int j = 5; j >= 0; j--) {
                matriz[j][i] = new Assentos(nome = teclado.nextLine(), idade = teclado.nextLine());
            }
        }
        verificaAssento(matriz);
    }
}

class Assentos {

    private String nome;
    private String idade;

    public Assentos() {
    }

    public Assentos(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String toString() {
        return this.nome + " " + this.idade;
    }
}