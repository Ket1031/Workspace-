#include <stdio.h>
#include <locale.h>
#include <ctype.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");
    char c;

    printf("Digite um caractere: ");
    scanf("%c", &c);

    char cm = toupper(c);

    printf("Caractere minusculo: %c (ASCII: %d)\n", c, c);
    printf("Caractere maiusculo: %c (ASCII: %d)\n", cm, cm);

    return 0;
}
 