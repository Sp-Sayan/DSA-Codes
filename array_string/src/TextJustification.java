import java.util.ArrayList;

public class TextJustification {

    public static void main(String[] args) {
        String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        fullJustify(words,20);
    }

    public static void fullJustify(String[] words, int maxWidth) {

        ArrayList<String> myList = new ArrayList<>();
        int start=0,end=0,remWidth=0;

        String newWord = "";
        for(int i =0;i<words.length;i++){
            remWidth = maxWidth - remWidth;
            if(remWidth < words[i].length()){
                myList.add(justify(words,newWord,maxWidth,start,end-1,false));
                start = end;
                remWidth = 0;
                newWord = "";

            }
            newWord = (newWord +" "+ words[i]).trim();
            remWidth = newWord.length();
            if(i == words.length-1){        //for the last element if left
                myList.add(justify(words,newWord,maxWidth,start,words.length-1,true));
            }


            end++;
        }

    }

    public static String justify(String[] words,String newWord,int maxWidth,int start,int end,boolean isLast){
        System.out.println(start + " "+ end + " "+newWord);
        String justifyWord = "";
        //int gapPerSpaces = (maxWidth-newWord.length())/(newWord.split(" ").length - 1);
        //System.out.println(gapPerSpaces);
        if(isLast){
            justifyWord = newWord;
            for(int i = 1;i<=maxWidth-newWord.length();i++)
                justifyWord += " ";
        }
        else if(start == end){
            justifyWord = newWord;
            for(int i = 1;i<=maxWidth-newWord.length();i++)
                justifyWord += " ";
        }
        else{
            int remWidth =maxWidth-newWord.length();
            int gapPerSpaces = remWidth/(newWord.split(" ").length - 1);
            int leftPosSpace = remWidth%(newWord.split(" ").length - 1);
            System.out.println(gapPerSpaces);
            for(int i = start;i<=end;i++){
                justifyWord+=words[i];

                if(i == start){
                    for(int j = 1;j<=gapPerSpaces;j++)
                        justifyWord+= " ";
                    for(int j = 1;j<=leftPosSpace;j++)
                        justifyWord+= " ";
                    justifyWord += " ";
                }
                else if(i == end)
                    break;
                else{
                    for(int j = 1;j<=gapPerSpaces;j++)
                        justifyWord+= " ";

                    justifyWord += " ";
                }

            }
        }
        System.out.println(justifyWord);
        return "";
    }
}
