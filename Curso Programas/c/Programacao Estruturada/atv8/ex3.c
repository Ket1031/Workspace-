#include <stdio.h>
#include <locale.h>

// declara o valor absoluto
int abs(int num)
{
   if (num < 0)
   {
    return (num * -1);
   }
   else
   {
    return num;
   }
}


int main()
{
    setlocale (LC_ALL, "Portuguese");

    int n;

    printf("Digite um numero: ");
    scanf("%d",&n);

    printf("O valor absoluto do numero e %d",abs(n));

    return 0;
}