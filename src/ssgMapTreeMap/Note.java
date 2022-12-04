package ssgMapTreeMap;

public class Note
/*
        1)Map'ler key-value structure kullanir
        2)Key'ler unique'dir
        3)Value'lar tekrarli data icerebilir
        4)Map'lerde eleman degil EntrySet kullaniriz.
        5)Key'ler de null tekrarsiz olarak kullanilir
        6)Value'lar null kabul eder.
        7)HashMap'ler EntrySet'leri herhangi bir siralamaya tabi tutmaz, rastgele siralar
        8)Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.
     */{


             /*
            1)Siz "HashMap<String, Double> salaries = new HashMap<>();" kodu yazdiginizda Java memory'de 16 kutu(bucket) iceren bir yapi olusturur ve
              bu yapidaki herbir kutuya index verir. Index'ler 0 dan 15 e kadaradir.
            2)Siz "salaries.put("QA", 110000.00);" kodunu yazdiginizda Java, key icin bir HashCode olusturur bu HashCode'u 15 e boler ve kalani index olarak kullanir.
              Ve bu elemani o index'e yerlestirir.
            3)Yerlestirirken 4'lu bir yapi olusturur, bu yapinin ilk bolumune "HashCode" u, ikinci bolumune "Key" i, ucuncu bolumune "Value" u ve dorduncu bolumune
              "pointer" i koyar. Bu cok bolumlu yapi LinkedList'lerdeki "Node" dur. Yani HashMap bucket'lari koydugu data'yi LinkedList olarak depolar.
            4)Java "null" icin hep HashCode olarak "zero" uretir, o yuzden key null oldugunda
              eleman ilk bucket'a yerlestirilir. Bundan dolayi key'si null olan elemanlar Map in icinde
              genellikle ilk sirada gozukurler.
            5)Java normalde HashCode'lari unique yapar ama bazen trafik kazasi gibi farkli iki eleman icin
              ayni HashCode uretilebilir. Buna "Hash Collision" denir. Hash Collision meshur bir
              Java Development peoblemidir. Bu problemle karsilasildiginda developer'lar bu problemi cozmek icin kodlar yazarlar, ama bu
              Core Java nin konusu degildir.
     */

      /*
            1)HashTable bir map'dir.
            2)HashTable entrySet'leri herhangi bir sirlamaya tabi tutmaz.
            3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe ve synchronized'dir.
            4)HashTable'larda key null olamaz. Key'i null yaparsaniz NullPointerException atar.
            5)HashTable'larda value null olamaz. Value'yu null yaparsaniz NullPointerException atar.

            Note: toString() method'u obje'leri console'da detaylari ile gorebilmek icin class'larin icinde olusturulur.
                  toString() method'unu olusturmadan object'i console'a yazdirirsaniz Java o object'in address'ini yazdirir.

     */
      /*
        1)TreeMap'ler entrySet'leri key'lere gore "natural order" da siralar.
        2)TreeMap'ler en yavas map'lerdir.
        3)TreeMap'ler thread-safe ve syncronized degildir.
     */
}
