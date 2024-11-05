#include <stdio.h>
#include <locale.h>
#include <string.h>
#include <ctype.h>

char* maiusculas(char string[50])
{
    int tamstr = strlen(string);

    for(int i = 0; i < tamstr; i++)
        {
          string[i] = toupper(string[i]);
        }

    return string;

}

int main()
{
    setlocale (LC_ALL, "Portuguese");

    char s[50];

    printf("Digite algo: ");
    fgets(s,sizeof(s),stdin);

    printf("upper: %s",maiusculas(s));

    return 0;
}

 