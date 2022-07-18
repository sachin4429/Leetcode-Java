class Solution {
    public int countValidWords(String sentence) {
        int count = 0;
        String str[] = sentence.split(" ");
        for(String s : str)
        {
            if(s=="")
                continue;
            char[] arr = s.toCharArray();
            int punc = 0, hifen = 0;
            boolean falg  = false;
            for(int i = 0; i<arr.length; i++)
            {
                char ch = arr[i];
                if(ch == '!' || ch == '.' || ch == ',')
                {
                    punc++;
                    if(i != arr.length-1)
                        falg = true;
                    else if(i == 0 && arr.length != 1)
                        falg = true;
                    else if(punc > 1)
                        falg = true;
                }
                if(Character.isDigit(ch))
                    falg = true;
                if(ch == '-')
                {
                    hifen++;
                    if(i == 0)
                        falg = true;
                    else if(i == arr.length-1)
                        falg = true;
                    else if(hifen > 1)
                        falg = true;
                    else if(arr.length<3 ||!Character.isLowerCase(arr[i-1]) || !Character.isLowerCase(arr[i+1]))
                        falg = true;
                }
            }
            if(falg == false)
                count++;
        }
        return count;
    }
}