#include <stdio.h>
#include <locale.h>
#include <ctype.h>

//inverte maiuscula e minuscula

int invercao(int caracter)
{
    if (isalpha(caracter) > 0)
        if (isupper(caracter) > 0)
            {
                 return tolower(caracter); 
            }
        else 
            { 
                return toupper(caracter);
            }
    else
        return caracter;
}


int main()
{
    setlocale (LC_ALL, "Portuguese");

    int r;
    char c;

    printf("Digite um caracter: ");
    scanf("%c",&c);

    r = invercao(c);

    printf("Retorno: %c",r);


    return 0;
}
 