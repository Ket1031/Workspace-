#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    char * nome;

    printf("Digite seu nome: ");
    scanf("%s",&nome);

    return 0;
}
 