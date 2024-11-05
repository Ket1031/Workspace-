#include <stdio.h>
#include <locale.h>
#include <string.h>
#include <ctype.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    char string[20];
    int letras = 0, digitos = 0, especiais = 0;

    printf("Digite alguma coisa: ");
    fgets(string,20,stdin);
    string[strcspn(string,"\n")] = '\0';

    for(int i = 0; string[i] != '\0'; i++)
    {
        if(isalpha(string[i]) >0)
            letras++;
        else if(isdigit(string[i]) > 0)
            digitos++;
        else
            especiais++;
    }

    printf("\n Quantidade de Letras: %d",letras);
    printf("\n Quantidade de Digitos: %d",digitos);
    printf("\n Quantidade de Especiais: %d",especiais);
  
    

    return 0;
}
 