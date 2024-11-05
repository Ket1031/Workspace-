#include <stdio.h>
#include <locale.h>
#include <string.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");
    char nome[20];
    char apelido[20];
    char nc[50];

    printf("Digite seu nome: ");
    fgets(nome,20,stdin);
    nome[strcspn(nome, "\n")] = '\0';

    printf("Digite seu apelido: ");
    fgets(apelido,20,stdin);
    apelido[strcspn(apelido, "\n")] = '\0';

    strcpy(nc,apelido);
    strcat(nc, ", ");
    strcat(nc, nome);

    printf("Nome completo: %s",nc);


    return 0;
}
 