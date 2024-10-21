#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int alunos, alunas;

    printf("Digite a quantidade de alunos: ");
    scanf("%d",&alunos);

    printf("Digite a quantidade de alunas: ");
    scanf("%d",&alunas);

    if(alunos > alunas)
        printf(" Quantidade de alunos: %d\n Quantidade de alunas: %d",alunos,alunas);
    else 
         if(alunos < alunas)
             printf(" Quantidade de alunas: %d\n Quantidade de alunos: %d",alunas,alunos);
         else 
            printf("A quantidade de alunos e alunas e igual");
           


    return 0;
}