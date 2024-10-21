#include <stdio.h>
#include <string.h>

int main() {
    char palavra[50]; 
    printf("Digite um nome: ");
    fgets(palavra, 20, stdin);

    palavra[strcspn(palavra, "\n")] = 0;

    strcat(palavra, " foi o nome que inseriu");
    puts(palavra);

    return 0;
}
