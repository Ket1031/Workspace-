#include <stdio.h>
#include <locale.h>
#include <string.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");
    char p1[20];
    char p2[20];
    char temp[20];

    printf("Digite uma palavra: ");
    fgets(p1,20,stdin);
    p1[strcspn(p1, "\n")] = '\0';

    printf("Digite outra palavra: ");
    fgets(p2,20,stdin);
    p2[strcspn(p2, "\n")] = '\0';

    strcpy(temp,p1);
    strcpy(p1,p2);
    strcpy(p2,temp);

    printf("Agora, a primeira palavra e: %s\n", p1);
    printf("Agora, a segunda palavra e: %s\n", p2);

    return 0;
}
 