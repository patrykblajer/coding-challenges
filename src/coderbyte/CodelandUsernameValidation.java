package coderbyte;

class CodelandUsernameValidation {
    public static void main(String[] args) {
        codelandUsernameValidation("test");
    }

    public static String codelandUsernameValidation(String str) {

        if (str.matches("^(?!.*_+$)[A-Za-z][A-Za-z0-9_]{2,24}$")) {
            return "true";
        }

        return "false";
    }
}