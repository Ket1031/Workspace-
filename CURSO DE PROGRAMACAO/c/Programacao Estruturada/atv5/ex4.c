#include <stdio.h>

int main() {
    int num, divisores = 0;

    printf("Digite um número inteiro positivo: ");
    scanf("%d", &num);

    for(int i = 1; i <= num; i++) {
        if(num % i == 0) {
            divisores++;
        }
    }

    printf("Número de divisores de %d: %d\n", num, divisores);
    return 0;
}
