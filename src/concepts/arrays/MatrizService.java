package concepts.arrays;

import java.util.Scanner;

/*
Exercício: Fazer um programa para ler dois números inteiros M e N, e depois
ler uma matriz de M linhas por N colunas contendo números inteiros, podendo
haver repetilções. Em seguida, ler um número inteiro X que partence à matriz.
Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e
abaixo de X, quando houver, conforme exemplo.
Correção em: https://github.com/acenelio/matrix2-java
*/
public class MatrizService {
  public void execute() {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();

    int[][] matrix = new int[m][n];

    // leitura da matriz
    for(int i = 0; i < m; i++) {
      for(int j = 0; j < n; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    // numero para buscar ocorrencias
    int x = sc.nextInt();

    for(int i = 0; i < m; i++) {
      for(int j = 0; j < n; j++) {
        if(matrix[i][j] == x) {
          System.out.println("Position: " + i + ", " + j);
          
          if(j > 0)
            System.out.println("Left: " + matrix[i][j-1]);
          if(j < matrix[i].length-1)
            System.out.println("Right: " + matrix[i][j+1]);
          if(i > 0)
            System.out.println("Up: " + matrix[i-1][j]);
          if(i < matrix.length-1)
            System.out.println("Down: " + matrix[i+1][j]);
        }
      }
    }

    sc.close();
  }
}