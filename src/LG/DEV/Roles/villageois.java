package LoupGarou.Code.Roles;

public enum villageois {
    DOCTEUR("Docteur",
            "Peut soigner un autre joueur.",
            "Chaque nuit, le Docteur choisit un joueur pour le protéger.\n" +
                    "Si ce joueur est attaqué, il ne pourra pas être tué cette nuit.\n" +
                    "Il peut protéger toutes les nuits du temps qu'il est en vie mais il ne peut pas se protéger lui-même.",
            "Éliminer tous les Loup Garous.",
            "Le docteur fût l'un des tous premiers rôles ajoutés dans le jeu.\n" +
                    "\"Med\" ne signifie pas médecin mais Médium."),

    GARDEDUCORPS("Garde du Corps",
            "Peut protéger un joueur.",
            "Choisissez un joueur à protéger chaque nuit. Cette personne ne pourra pas être tuée pendant cette nuit et vous serez attaqué à sa place.\n" +
                    "De plus, votre force vous permet, une seule fois, de survivre à une attaque nocturne. Vous faites partie du village. ",
            "Éliminer tous les Loup Garous.",
            "Le garde du corps fût l'un des premiers rôles ajouté dans le jeu."),

    GEOLIER("Geôlier",
            "Peut enfermer un joueur la nuit et le tuer (s'il juge cela nécessaire).",
            "Durant la journée, le Geôlier peut emprisonner un joueur pour la nuit suivante. La nuit, il peut parler en privé avec son prisonnier. Ce dernier ne peut pas utiliser ses capacités ni être tué si il est attaqué.\n" +
                    "Une fois dans la partie, le Geôlier peut tuer un prisonnier qu'il trouve suspect. La personne enfermée aura des barreaux au dessus de son avatar, cela peut être vu par la cible et le geôlier et si la cible est un loup-garou, les autres loups-garous pourront le voir. ",
            "Éliminer tous les Loup Garous.",
            "Il ne peut y avoir qu'un seul geôlier par partie.\n" +
                    "Son icône de selection est la même mais légèrement moins détaillée."),

    MAIRE("Maire",
            "Son vote compte double.",
            "Le Maire est un villageois tout à fait normal tant qu'il n'a pas utilisé son pouvoir, il peut se révéler aux yeux de tout le monde et obtient par la même occasion un vote qui compte double jusqu'à la fin de la partie.",
            "Éliminer tous les Loup Garous.",
            "X"),

    MEDIUM("Medium",
            "Peut parler avec les morts chaque nuit.\n" +
                    "Peut également ressusciter un joueur mort.",
            "Pendant la nuit, le Médium peut parler de façon anonyme aux joueurs morts. Ces derniers ne connaissent donc pas son identité. Une fois par partie, il peut ressusciter un joueur mort.",
            "Éliminer tous les Loup Garous.",
            "S'il y a plusieurs médiums dans la même partie, ils ne connaîtront pas les numéros des autres mais pourront tous parler dans le même chat.\n" +
                    "Si le médium sélectionne quelqu'un à ressusciter et meurt au milieu de la nuit, la personne sera quand même ressuscitée.\n" +
                    "Le Médium est souvent appelé simplement \"Med\".\n" +
                    "C'est aussi un rôle de Wolvesville Classic et il est connu sous le nom de Nécromancier dans ce jeu."),

    TIREUR("Tireur",
            "Peut tirer sur un ou plusieurs joueurs.",
            "",
            "Éliminer tous les Loup Garous.",
            ""),

    VOYANTE("Voyante",
            "Peut observer le rôle d'un joueur chaque nuit.",
            "",
            "Éliminer tous les Loup Garous.",
            ""),

    VOYANTEAURA("Voyante d'Aura",
            "Peut observer l'aura d'un joueur chaque nuit.",
            "",
            "Éliminer tous les Loup Garous.",
            "");

    private final String nom;
    private final String pouvoir;
    private final String description;
    private final String objectif;
    private final String note;

    villageois(String nom, String pouvoir, String description, String objectif, String note) {
        this.nom = nom;
        this.pouvoir = pouvoir;
        this.description = description;
        this.objectif = objectif;
        this.note = note;
    }

    villageois() {
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
