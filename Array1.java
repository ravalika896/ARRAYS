class Array1{
public static void main(String ar[]){
int []a = {1,5,64,5,7};
int sum=0,count=1;
int i;
float aveg;
for(i=0;i<5;i++)
{
sum=sum+a[i];
count++;
}
aveg=sum/count;
System.out.println("SUM IS "+sum+"AVEG IS "+aveg);
}
}