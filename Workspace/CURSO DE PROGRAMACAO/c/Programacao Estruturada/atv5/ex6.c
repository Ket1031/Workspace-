#include <stdio.h>

int main() {
    int linhas;

    printf("Digite o número de linhas do triângulo: ");
    scanf("%d", &linhas);

    for(int i = 1; i <= linhas; i++) {
        for(int j = 1; j <= i; j++) {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}
