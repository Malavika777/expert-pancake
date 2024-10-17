import java.util.HashMap;
import java.util.Scanner;
public class SGC {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    HashMap<String,Integer> map=new HashMap<>();
    int sum=0;
    System.out.println("Enter size: ");
    int size=sc.nextInt();
    for(int i=0;i<size;i++){
        System.out.println("Enter subject: ");
        String subject=sc.next();
        System.out.println("Enter mark:");
        int marks=sc.nextInt();
        map.put(subject,marks);
    }
    for(String key:map.keySet()){
        sum+=map.get(key);
    }
    float size1=size;
    float avg=sum/size1;

    if (avg>90 && avg<100){
        System.out.println("Total Marks: "+sum);
        System.out.printf("Average Percentage:%.2f",avg);
        System.out.println("\nGrade Obtained:O");
    }
    else if(avg >80 && avg<90){
        System.out.println("Total Marks: "+sum);
        System.out.printf("Average Percentage:%.2f",avg);
        System.out.println("\nGrade Obtained:A");
    }
    else if(avg>70 && avg<80){
        System.out.println("Total Marks: "+sum);
        System.out.printf("Average Percentage:%.2f",avg);
        System.out.println("\nGrade Obtained:B");
    }
    else if(avg>60 && avg<70){
        System.out.println("Total Marks: "+sum);
        System.out.printf("Average Percentage:%.2f",avg);
        System.out.println("\nGrade Obtained:D");
    }
    else if(avg>50 && avg<60){
        System.out.println("Total Marks: "+sum);
        System.out.printf("Average Percentage:%.2f",avg);
        System.out.println("\nGrade Obtained:E");
    }
    else{
        System.out.println("Total Marks: "+sum);
        System.out.printf("Average Percentage:%.2f",avg);
        System.out.println("\nGrade Obtained:RA");
    }

}
    
}
