#include <stdio.h>

int main() {
    int n;
    float nota, soma = 0.0, media;

    printf("Digite o número de notas: ");
    scanf("%d", &n);

    for(int i = 0; i < n; i++) {
        printf("Digite a nota %d: ", i + 1);
        scanf("%f", &nota);
        soma += nota;
    }

    media = soma / n;
    printf("Média: %.2f\n", media);

    if(media >= 9.5) {
        printf("Aprovado\n");
    } else {
        printf("Reprovado\n");
    }

    return 0;
}
