#include <stdio.h>
#include <locale.h>

#define tam 10

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int v[tam];
    int i, p;

    for (i = 0; i < tam; i++)
    {
        printf("Insira o elemento na posicao %d : ", i + 1);
        scanf("%d", &v[i]);
    }

    printf("\nArray original: ");
    for (i = 0; i < tam; i++) {
        printf("%d, ", v[i]);
    }
    
    printf("\n\nInsira a posicao para eliminar: ");
    scanf("%d", &p);
    
    p = p - 1; 

    
    for (i = p; i < tam - 1; i++) {
            v[i] = v[i + 1];
        }
        
        v[tam - 1] = 0;

        printf("\nArray depois de excluida a posicao: ");
        for (i = 0; i < tam; i++) {
            printf("%d, ", v[i]);
        }
        printf("\n");
    

    return 0;
}
