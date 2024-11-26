#include <stdio.h>
#include <locale.h>
#include <string.h>
#include <ctype.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    char string[50];
    char su[50];
    
    printf("Digite alguma coisa: ");
    fgets(string,50,stdin);
    string[strcspn(string,"\n")] = '\0';

    for (int i = 0; string[i] != '\0'; i++)
    {
        su[i] = toupper((unsigned char)string[i]);
    }

    su[strlen(string)] = '\0';
    printf("\n%s\n",su);
    

    return 0;
}
 