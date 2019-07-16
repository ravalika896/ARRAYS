class ArrayFive{
public static void main(String ar[]){
int a[]={5,7,2,9,40,63,53};
int n=a.length;
int i,j;
int temp=0;
for(i=0;i<n;i++)
{
for(j=0;j<i+1;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
if(a[i]>a[j])
{
temp=a[j];
a[j]=a[i];
a[i]=temp;
}
}
}
System.out.println(temp);
}
}