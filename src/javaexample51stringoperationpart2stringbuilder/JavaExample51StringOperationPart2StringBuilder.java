
package javaexample51stringoperationpart2stringbuilder;


public class JavaExample51StringOperationPart2StringBuilder {

    // using StringBuilder
    // append two strings
    
    public static void main(String[] args) {
        
        
        StringBuilder sb1=new StringBuilder("hi, i am here!!!!");
        StringBuilder sb2=new StringBuilder("###ADD###");
        
        String str="...just...";
        
        System.out.println("first: "+sb1);
        System.out.println("sb1 capacity is: "+sb1.capacity());
        System.out.println("sb1 length is: "+sb1.length());
        System.out.println("---");
        System.out.println("second: "+sb1.append(str));
        System.out.println("sb1 capacity is: "+sb1.capacity());
        System.out.println("sb1 length is: "+sb1.length());
        System.out.println("---");
        System.out.println("third: "+sb1.append(sb2));                
        System.out.println("sb1 capacity is: "+sb1.capacity());
        System.out.println("sb1 length is: "+sb1.length());
        System.out.println("---");

        
        
        
    }
    
}
