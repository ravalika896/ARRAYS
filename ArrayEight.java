class ArrayEight{
public static void main(String ar[]){
int a[]={5,2,4,8,6,3,9,1,0};
int r=0,b=0;
int sum=0;
int i,j;
int li=a.length;
for(i=0;i<=li;i++)
{
if(a[i]==4)
{
r=i;
}
if(a[i]==9)
{
b=i;
}
}if(r<b)
{
for(i=0;i<li;i++)
{
if(i<r || i>b)
{
sum=sum+a[i];
}
}
}
else{
for(i=0;i<li;i++)
{
sum=sum+a[i];
}
}
System.out.println(sum);
}
}
