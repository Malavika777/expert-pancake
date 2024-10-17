import java.util.*;

public class Random1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Only 10 ATTEMPTS will be provided");
        int rand=random.nextInt(101);
        int i=0;
        while (i!=10){
            System.out.println("Please enter a Number(0 to 100):");
            int user=sc.nextInt();
            if (user==rand){
                if(i<3){
                    System.out.println("Congratulations! You've guessed the number correct on attempt " +(i+1));
                    System.out.println("You're score is : 50");
                    break;
                }
                else if(i<7){
                    System.out.println("Congratulations! You've guessed the number right on attempt: " +(i+1));
                    System.out.println("You're score is:25");
                    break;
                }
                else if(i<10){
                    System.out.println("Congratulations! You've guessed the number right on attempt: " +(i+1));
                    System.out.println("You're score is:5");
                    break;
                }
            }
            else if(user<rand){
                System.out.println("Guessed number is low.");
                System.out.println("Please try again!");
                i++;
            }
            else if(user>rand){
                System.out.println("Guessed number is high.");
                System.out.println("Please try again!");
                i++;
            }
        }
    }
    
    
}
