package LG.DEV.Roles;

public enum solo {
    CHASSEURDETETES("Chasseur de têtes",
            "Aucun.",
            "Une cible vous est désignée lors de la première nuit. Vous gagnez si votre cible se fait tuer par le village lors du vote diurne (et vous devez toujours être en vie).\n" +
                    "Si la cible meurt d'une autre façon, vous deviendrez un villageois normal.",
            "Éliminer sa cible au vote.\n" +
                    "Si sa cible est déjà morte, il peut gagner avec le village.",
            "Certains rôles auront tendance à ne pas être la cible du chasseur de têtes: Le Tireur, le Maire, l'Enfant fleur, le Prêtre, le Pacifiste et le Villageois Maudit mais en parties personnalisées tous les rôles peuvent l'être, y compris ces exceptions.\n" +
                    "Si le fou est la cible du chasseur de têtes, le fou gagne.\n" +
                    "Si le chasseur de tête meurt en même temps que sa cible est votée (par exemple parce que sa cible est vengeur), le chasseur de têtes gagne quand même.\n" +
                    "Le détective verra toujours le chasseur de têtes comme solo et le tireur d'élite pourra quand même tuer le chasseur de têtes même si sa cible est morte.\n" +
                    "Le chasseur de têtes peut être converti en Zombie ou en Complice.\n" +
                    "Tant qu'il est en vie, sa cible ne peut pas être converti en loup-garou ou en complice, elle ne peut aussi pas être mordue par un zombie sauf si le chasseur de têtes est mort ou lui-même zombie.\n" +
                    "Si sa cible est tué et réanimé par le Médium, le chasseur de têtes restera villageois."),

    CORRUPTEUR("Corrupteur",
            "Corrompre un joueur.",
            "Chaque nuit, vous pouvez choisir un joueur à corrompre. Ce joueur ne pourra ni parler ni voter le jour suivant et mourra à la fin de la journée.\n" +
                    "Le rôle du joueur ne sera pas révélé à sa mort et sera remplacé par un point d'interrogation et ne pourra pas être réanimé par le Médium. Vous ne pouvez pas être tué par les loups-garous",
            "Être le dernier joueur en vie.",
            "Si le corrupteur meurt avant la fin du jour, la personne corrompue sera sauvée, mais ne pourra écrire et voter qu'a la journée suivante."),

    FOU("Fou",
            "Aucun.",
            "Votre but est d'être éliminé durant le vote diurne. Vous gagnez si vous êtes éliminé de cette façon.",
            "Être éliminé durant le vote diurne.",
            "Si le fou est la cible du chasseur de têtes et se fait voter (parties personnalisées), le fou gagne.\n" +
                    "Le fou est alterné avec le chasseur de têtes dans les compositions.\n" +
                    "Sa condition de victoire annule toute les autres.\n" +
                    "Il peut mentir sur un rôle afin d'essayer de se faire lyncher.\n" +
                    "S'il est dernier survivant, le village gagne."),

    VILLAGEOISMAUDIT("Villageois Maudit",
            "Aucun.",
            "Il fait partie du village et gagne avec le village. Mais il peut se faire mordre et rejoindre les loups-garous. Il sera un simple loup-garou.",
            "Gagner avec le village sauf s'il se fait mordre.\n" +
                    "Si c'est le cas, gagner avec les loups.",
            "Il peut se faire protéger par le docteur, le garde du corps, le geôlier et le bodybuilder.");

    private final String nom;
    private final String pouvoir;
    private final String description;
    private final String objectif;
    private final String note;

    solo(String nom, String pouvoir, String description, String objectif, String note) {
        this.nom = nom;
        this.pouvoir = pouvoir;
        this.description = description;
        this.objectif = objectif;
        this.note = note;
    }

    solo() {
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