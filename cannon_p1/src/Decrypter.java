public class Decrypter {
    //String a = "";
    Application app = new Application();

    public String decrypt(String str) {
        int[] digits = app.StringToDigitArray(str);
        digits = app.SwapOneThreeAndTwoFour(digits);
        digits = StepTwoDecrypt(digits);
        str = app.DigitArrayToString(digits);

        return (str);
    }
    public int[] StepTwoDecrypt(int [] digitsStepOne) {
        for(int i = 0; i < 4; i++) {
            digitsStepOne[i] = ((digitsStepOne[i] + 10)-7)%10;
        }
        return digitsStepOne;
    }
    public static void main(String[] args) {
        String DecryptedValue = new Decrypter().decrypt("0189");
        System.out.println(DecryptedValue);
    }
}
