class ArrayThree{
public static void main(String ar[]){
int array[]={15,6,16,84,13,48,56,46,97,65};
int n=Integer.parseInt(ar[0]);
int i;
int k=-1;
for(i=0;i<10;i++)
{
if(array[i]==n)
{
k=i;
break;
}
}
System.out.println(k);
}
}
