package desafio14;

public class Main {
    public static void main(String[] args) {
        Main.removeDuplicates();
    }

    public static void removeDuplicates() {
        String[] names = {
                "Aurora", "Caio", "Caio", "Elisa", "Rafael",
                "Bruno", "Luiza", "João", "Pedro", "Giovana",
                "Pedro", "Carlos", "Nicolas", "Elisa", "Claudia",
                "João", "André", "Luiz", "Leonardo", "Thomas"
        };
        String[] names_format = new String[20];

        for (String name : names) {
            boolean alreadyExists = false;

            for (String s : names_format) {
                if (s != null && s.equals(name)) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                for (int i = 0; i < names_format.length; i++) {
                    if (names_format[i] == null) {
                        names_format[i] = name;
                        break;
                    }
                }
            }
        }

        for (String name : names_format) {
            if (name != null) {
                System.out.println(name);
            }
        }
    }
}