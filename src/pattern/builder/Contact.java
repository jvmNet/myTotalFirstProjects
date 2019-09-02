package pattern.builder;

public class Contact {

    private final String name;

    private final String surname;

    private final String address;

    private final String phone;

    private final String email;

    @Override
    public String toString() {
        return String.format("name: %s surname: %s address: %s phone: %s email: %s"
                            , this.name
                            , this.surname
                            , this.address
                            , this.phone
                            , this.email);
    }

    private Contact(final ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.surname = contactBuilder.getSurname();
        this.address = contactBuilder.getAddress();
        this.phone = contactBuilder.getPhone();
        this.email = contactBuilder.getEmail();
    }

    public static class ContactBuilder {

        private String name;

        private String surname;

        private String address;

        private String phone;

        private String email;

        public ContactBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public ContactBuilder surname(final String surname) {
            this.surname = surname;
            return this;
        }

        public ContactBuilder address(final String address) {
            this.address = address;
            return this;
        }

        public ContactBuilder phone(final String phone) {
            this.phone = phone;
            return this;
        }

        public ContactBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getAddress() {
            return address;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}
