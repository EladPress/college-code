import java.util.Arrays;


public class Library {
public static void main(String[] args) {
	Book[] arr={new ScienceFiction(200,"Star Treck"),new Novel(150,"Oliver Twist"),new Thriller(325,"The Black Cat")};

    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++)
    	System.out.println(arr[i]);
    
    

    int i=(int)(Math.random()*arr.length);
    Book b=arr[i];

    try{
    	b.read(200);
    	}catch(TooManyPages ex){
    		System.out.println(ex);
    	}
    	System.out.println();
    	System.out.println(b);
	}
}
