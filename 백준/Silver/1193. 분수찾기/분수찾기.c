#include <stdio.h>

int main(void)
{
	int i = 1;
	int num;
	scanf("%d", &num);

	while (1)
	{
		if ((i - 1) * 1 / 2 < num && num <= i * (i + 1) / 2)
			break;

		i++;
	}

	int move = i  *(i - 1) / 2;
	int arr = num - move - 1;

	if (i % 2 == 0)
	{
		if (arr == 0)
			printf("%d/%d\n", 1, i);
		
		else
		    printf("%d/%d\n", 1 + arr, i - arr);
	}
	else
	{
		if (arr == 0)
			printf("%d/%d", i - arr, 1);
		else
			printf("%d/%d\n", i - arr, 1 + arr);
	}
		



	return 0;
}