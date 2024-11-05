#include <stdio.h>
#include <locale.h>
#include <string.h>
#include <ctype.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");
    char senha[50];
    int caracteres = 0, digitos = 0, letras = 0, especiais = 0;

    printf("insira a palavra passe. \n\nDeve ter 12 caracteres\nDeve ter 2 digitos\nDeve ter 2 caracteres especiais ");
    
    printf("\n\nSenha: ");
    fgets(senha,50,stdin);
    senha[strcspn(senha,"\n")] = '\0';

    for(int i = 0; senha[i] != '\0'; i++)
    {
        caracteres++;

        if (isdigit(senha[i]) > 0)
        {
             digitos++;
        }

        else if(isalpha(senha[i]) > 0 )
        {
             letras++;
        }
        else
            especiais++;
        
    }

    /*
    printf("\ncaracteres: %d",caracteres);
    printf("\nDigitos: %d", digitos);
    printf("\nletras: %d", letras);
    printf("\nEspeciais: %d", especiais);
    */

   if((caracteres = 12) && (digitos >= 2) && (especiais >= 2))
   {
        printf("Palavra passe registrada com sucesso!");
   }
   else if (digitos < 2)
   {
        printf("A palavra passe deve conter no minimo 2 digitos!");
   }
   else if (especiais < 2)
   {
        printf("A palavra passe deve conter no minimo 2 caracteres especiais!");
   }
   else if (caracteres != 12)
   {
        printf("A palavra passe deve conter no minimo 12 caracteres!");
   }
   else
        printf("Palavra passe invalida. tente novamente!");
   


    return 0;
}
 