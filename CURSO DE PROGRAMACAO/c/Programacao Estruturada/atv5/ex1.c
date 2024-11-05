#include <stdio.h>

int main() {
    int soma = 0;
    printf("Multiplos de 5 dos primeiros 100 números naturais:\n");
    for(int i = 1; i <= 100; i++) {
        if(i % 5 == 0) {
            printf("%d ", i);
            soma += i;
        }
    }
    printf("\nSoma dos múltiplos de 5: %d\n", soma);
    return 0;
}
