public class sparseSearch {


    public int findSparseString(String[] words, String str, int first, int last) {
        if(first  > last) {
            return -1;
        }
        int mid = (first + last)/2;
        if(words[mid].isEmpty()) {
            int left = mid - 1;
            int right = mid + 1;
            while(true) {
                if(left < first && right > last) {
                    return  -1;
                }else if(right <= last && !words[right].isEmpty()) {
                    mid = right;
                    break;
                }else if(left >= first && !words[left].isEmpty()) {
                    mid = left;
                    break;
                }
                right++;
                left++;
            }
        }
        if(str.equals(words[mid])) {
            return mid;
        }else if(words[mid].compareTo(str) < 0) {
            return findSparseString(words,str, mid + 1, last);
        }else {
            return findSparseString(words, str, first, mid - 1);
        }

    }

    public static void main(String[] args) {
        sparseSearch ss = new sparseSearch();
        String[] words = new String[] {"at","","","","ball","","","cat","","","dad","",""};

        System.out.println(ss.findSparseString(words, "ball", 0,13 ));
    }
}
