#include <stdio.h>

int main() {
    int matriz[3][3];
    int i, j, sl, st = 0;
    float media;

    printf("Insira os numeros na matriz: \n");
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("Matriz: \n");
    for(i = 0; i < 3; i++) {
        sl = 0;
        for(j = 0; j < 3; j++) {
            printf("%d ", matriz[i][j]);
            sl = sl + matriz[i][j];
        }
        printf("Soma da linha %d: %d \n", i + 1, sl);
        st = st + sl;
    }

    media = st / 9;
    printf("Media dos numeros da matriz: %.2f\n", media);

    return 0;
}
