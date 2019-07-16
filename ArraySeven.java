import java.util.Arrays;

class ArraySeven{
public static void main(String ar[]){
int i,j=0,temp;
int a[]={2,5,3,2,5,6,8,9,5,1,0,4};
int l=a.length;
Arrays.sort(a);
int t[]=new int[l];
for(i=0;i<12-1;i++)
{
if(a[i]!=a[i+1])
{
a[j++]=a[i];
}
}
a[j++]=a[12-1];
for(i=0;i<j;i++)
{
System.out.println(a[i]+" ");
}
}
}

