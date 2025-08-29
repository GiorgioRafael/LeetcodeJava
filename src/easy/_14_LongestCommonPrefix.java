package easy;

public class _14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        // Primeira verificação: se o array é nulo ou vazio, não há prefixo comum.
        if (strs == null || strs.length == 0) {
            return "";
        }

        // A primeira string do array é o nosso "prefixo de referência".
        // Começamos a comparar todas as outras palavras com ela.
        String firstWord = strs[0];

        // Loop externo: itera por cada caractere do prefixo de referência.
        // O `i` representa o índice do caractere que estamos checando (0, 1, 2...).
        for (int i = 0; i < firstWord.length(); i++) {
            char currentChar = firstWord.charAt(i);

            // Loop interno: itera por todas as outras strings no array (a partir da segunda, j=1).
            for (int j = 1; j < strs.length; j++) {

                // Ponto confuso 1: Verificação de limites
                // Se o índice 'i' for maior que o tamanho da palavra atual,
                // significa que a palavra é mais curta que o prefixo que estamos testando.
                // Isso significa que o prefixo comum deve ser a palavra inteira.
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {

                    // Ponto confuso 2: Lógica de retorno
                    // Se a condição acima for verdadeira, significa que a comparação falhou.
                    // O prefixo comum mais longo é a parte da primeira palavra que
                    // foi comum até o caractere anterior.
                    return firstWord.substring(0, i);
                }
            }
        }

        // Se o loop terminar sem encontrar nenhuma diferença,
        // significa que todas as palavras começam com a primeira palavra completa.
        // O prefixo comum é a própria primeira palavra.
        return firstWord;
    }
}