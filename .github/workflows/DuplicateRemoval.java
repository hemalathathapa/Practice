String removeDups(String s) {
        // code here
        StringBuilder str=new StringBuilder();
        List<Character> ls=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(!ls.contains(s.charAt(i)))
            {
                ls.add(s.charAt(i));
            }
        }
        for(char ch:ls)
        {
            str.append(ch);
        }
        return str.toString();
    }
