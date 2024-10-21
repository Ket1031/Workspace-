#include <stdio.h>

int main() {
    int numeros[10];
    int pares[10];
    int np = 0;

    printf("Digite 10 numeros:\n");
    for(int i = 0; i < 10; i++) {
        scanf("%d", &numeros[i]);
    }

 
    for(int i = 0; i < 10; i++) {
        if(numeros[i] % 2 == 0) {w
            pares[np] = numeros[i];
            np++;
        }
    }

    printf("\nNumeros: ");
    for(int i = 0; i < 10; i++) {
        printf("%d ", numeros[i]);
    }

    printf("\nNumeros pares: ");
    for(int i = 0; i < np; i++) {
        printf("%d ", pares[i]);
    }

    return 0;
}
