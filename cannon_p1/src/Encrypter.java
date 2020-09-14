
class Encrypter {

    Application app = new Application();

    public String encrypt(String str) {
        int[] digits = app.StringToDigitArray(str);
        digits = StepOneEncrypt(digits);
        digits = app.SwapOneThreeAndTwoFour(digits);
        str = app.DigitArrayToString(digits);

        return (str);
    }
    public int[] StepOneEncrypt(int [] digitsStepOne) {
        for(int i = 0; i < 4; i++) {
            digitsStepOne[i] = (digitsStepOne[i] + 7) % 10;
        }
        return digitsStepOne;
    }
    public static void main(String[] args) {
        String EncryptedValue = new Encrypter().encrypt("1234");
        System.out.println(EncryptedValue);
    }
}
