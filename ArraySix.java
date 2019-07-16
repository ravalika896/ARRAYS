class ArraySix{
public static void main(String ar[]){
int i,j,temp;
int a[]={2,6,8,0,7,9};
for(i=0;i<6;i++)
{
for(j=0;j<i+1;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Ascending Order");
for(i=0;i<6-1;i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[6-1]);
}
}