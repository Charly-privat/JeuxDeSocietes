package LoupGarou.Code.Roles;

public enum lg {
    LOUPALPHA("Loup Alpha",
            "Son vote compte double.\n" +
                    "Son aura est inconnue et non obscure.",
            "Le Loup Alpha est un loup-garou normal hormis le fait que son vote compte double.\n" +
                    "Il a aussi la particularité d'avoir une aura inconnue et non obscure.",
            "Éliminer tous les villageois.",
            "Le loup Alpha est l'un des loups les plus \"forts\" (qui sera tué en dernier par le piège du chasseur de bêtes).\n" +
                    "Grâce à son aura inconnue, le loup-alpha peut mentir plus facilement sur son rôle, choisissez un rôle à claim , comme Chasseur de bêtes, Médium, Sorcière et d'autres rôles inconnus. Même si la sorcière & le chasseur de bêtes peuvent être souvent transparents et ainsi la plupart peuvent penser que vous êtes un tueur solo cela peut se reveler utile dans les parties sans Voyante. Vous n'avez pas à claim un rôle le premier jour, mais c'est très important de garder un oeil sur les joueurs et les rôles afin de claim un rôle au bon moment, ce qui peut vous amener beaucoup plus loin.\n" +
                    "Dans une partie rapide et en sandbox vous pouvez claim Médium ou Geôlier et espérer que le vrai médium ou geôlier se révèlent et ainsi avoir une information importante, vous pouvez aussi essayer de faire en sorte que le Tireur leur tire dessus s'ils ne sont pas prouvés en disant qu'ils peuvent être un tueur solo, ce qui peut augmenter les chances que le tireur tire afin de se débarrasser le plus vite possible des tueurs solo, s'il tire vous avez très bien réussi en tant que Loup Alpha."),

    LOUPCHAMAN("Loup Chaman",
             "Peut enchanter un autre joueur (non loup).",
            "Comme les autres loups, le Loup Chaman peut voter pour un joueur à tuer et parler avec les autres loups la nuit.\n" +
                    "Pendant la journée, il peut enchanter un autre joueur (non loup) qui apparaitra comme un Loup Chaman auprès des voyantes et voyantes d'aura.\n" +
                    "Le Loup Chaman ne peut plus utiliser son pouvoir s'il est le dernier loup en vie, et ne peut pas enchanter la première nuit.",
            "Éliminer tous les villageois." ,
            "Après la mort du Loup Chaman, le joueur enchanté le restera jusqu'au matin suivant.\n" +
                    "Il ne peut pas manipuler les infos d'une voyante d'esprit."),

    LOUPGAROU("Loup Garou",
            "Aucun.",
            "Chaque nuit vous devez choisir un joueur à tuer. Même si c'est un rôle basique, il peut servir de support essentiel s'il est bien joué.",
            "Éliminer tous les villageois.",
            "Vous n'avez pas de capacité spéciale.\n" +
                    "Un Villageois Maudit converti est un loup garou normal."),

    LOUPVOYANT("Loup Voyant",
            "Peut découvrir le rôle d'un joueur.",
            "Chaque nuit, vous pouvez sélectionner un joueur pour découvrir son rôle. Si vous êtes le dernier loup-garou en vie ou si vous abandonnez votre capacité, vous devenez un loup-garou ordinaire.",
            "Éliminer tous les villageois.",
            "X");

    private final String nom;
    private final String pouvoir;
    private final String description;
    private final String objectif;
    private final String note;

    lg(String nom, String pouvoir, String description, String objectif, String note) {
        this.nom = nom;
        this.pouvoir = pouvoir;
        this.description = description;
        this.objectif = objectif;
        this.note = note;
    }

    lg() {
        this("Non défini", "Non défini", "Non défini", "Non défini", "Non défini");
    }

    public String getNom() {
        return nom;
    }

    public String getPouvoir() {
        return pouvoir;
    }

    public String getDescription() {
        return description;
    }

    public String getObjectif() {
        return objectif;
    }

    public String getNote() {
        return note;
    }

}
