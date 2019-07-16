class ArrayNine{
public static void main(String ar[]){
int a=ar.length;
int i,j;
int arr[][]=new int[4][4];
if(a==4)
{
int k=0;
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
arr[i][j]=Integer.parseInt(ar[k]);
k++;
}
}
System.out.println("the given array is");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
System.out.println("the reverse array is");
for(i=1;i>=0;i--)
{
for(j=1;j>=0;j--)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}
}
