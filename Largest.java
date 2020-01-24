import java.util.*; 
  
class Largest 
{ 
    static int Largest(String str) 
    { 
    int n = str.length(); 
    int res = 0, curr_len = 0; 
    for (int i = 0; i < n; i++) 
    { 
         
        if (str.charAt(i) != ' ') 
            curr_len++; 
  
        else
        { 
            res = Math.max(res, curr_len); 
            curr_len = 0; 
        } 
    } 
  
    return Math.max(res, curr_len); 
    } 
  
    public static void main(String[] args) 
    { 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine(); ; 
        System.out.println(Largest(s)); 
    } 
}