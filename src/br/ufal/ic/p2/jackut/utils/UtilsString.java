package br.ufal.ic.p2.jackut.utils;

import java.util.ArrayList;
import java.util.Map;


/**
 * <p> Classe com m�todos utilit�rios para {@code String}. </p>
 */

public class UtilsString {

    /**
     * <p> Formata um ArrayList para uma {@code String}. </p>
     * <p> O formato �: "{elemento1,elemento2,...,elementoN}". </p>
     *
     * @param cartao_lista ArrayList a ser formatado.
     * @param <T>       Tipo do ArrayList.
     * @return          String formatada.
     */

    public static <T> String formatArrayList(ArrayList<String> cartao_lista) {
        if (cartao_lista.isEmpty()) {
            return "{}";
        }

        StringBuilder formattedString = new StringBuilder("{");
        for (int i = 0; i < cartao_lista.size(); i++) {
            formattedString.append(cartao_lista.get(i).toString());
            if (i != cartao_lista.size() - 1) {
                formattedString.append("@");
            }
        }
        formattedString.append("}");
        return formattedString.toString();
    }
}
