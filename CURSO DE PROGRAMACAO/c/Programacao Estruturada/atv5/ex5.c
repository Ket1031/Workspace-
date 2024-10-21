#include <stdio.h>

int main() {
    int num;

    printf("Digite um número para ver sua tabuada: ");
    scanf("%d", &num);

    printf("Tabuada do %d:\n", num);
    for(int i = 1; i <= 10; i++) {
        printf("%d x %d = %d\n", num, i, num * i);
    }

    return 0;
}
