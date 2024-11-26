#include <stdio.h>

int main()
{
    int id,faltas;
    float horas,vh,vd,salario;
    printf("Digite o numero de identificacao: ");
    scanf("%d",&id);
    printf("Digite o total de horas trabalhadas por mes: ");
    scanf("%f",&horas);
    printf("Digite o numero de faltas: ");
    scanf("%d",&faltas);
    printf("Digite o valor recebido por hora: ");
    scanf("%f",&vh);

    vd = (horas * vh) / 22;
    salario = vd * (22 - faltas);

    printf("identificacao do funcionario: %d\n",id);
    printf("Salario mensal total de: %.2f\n",salario);



    return 0;
}