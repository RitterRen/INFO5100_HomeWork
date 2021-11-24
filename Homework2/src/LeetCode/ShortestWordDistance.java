package LeetCode;

public class ShortestWordDistance {
    public static int solution(String[] wordsDict, String word1, String word2) {
        //Double Pointer
        int path = Integer.MAX_VALUE;
        for ( int i = 0; i < wordsDict.length; i++ ) {
            if ( wordsDict[i] == word1 ) {
                int left = i, right = i;
                while ( left > -1 ) {
                    if ( wordsDict[left] == word2 ) {
                        if ( i - left < path ) {
                            path = i - left;
                        }
                    }
                    left--;
                }
                while ( right < wordsDict.length ) {
                    if ( wordsDict[right] == word2 ) {
                        if ( right - i < path ) {
                            path = right - i;
                        }
                    }
                    right++;
                }
                break;
            }
        }
        return path;
    }
}
