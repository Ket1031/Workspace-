#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int num1,num2,m,s;

    printf("Digite um numero: ");
    scanf("%d",&num1);

    printf("Digite outro numero: ");
    scanf("%d",&num2);

    m = num1 * num2;
    s = num1 + num2;

    if(m <= 1000)

        printf ("O resultado do produto entre %d e %d e igual a %d: ",num1,num2,m);

    else
    
        printf ("O resultado a soma entre %d e %d e igual a %d: ",num1,num2,s);


    return 0;
}