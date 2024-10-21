#include <stdio.h>

int main() {
    int m1[2][2], m2[2][2], resultado[2][2];
    int i, j;

    printf("Insira os numeros da primeira matriz: \n");
    for(i = 0; i < 2; i++) {
        for(j = 0; j < 2; j++) {
            scanf("%d", &m1[i][j]);
        }
    }

    printf("Insira os numeros da segunda matriz: \n");
    for(i = 0; i < 2; i++) {
        for(j = 0; j < 2; j++) {
            scanf("%d", &m2[i][j]);
        }
    }

    for(i = 0; i < 2; i++) {
        for(j = 0; j < 2; j++) {
            resultado[i][j] = m1[i][j] - m2[i][j];
        }
    }

    printf("Subtracao das matrizes: \n");
    for(i = 0; i < 2; i++) {
        for(j = 0; j < 2; j++) {
            printf("%d ", resultado[i][j]);
        }
      
    }

    return 0;
}
