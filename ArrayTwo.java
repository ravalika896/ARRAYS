class ArrayTwo{
public static void main(String[] ar){
int []array={67,23,35,65,94,74,28,81,45,65};
int max=array[0],min=array[0];
int i;
for(i=0;i<10;i++)
{
if(array[i]>=max)
max=array[i];
else if(array[i]<=min)
min=array[i];
}
System.out.println("MAX IS"+max+"MIN IS"+min);
}
}