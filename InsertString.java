package com.ematrix;

public class InsertString {

    public String transformString(char[] S){
        StringBuilder result=new StringBuilder();
        for(int i =0;i<S.length;i++){
            if(S[i] == ' ')
            {
                result.append("%20");
                continue;
            }
            result.append(S[i]);
        }
        return result.toString();
    }


    public void transformStringTwo(char[] str,int truelength){

        int spaceCount = 0;
        int index;
        int i = 0;
        for(i =0;i<truelength;i++){
            if(str[i] == ' ')
            {
                spaceCount++;
                continue;
            }
        }
        index = truelength + spaceCount * 2;
        if (truelength < str.length) str[truelength]='\0';
        for (i = truelength - 1; i >= 0; i-- ) {
                if (str[i] == ' ') {
                    str[index-1] ='0';
                    str[index - 2] = '2';
                    str[index - 3] = '%';
                    index = index - 3;
                } else {
                    str[index - 1] = str[i];
                    index--;
                    }
            }

    }
    public static void main(String[] args){
        char[] str = "Mr John Smith ".toCharArray();
        InsertString  insertString  =new InsertString ();
        String result=insertString.transformString ("Mr John Smith".toCharArray());

        insertString.transformStringTwo(str,13);

        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
    }
}
