package mock;

public class InimigoConst {
    public static String SKELETON =
            """
                    { "nome": "Skeleton",\s
                     \
                    "qtdVida": 200,\s
                     \
                    "arma": "Espada do Skeleton" }""";

    public static String ARANHA =
            """
                    { "nome": "Aranha",\s
                     \
                    "qtdVida": 20, \s
                     \
                    "arma": "Ferrão" }""";

    public static String INEXISTENTE =
            """
                    { "nome:" "NULL", \s
                     \
                     "qtdVida: -9999, \s
                     \
                     "arma:" "Undefined_Weapon" \s
                    }""";
}
