import java.util.*;

public class BatchEmails {

    public static void main(String[] args) {
        Email email1 =
                new Email("Gemini", "sandeep@ukg.com", "This is subject", "Hello XYZ");
        Email email2 =
                new Email("Gemini", "anjesh@ncr.com", "This is subject", "Hello PQR");
        Email email3 =
                new Email("Gemini", "anjesh@ncr.com", "This is subject", "Hello ABC");
        Email email4 =
                new Email("Gemini", "anjesh@ncr.com", "This is subject", "Hello LMN");
        List<Email> list = new ArrayList<>();
        list.add(email1);
        list.add(email2);
        list.add(email3);
        list.add(email4);

        List<List<Email>> listList = new ArrayList<>();
        List<Email> emails = new ArrayList<>();
        Set<String> emailStrings = new HashSet<>();

        for (Email email : list) {
            if (emailStrings.add(email.to)) {
                emails.add(email);
            } else {
                listList.add(new ArrayList<>(emails));
                emails.clear();
                emailStrings.clear();

                emailStrings.add(email.to);
                emails.add(email);
            }
        }
        if (!emailStrings.isEmpty()) {
            listList.add(new ArrayList<>(emails));
            emails.clear();
            emailStrings.clear();
        }

        listList.forEach(mail -> {
            System.out.println("Batch:\n"+mail+"\n");
        });
    }
}
