package pattern.builder;

public class Main {

    public static void main(String[] args) {

        Contact contact = new Contact.ContactBuilder()
                .name("Ivan")
                .surname("Ivanov")
                .address("23 street")
                .phone("+734528915")
                .email("123@gmail.com")
                .build();

        showPersonContact(contact);

    }

    private static void showPersonContact(Contact person) {
        System.out.println(person.toString());
    }
}
