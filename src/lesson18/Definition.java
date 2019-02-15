package lesson18;

public class Definition {

    private void notifyUsers(String[] userEmails) {

        for (String email : userEmails) {

            try {
                System.out.println("Email " + email + " was sent");
            } catch (Exception e) {
                System.out.println("Email " + email + " was not sent");
//            }catch (Exception e1){
//
            } finally {

            }
        }
    }
}
