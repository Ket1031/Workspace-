#include <stdio.h>
#include <locale.h>



int main()
{
    setlocale (LC_ALL, "Portuguese");

   //Questão 1

    int n1,n2,n3;
    float media; 

    printf("insira os valores de venda: \n");
    scanf("%d %d %d",&n1,&n2,&n3);

    media = (n1+n2+n3)/3;

    printf("\nA media de vendas corresponde a: %.1f",media);

    if(media >100)
        printf("\nOnjetivo ultrapassado."); 
    else if(media == 100)
        printf("\nObjetivo atingido.");
    else
        printf("\nObjetivo não alcancado.");

    // Questao 2

     char nomes[5][21]; 
    
      printf("\nInsira 5 nomes: \n");
      for(int i = 0; i < 5; i++) {
        scanf("%20s", nomes[i]);
      }
    
      printf("\nNomes inseridos:\n");
      for(int i = 0; i < 5; i++) {
        printf("%s\n", nomes[i]);
     }

    // Questao 3
 
    int tipo;
    float vb, irs, vl;
    
    printf("\nInsira o tipo de funcionario. \n99 sair");
    while(1) {
        printf("\nFuncionario: ");
        scanf("%d", &tipo);
        
        if(tipo == 99) break;
        
        switch(tipo) {
            case 1:
                vb = 1000;
                irs = 0.05;
                break;
            case 2:
                vb = 1200;
                irs = 0.06;
                break;
            case 3:
                vb = 1500;
                irs = 0.07;
                break;
            default:
                printf("Tipo de funcionario invalido.\n");
                continue; 
        }
        
        vl = vb - (vb * irs);
        printf("\nVencimento liquido: %.2f\n", vl);
    }

    // Questao 4
    
    float maximas[5], minimas[5], medias[5];
    
    printf("Insira 5 temperaturas maximas:\n");
    for(int i = 0; i < 5; i++) {
        scanf("%f", &maximas[i]);
    }
    
    printf("Insira 5 temperaturas minimas:\n");
    for(int i = 0; i < 5; i++) {
        scanf("%f", &minimas[i]);
    }
    
    for(int i = 0; i < 5; i++) {
        medias[i] = (maximas[i] + minimas[i]) / 2;
    }
    
    printf("\nMedias das temperaturas:\n");
    for(int i = 0; i < 5; i++) {
        printf("Local %d: %.2f\n", i + 1, medias[i]);
    }

    return 0;
}
 