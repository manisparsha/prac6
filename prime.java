public class prime{
public static void main(String[] args){
for(int i=2;i<=50;i++){
if(isPrime(i){
System.out.println(i+" ");
}
}
}
public static boolean isPrime(int n){
if(n<=10){
return false;
}
for(int i=2;i<=Math.sqrt(n);i++){
if(n%i==0){
return false;
}
}
return true;
}
}