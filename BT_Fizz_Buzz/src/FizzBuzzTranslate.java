public class FizzBuzzTranslate {
    public static String fizzBuzz(int n){
        String text = "";
        if(n%15==0)
            text = "FizzBuzz";
            else if(n%3==0)
            text = "Fizz";
            else if(n%5==0)
            text = "Buzz";
            else
            text = n+ "khong chia het cho ca 3 & 5";
            return text;
    }
}
