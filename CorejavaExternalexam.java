//only valid for words***
public class CorejavaExternalexam {
    public static void main(String args[]) {
        String text = "name My shivkant name name is shivkant name pandey";
        String givenWord = "shivkant";

        String[] textArray = text.split(" ");
        int count = 0;

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].equals(givenWord)) {
                count++;
                System.out.println("Position of found word: " + (i + 1));
                System.out.println("Occurrence found times: " + count);
                System.out.println("Found word: " + textArray[i]);
            }
	
        }
    }
}
//the below code is dry run after succesful testing above code is the created
/*class CorejavaExternalexam{
public static void main(String args[]){
String text="name My shivkant name name is shivkant name pandey";
String givenword="name";
String[] textar=text.split(" ");
int i=0;
int count=0;
int z=1;
int l=text.length();
System.out.println(l);
for (String tex:textar){
//System.out.print(textar[i]+" ");
if (textar[i].equals(givenword)){
count=count+1;
System.out.println("postion of found word : "+ z);
System.out.println("occurance found times : "+count);
System.out.println(textar[i]);
}
z++;
i++;
}



}
}*/