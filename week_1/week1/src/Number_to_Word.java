import java.util.Scanner;
public class Number_to_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String onesResult = "";
        String tensResult = "";
        String hundredsResult = "";

        System.out.println("Input number: ");
        number = scanner.nextInt();

        int hundreds = number / 100, tens = number % 100 / 10, ones = number % 100 % 10;

        if (number < 0 || number > 1000) {
            System.out.println("Out of ability");
        }
        else if (number == 0) {
            onesResult = "Zero";
        } else if (number == 10) {
            onesResult = "Ten";
        } else if (number > 10 && number < 20) {
            switch (number) {
                case 11:
                    onesResult = "Eleven";
                    break;
                case 12:
                    onesResult = "Twelve";
                    break;
                case 13:
                    onesResult = "Thirteen";
                    break;
                case 14:
                    onesResult = "Fourteen";
                    break;
                case 15:
                    onesResult = "Fifteen";
                    break;
                case 16:
                    onesResult = "Sixteen";
                    break;
                case 17:
                    onesResult = "Seventeen";
                    break;
                case 18:
                    onesResult = "Eighteen";
                    break;
                case 19:
                    onesResult = "Nineteen";
                    break;
            }
        } else {
            switch (ones) {
                case 1:
                    onesResult = "One";
                    break;
                case 2:
                    onesResult = "Two";
                    break;
                case 3:
                    onesResult = "Three";
                    break;
                case 4:
                    onesResult = "Four";
                    break;
                case 5:
                    onesResult = "Five";
                    break;
                case 6:
                    onesResult = "Six";
                    break;
                case 7:
                    onesResult = "Seven";
                    break;
                case 8:
                    onesResult = "Eight";
                    break;
                case 9:
                    onesResult = "Nine";
                    break;
            }
            switch (tens) {
                case 1:
                    switch (ones) {
                        case 1:
                            onesResult = "Eleven";
                            break;
                        case 2:
                            onesResult = "Twelve";
                            break;
                        case 3:
                            onesResult = "Thirteen";
                            break;
                        case 4:
                            onesResult = "Fourteen";
                            break;
                        case 5:
                            onesResult = "Fifteen";
                            break;
                        case 6:
                            onesResult = "Sixteen";
                            break;
                        case 7:
                            onesResult = "Seventeen";
                            break;
                        case 8:
                            onesResult = "Eighteen";
                            break;
                        case 9:
                            onesResult = "Nineteen";
                            break;
                    }
                    break;
                case 2:
                    tensResult = "Twenty ";
                    break;
                case 3:
                    tensResult = "Thirty ";
                    break;
                case 4:
                    tensResult = "Forty ";
                    break;
                case 5:
                    tensResult = "Fifty ";
                    break;
                case 6:
                    tensResult = "Sixty ";
                    break;
                case 7:
                    tensResult = "Seventy ";
                    break;
                case 8:
                    tensResult = "Eighty ";
                    break;
                case 9:
                    tensResult = "Ninety ";
                    break;
            }
            switch (hundreds) {
                case 1:
                    hundredsResult = "One hundred and ";
                    break;
                case 2:
                    hundredsResult = "Two hundreds and ";
                    break;
                case 3:
                    hundredsResult = "Three hundreds and ";
                    break;
                case 4:
                    hundredsResult = "Four hundreds and ";
                    break;
                case 5:
                    hundredsResult = "Five hundreds and ";
                    break;
                case 6:
                    hundredsResult = "Six hundreds and ";
                    break;
                case 7:
                    hundredsResult = "Seven hundreds and ";
                    break;
                case 8:
                    hundredsResult = "Eight hundreds and ";
                    break;
                case 9:
                    hundredsResult = "Nine hundreds and ";
                    break;
            }
        }
        System.out.println(hundredsResult + tensResult + onesResult);
    }
}

