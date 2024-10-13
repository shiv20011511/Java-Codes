class ComputePrefix{
public static void main(String args[]){
String x="ababbabbabbababbabb";
int[] prefix=computePrefix(x);
System.out.println("\u001b[33m"+"Prefix Series for "+x);
for(int p:prefix){
System.out.print(p+" ");
}
System.out.println();
}

public static int[] computePrefix(String s){
int n=s.length();
int[] pi=new int[n];

for(int i=1;i<n;i++){
int j=pi[i-1];
System.out.println("\u001b[31m"+j);
while(j>0 && s.charAt(i) != s.charAt(j))
j=pi[j-1];
if (s.charAt(i)==s.charAt(j)){
j++;
pi[i]=j;
System.out.println("\u001b[32m"+pi[i-1]);
}

}
return pi;
}

}