/*
*
* Для теста можно использовать файл
* http://snowball.tartarus.org/algorithms/russian/diffs.txt
*
* */

import stemmer.porter.ru.StemmerPorterRU;

public class StemmerPorterRuTest {

    public static void main(String[] args)
    {
        String word = "чрезвычайно";

        System.out.println(StemmerPorterRU.stem(word));
    }
}
