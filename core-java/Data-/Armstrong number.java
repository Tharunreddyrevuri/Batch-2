public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 370, number, k, sum = 0;

        number = num;
        while (number != 0)
        {
            k = number % 10;
            sum = sum + k*k*k;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}

//     output  :          370  is  a Armstrong number
