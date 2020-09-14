
public class Application {

    public int[] StringToDigitArray(String str_num) {
        int nums = Integer.parseInt(str_num);
        int[] digitsArray = new int[4];

        for(int i = 3; i >= 0; i--) {
            digitsArray[i] = nums%10;
            nums /= 10;
        }
        return digitsArray;

    }

    public String DigitArrayToString(int[] digitArray) {
        String digitString = "";
        StringBuilder sb = new StringBuilder(digitString);
        for(int i = 0; i < 4; i++) {
            sb.append(digitArray[i]);
        }

        return sb.toString();
    }
    public int[] SwapOneThreeAndTwoFour(int [] digitsStepTwo) {

        int temp1 = digitsStepTwo[0];
        int temp2 = digitsStepTwo[1];

        digitsStepTwo[0] = digitsStepTwo[2];
        digitsStepTwo[1] = digitsStepTwo[3];
        digitsStepTwo[2] = temp1;
        digitsStepTwo[3] = temp2;

        return digitsStepTwo;
    }
}