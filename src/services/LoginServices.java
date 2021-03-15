public interface LoginServices
{
    String generateUserName();
    String generatePassword();
    String encryptPassword();
    String decryptPassword();
    boolean checkPassword();
    boolean checkEmail();
    boolean verifyPassword();
    int generateUserId();
}