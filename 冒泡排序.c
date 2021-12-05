#include <stdio.h>
void BubbleSort_1(int *arr,int n)
{
	int nflag;
	do
	{
		nflag=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				nflag=i+1;
			}
		}
		n=nflag;
	}while(nflag);
}
void BubbleSort_2(int *arr,int n)
{
		
	int left=0;
	int right=n-1;
	int flag;
	while(left<right)
	{
		flag=0;
		for(int i=left;i<right;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				flag=i;
			}
		}
		right=flag;
		if(left>=right)
			break;
		for(int i=right;i>left;i--)
		{
			if(arr[i]<arr[i-1])
			{
				int temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
				flag=i;
			}
		}
		left=flag;
	}
}
int main()
{
	int arr1[10]={3,5,4,7,1,0,9,2,6,8};
	int arr2[10]={3,5,4,7,1,0,9,2,6,8};
	BubbleSort_1(arr1,10);
	BubbleSort_2(arr2,10);
	for(int i=0;i<10;i++)
		printf("%d ",arr1[i]);
	printf("\n");
	for(int i=0;i<10;i++)
		printf("%d ",arr2[i]);	
	return 0;
}
