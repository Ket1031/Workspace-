#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    char c;

    printf("Digite um caracter: ");
    scanf("%c",&c);

    if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
    
        printf("O caracter e alfabetico");

    else
        if (c >= '0' && c <= '9')
        {
            printf("O caracter e numerico");
        }
        else
            printf("O caracter e especial"); 
    


    return 0;
}