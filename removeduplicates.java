public class removeduplicates {

    public static void RemoveDuplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        //work
        char currchar = str.charAt(idx);
        if(map[currchar - 'a' ] == true){
            RemoveDuplicate(str, idx+1, newstr,map);
        }else{
            map[currchar - 'a'] = true;
            RemoveDuplicate(str, idx+1, newstr.append(currchar), map);
        }
    }

    public static void main(String args[]){
        String str= "appnnacollege";
        RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
    
}
