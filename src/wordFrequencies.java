public class wordFrequencies {
    // design a method to find the frequencies of occurences of any giiven word in a book.
    // What if we were running this algorithm mutiple times.

    public int countFrequencies(String[] word, String comp) {
        int count = 0;
        for(int i = 0 ; i < word.length; i++) {
            if(word[i].equals(comp)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        wordFrequencies ws = new wordFrequencies();
        String str = "My name is biplab is name yellow b";
        String[] words = str.split(" ");
        String s = "is";
        System.out.println(ws.countFrequencies(words, s) );
    }
}
