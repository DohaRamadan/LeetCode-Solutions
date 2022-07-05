class Solution {
    public String reverseWords(String s) {
        String[] splittedString = s.split(" ");
        String result ="";
        ArrayList<String> resultArray = new ArrayList<>();
        for(String str : splittedString){
            String reversedString= "";
            int i=0;
            int j= str.length() - 1;
            while(i < str.length()){
                reversedString += str.charAt(j);
                i++;
                j--;
            }
            resultArray.add(reversedString);
        }
        for(int i=0; i<resultArray.size(); i++){
            if(i == resultArray.size() - 1)
                result+= resultArray.get(i) ;
            else
                result += (resultArray.get(i) + " ");
        }
        return result;
    }
}
