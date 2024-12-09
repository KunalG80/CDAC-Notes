public class password{
    
    public static boolean validatePassword(String password){
    
        boolean validatePassword;
                if (validatePassword = true){
        if (password.length()<9){
            return false;
        }
        
        boolean Uppercase = false;
        boolean Lowercase = false;
        for (char c : password.toCharArray()){
            if (Character.isUpperCase(c)){
                Uppercase = true;
            }
            if (Character.isLowerCase(c)){
                Lowercase = true;
            }
        if (!Uppercase || !Lowercase){
            return false;
        }

        boolean Digit = false;
        for (char n : password.toCharArray()){
            if (Character.isDigit(n)){
                Digit = true;
                break;
            }
            if(!Digit){
                return false;
            }
        }

        String specialCharacter = "@#$%";
        boolean SpecialCharacter = false;
        for (char p : password.toCharArray()){
            if (Character.isSpaceChar(p)){
                SpecialCharacter = true;
                break;
            }
            if(!SpecialCharacter){
                return false;
            }
        }
    }
    }else
     (boolean = false)
    }
}