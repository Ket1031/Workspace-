#include <stdio.h>

int main() {
    int matriz[2][2], transposta[2][2];
    int i, j;

  
    printf("Insira os elementos da matriz: \n");
    for(i = 0; i < 2; i++) {
        for(j = 0; j < 2; j++) {
            scanf("%d", &matriz[i][j]);
        }
    }


    for(i = 0; i < 2; i++) {
        for(j = 0; j < 2; j++) {
            transposta[j][i] = matriz[i][j];
        }
    }

    printf("Matriz original:\n");
    for(i = 0; i < 2; i++) {
        for(j = 0; j < 2; j++) {
            printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }

    printf("Matriz transposta:\n");
    for(i = 0; i < 2; i++) {
        for(j = 0; j < 2; j++) {
            printf("%d ", transposta[i][j]);
        }
        printf("\n");
    }

    return 0;
}
