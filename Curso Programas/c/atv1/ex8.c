#include <stdio.h>
#include <math.h>

int main()
{
    double x1,x2,y1,y2,d;

    printf("digite a cordenada do primeiro ponto x e y:");
    scanf("\n%lf \n %lf",&x1,&y1);
    printf("\ndigite a cordenada do segundo ponto x e y:");
    scanf("\n%lf \n %lf",&x2,&y2);

    d = sqrt(pow(x2 - x1,2)+pow(y2 - y1,2));
    printf("A distancia entre os dois pontos e igual a %.2lf.",d);

    return 0;
}
