import java.util.*;
 class StringConcatenantion {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        sc.close();
        s=(s.concat(t)).replace(" ","");
        Set<Character> c=new HashSet<>();
        for(int i=0;i<s.length();i++){
            c.add(s.charAt(i));
        }
        ArrayList<Character> a=new ArrayList<>(c);
       Collections.sort(a);
       Collections.reverse(a);
        StringBuilder st=new StringBuilder();
        for(char ch:a){
            st.append(ch);
        }
        
        System.out.println(st);
    }
}
