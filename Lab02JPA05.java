import java.util.Scanner;

public class Lab02JPA05 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        for (int i =0 ; i <4; i++ ){
            System.out.println("Enter an integer:");
            if (input1.hasNextInt()){
                int number1 = input1.nextInt();
            
                if (number1 %2 == 0 && number1 %3 ==0 && number1 %6==0){
                    System.out.println(number1+"是2，3，6的倍數");
                }
                else if (number1 %2 == 0 && number1 %3==0 ) {
                    System.out.println(number1+"是2，3的倍數");
                }
                else if (number1 %2 == 0 && number1 %6==0 ) {
                    System.out.println(number1+"是2，6的倍數");
                }
                else if (number1 %3 == 0 && number1 %6==0 ) {
                    System.out.println(number1+"是3，6的倍數");
                }
                else if (number1 %2 == 0 ) {
                    System.out.println(number1+"是2的倍數");
                }
                else if (number1 %3==0 ) {
                    System.out.println(number1+"是3的倍數");
                }
                else if (number1 %6 == 0 ) {
                    System.out.println(number1+"是6的倍數");
                }else {
                    System.out.println(number1+"不是2，3，6的倍數");
                }
                
            }else{
                System.out.println("格式錯誤，請輸入數字");
                input1.next();
            }
        }
        input1.close();
    }
}