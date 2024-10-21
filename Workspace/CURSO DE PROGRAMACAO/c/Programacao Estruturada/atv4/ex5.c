#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int passaword;

    printf("Digite a Senha: ");
    scanf("%d",&passaword);

    switch (passaword)
    {
    case 1234:
        printf("Bem vindo!");
        break;
    
    default:
        printf("Senha incorreta.");
        break;
    }

    return 0;
}
 