#include<stdio.h>
#include<stdlib.h>

int zero()
{
    int val = 0;
    printf("%d\n", val);
    return 0;
}

int nameReverse()
{
    char name[7] = "Nathan";
    char rName[7] = "Nathan";
    printf("%s\n", name);

    for (int i = 0; i < 7; i++)
    {
        rName[i] = name[5-i];
    }

    printf("%s\n", rName);
    return 0;
}

int guessingGame()
{
    int val1 = rand() % 9;
    int val2 = rand() % 9;
    
    int guess1 = 0, guess2 = 0, points = 1110;

    printf("Please guess the first number.\n");
    scanf("%d", &guess1);
    printf("Please guess the first number.\n");
    scanf("%d", &guess2);

    if (val1 == guess1 && val2 == guess2)
    {
        points = 100;
    }

    else if (val1 == guess2 && val2 == guess1)
    {
        points = 50;
    }

    else if (val1 != guess1 && val2 == guess2 || val1 == guess1 && val2 != guess2)
    {
        points = 25;
    }

    else if (val1 != guess2 && val2 == guess1 || val1 == guess2 && val2 != guess1)
    {
        points = 10;
    }

    else
    {
        points = 0;
    }

    printf("You've won %d points!\n", points);

    return 0;
}


int main()
{
    zero();

    nameReverse();

    guessingGame();

    return 0;
}