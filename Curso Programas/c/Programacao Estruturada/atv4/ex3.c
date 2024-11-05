#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int codigo;

    printf("Digite o codigo do produto: ");
    scanf("%d",&codigo);

    switch (codigo)
    {
    case 1:
        printf("Alimento nao perecivel");
        break;
    case 2:
    case 3:
    case 4:
        printf("Alimento perecivel");
        break;
    case 5:
    case 6:
        printf("Vestuario");
        break;
    case 7:
        printf("Higiene pessoal");
        break;
    case 8:
    case 9:
    case 10:
    case 11:
    case 12: 
    case 13:
    case 14:
    case 15: 
        printf("Limpeza e utensilhos domesticos");
        break;
    default:
        printf("Codigo Invalido");
        break;
    }

    return 0; 
}
 