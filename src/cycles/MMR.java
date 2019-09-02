package cycles;

public class MMR {
    public static void main(String[] args){

        String[] text_mass = {"Мама", "Мыла", "Раму"};
        int dlina_mass = text_mass.length;

        for(int e1 = 0; e1 < dlina_mass; e1++){
            for(int e2 = 0; e2 < dlina_mass; e2++){
                for(int e3 = 0; e3 < dlina_mass; e3++){
                    if(e1 != e2 && e1 != e3 && e2 != e3)
                    System.out.println(text_mass[e1] + text_mass[e2] + text_mass[e3]);
                }
            }
        }

        System.out.println(Thread.activeCount());

    }
}
