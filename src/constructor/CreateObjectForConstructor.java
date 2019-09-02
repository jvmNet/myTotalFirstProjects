package constructor;

public class CreateObjectForConstructor {
    public Color color;

    public static void main(String[] args) {
        CreateObjectForConstructor circle = new CreateObjectForConstructor();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());



    }

    public CreateObjectForConstructor() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
