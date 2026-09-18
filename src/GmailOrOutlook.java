public class GmailOrOutlook {
    public static boolean isGmailOrOutlook(String email) {
        if (email.isEmpty()) {
            return false;
        }
        String emailCase = email.toLowerCase().trim();
        String[] parts = emailCase.split("@");
        if (parts.length != 2) {
            return false;
        }
        String user = parts[0];
        String mail = parts[1];
        if (user.isEmpty() || !user.matches("[a-z0-9]+$")) {
            return false;
        }
        return mail.equals("gmail.com") || mail.equals("outlook.com");
    }
}